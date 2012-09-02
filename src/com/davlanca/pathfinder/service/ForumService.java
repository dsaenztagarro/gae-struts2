package com.davlanca.pathfinder.service;

import java.util.HashMap;
import java.util.List;

import com.davlanca.pathfinder.model.ForumMessage;
import com.davlanca.pathfinder.model.ForumTheme;

public interface ForumService {

	public void addForumTheme(ForumTheme forumTheme);
	public List<ForumTheme> findyForumThemeBy(HashMap<String,Object> criteria);
	public void addForumMessage(ForumMessage forumMessage);
	
}
