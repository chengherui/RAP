package com.baidu.rigel.rap.project.dao;

import java.util.List;

import com.baidu.rigel.rap.account.bo.User;
import com.baidu.rigel.rap.project.bo.Action;
import com.baidu.rigel.rap.project.bo.Module;
import com.baidu.rigel.rap.project.bo.Page;
import com.baidu.rigel.rap.project.bo.Project;

public interface ProjectDao {

	/**
	 * get project list
	 * @param user
	 * @param curPageNum
	 * @param pageSize
	 * @return
	 */
	List<Project> getProjectList(User user, int curPageNum, int pageSize);

	/**
	 * get new project
	 * @param project
	 * @return always 0
	 */
	int addProject(Project project);

	/**
	 * update project
	 * @param id
	 * @param projectData
	 * @param deletedObjectListData
	 * @return
	 */
	String updateProject(int id, String projectData,
			String deletedObjectListData);

	/**
	 * update project
	 * @param project
	 * @return
	 */
	int updateProject(Project project);

	/**
	 * remove project
	 * @param id
	 * @return
	 */
	int removeProject(int id);

	/**
	 * get project
	 * @param id
	 * @return
	 */
	Project getProject(int id);

	/**
	 * get module
	 * @param id
	 * @return
	 */
	Module getModule(int id);

	/**
	 * get page
	 * @param id
	 * @return
	 */
	Page getPage(int id);
	
	
	/**
	 * get action
	 * @param id
	 * @return
	 */
	Action getAction(int id);

	/**
	 * save project
	 * @param project
	 * @return
	 */
	int saveProject(Project project);

	/**
	 * get project list number
	 * @param user
	 * @return
	 */
	long getProjectListNum(User user);

	/**
	 * get matched action list based on URL pattern
	 * 
	 * @param projectId
	 * @param pattern
	 * @return
	 */
	List<Action> getMatchedActionList(int projectId, String pattern);
	
	/**
	 * clear all mock data of objects in specified project
	 * @param projectId project id
	 * @return affected rows num
	 */
	public int resetMockData(int projectId);
}
