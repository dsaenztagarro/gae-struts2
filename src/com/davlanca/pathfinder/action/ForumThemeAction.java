package com.davlanca.pathfinder.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.davlanca.pathfinder.model.ForumTheme;
import com.davlanca.pathfinder.service.ForumService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ForumThemeAction extends ActionSupport implements ModelDriven<ForumTheme> {

	@Autowired
	ForumService forumService;
	ForumTheme forumTheme = new ForumTheme();
	

	/**
	 * @return the forumService
	 */
	public ForumService getForumService() {
		return forumService;
	}

	/**
	 * @return the forumTheme
	 */
	public ForumTheme getForumTheme() {
		return forumTheme;
	}

	/**
	 * @param forumService the forumService to set
	 */
	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}

	/**
	 * @param forumTheme the forumTheme to set
	 */
	public void setForumTheme(ForumTheme forumTheme) {
		this.forumTheme = forumTheme;
	}

	public String execute() {
		
		return "success";

	}

	public String add() {
		System.out.println("forumService: " + getForumService());
		System.out.println("add method");
		getForumService().addForumTheme(getModel());
		return "success";
	}
	
	public String update() {
		//forumService.addForumTheme(forumTheme);
		System.out.println("update method");
		return "success";
	}

	public String delete() {
		//forumService.addForumTheme(forumTheme);
		System.out.println("delete method");
		return "success";
	}
	
	@Override
	public ForumTheme getModel() {
		return forumTheme;
	}
	
}