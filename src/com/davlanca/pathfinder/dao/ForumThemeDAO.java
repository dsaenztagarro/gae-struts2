package com.davlanca.pathfinder.dao;

import java.util.List;

import com.davlanca.pathfinder.model.ForumTheme;


public interface ForumThemeDAO extends GenericDAO<ForumTheme> {

	public List<ForumTheme> findAll();
}
