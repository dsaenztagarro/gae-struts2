package com.davlanca.pathfinder.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.davlanca.pathfinder.dao.ForumMessageDAO;
import com.davlanca.pathfinder.dao.ForumThemeDAO;
import com.davlanca.pathfinder.model.ForumMessage;
import com.davlanca.pathfinder.model.ForumTheme;

@SuppressWarnings("serial")
public class ForumServiceImpl implements ForumService, Serializable {

	private static final Logger log = Logger.getLogger(ForumServiceImpl.class.getName());
	
	@Autowired 
	private ForumThemeDAO forumThemeDAO;
	@Autowired
	private ForumMessageDAO forumMessageDAO;
	
	@Override
	public void addForumTheme(ForumTheme forumTheme) {
		log.info("ForumTheme added successfully");
		try {
			forumThemeDAO.create(forumTheme);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addForumMessage(ForumMessage forumMessage) {
		log.info("ForumMessage added successfully");
		try {
			forumMessageDAO.create(forumMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<ForumTheme> findyForumThemeBy(HashMap<String,Object> propList) {
		log.info("Find ForumTheme by criteria");
		List<ForumTheme> list = null;
		try {
			list = forumThemeDAO.findBy(propList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}