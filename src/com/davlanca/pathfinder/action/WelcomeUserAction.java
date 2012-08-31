package com.davlanca.pathfinder.action;

import com.davlanca.pathfinder.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class WelcomeUserAction extends ActionSupport implements ModelDriven<User> {

	User user = new User();
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		
		return SUCCESS;

	}
	
	public String add() {
		System.out.println("Action: user added");
		return SUCCESS;
	}
	
	public String update() {
		System.out.println("Action: user updated");
		return SUCCESS;
	}
	
	public String delete() {
		System.out.println("Action: user deleted");
		return SUCCESS;
	}
	
	
	@Override
	public void validate(){
		if (getUser().getUserName().length() == 0 ){
			addFieldError( "userName", "Username is required.");
		}
	}
	
	@Override
	public User getModel() {
		return user;
	}
}