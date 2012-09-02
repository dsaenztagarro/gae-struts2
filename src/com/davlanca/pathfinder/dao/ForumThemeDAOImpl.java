package com.davlanca.pathfinder.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.davlanca.pathfinder.model.ForumTheme;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;

@Component
@SuppressWarnings("serial")
public class ForumThemeDAOImpl extends GenericDAOImpl implements ForumThemeDAO {

	private static final Logger log = Logger.getLogger(ForumThemeDAOImpl.class.getName());

	public ForumThemeDAOImpl() {
	}

	@Override
	public void create(ForumTheme forumTheme) throws Exception {
		if (forumTheme != null) {
			try {
				ObjectifyService.register(ForumTheme.class);
			} catch(Exception e) {
				//do nothing
			}
			Objectify ofy = ObjectifyService.begin();
			
			ofy.put(forumTheme);
		} else {
			throw new Exception("You can't create a null forumTheme");
		}
	}

	@Override
	public boolean update(ForumTheme forumTheme) {

		if (forumTheme == null)
			return false;

		try {
			ObjectifyService.register(ForumTheme.class);
		} catch(Exception e) {
			//do nothing
		}
		ObjectifyService.register(ForumTheme.class);
		Objectify ofy = ObjectifyService.begin();

		boolean thisAccountAlreadyExist = ofy.query(ForumTheme.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(forumTheme);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(ForumTheme forumTheme) {
		ObjectifyService.register(ForumTheme.class);
		Objectify ofy = ObjectifyService.begin();
		
		ofy.delete(forumTheme);
		return true;
	}

	@Override
	public List<ForumTheme> findAll() {
		ObjectifyService.register(ForumTheme.class);
		Objectify ofy = ObjectifyService.begin();

		Query<ForumTheme> q = ofy.query(ForumTheme.class);
		ArrayList<ForumTheme> forumThemes = (ArrayList<ForumTheme>) q.list();

		return forumThemes;
	}
	
	@Override
    public List<ForumTheme> findBy(HashMap<String,Object> propList) {
		try {
			ObjectifyService.register(ForumTheme.class);
		} catch (Exception e) {
			//do nothing
		}
		Objectify ofy = ObjectifyService.begin();
    	
    	Query<ForumTheme> q = ofy.query(ForumTheme.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public ForumTheme getByProperty(String propName, Object propValue) {
		ObjectifyService.register(ForumTheme.class);
		Objectify ofy = ObjectifyService.begin();
    	
    	Query<ForumTheme> q = ofy.query(ForumTheme.class);
    	q.filter(propName, propValue);

    	ForumTheme obj = q.get();
    	return obj;
    }
	
}