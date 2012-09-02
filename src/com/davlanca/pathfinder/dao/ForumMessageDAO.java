package com.davlanca.pathfinder.dao;

import java.util.List;

import com.davlanca.pathfinder.model.ForumMessage;


public interface ForumMessageDAO extends GenericDAO<ForumMessage> {

	public List<ForumMessage> findAll();
}
