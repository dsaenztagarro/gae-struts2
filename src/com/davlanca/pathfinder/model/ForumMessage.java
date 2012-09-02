package com.davlanca.pathfinder.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@SuppressWarnings("serial")
public class ForumMessage implements Serializable {

	private Date creationDate;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long forumMessageId;
	private Long forumThemeId;
	private String text;
	private Long userId;
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @return the forumMessageId
	 */
	public Long getForumMessageId() {
		return forumMessageId;
	}
	/**
	 * @return the forumThemeId
	 */
	public Long getForumThemeId() {
		return forumThemeId;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @param forumMessageId the forumMessageId to set
	 */
	public void setForumMessageId(Long forumMessageId) {
		this.forumMessageId = forumMessageId;
	}
	/**
	 * @param forumThemeId the forumThemeId to set
	 */
	public void setForumThemeId(Long forumThemeId) {
		this.forumThemeId = forumThemeId;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
		
}