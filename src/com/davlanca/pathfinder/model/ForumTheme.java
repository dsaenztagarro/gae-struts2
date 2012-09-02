package com.davlanca.pathfinder.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@SuppressWarnings("serial")
public class ForumTheme implements Serializable {

	private String description;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long forumThemeId;
	private String name;

	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the forumThemeId
	 */
	public Long getForumThemeId() {
		return forumThemeId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param forumThemeId the forumThemeId to set
	 */
	public void setForumThemeId(Long forumThemeId) {
		this.forumThemeId = forumThemeId;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}