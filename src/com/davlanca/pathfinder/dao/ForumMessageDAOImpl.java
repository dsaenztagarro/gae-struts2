package com.davlanca.pathfinder.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.davlanca.pathfinder.model.ForumMessage;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;

@Component
@SuppressWarnings("serial")
public class ForumMessageDAOImpl extends GenericDAOImpl implements ForumMessageDAO {

	private static final Logger log = Logger.getLogger(ForumMessageDAOImpl.class.getName());

	public ForumMessageDAOImpl() {
	}

	@Override
	public void create(ForumMessage forumMessage) throws Exception {
		if (forumMessage != null) {
			ObjectifyService.register(ForumMessage.class);
			Objectify ofy = ObjectifyService.begin();
			
			ofy.put(forumMessage);
		} else {
			throw new Exception("You can't create a null forumMessage");
		}
	}

	@Override
	public boolean update(ForumMessage forumMessage) {

		if (forumMessage == null)
			return false;

		ObjectifyService.register(ForumMessage.class);
		Objectify ofy = ObjectifyService.begin();

		boolean thisAccountAlreadyExist = ofy.query(ForumMessage.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(forumMessage);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(ForumMessage forumMessage) {
		ObjectifyService.register(ForumMessage.class);
		Objectify ofy = ObjectifyService.begin();
		
		ofy.delete(forumMessage);
		return true;
	}

	@Override
	public List<ForumMessage> findAll() {
		ObjectifyService.register(ForumMessage.class);
		Objectify ofy = ObjectifyService.begin();

		Query<ForumMessage> q = ofy.query(ForumMessage.class);
		ArrayList<ForumMessage> forumMessages = (ArrayList<ForumMessage>) q.list();

		return forumMessages;
	}
	
	@Override
    public List<ForumMessage> findBy(HashMap<String,Object> propList) {
		ObjectifyService.register(ForumMessage.class);
		Objectify ofy = ObjectifyService.begin();
    	
    	Query<ForumMessage> q = ofy.query(ForumMessage.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public ForumMessage getByProperty(String propName, Object propValue) {
		ObjectifyService.register(ForumMessage.class);
		Objectify ofy = ObjectifyService.begin();
    	
    	Query<ForumMessage> q = ofy.query(ForumMessage.class);
    	q.filter(propName, propValue);

    	ForumMessage obj = q.get();
    	return obj;
    }
	
}