package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;
import provided.util.DaoBase;

public class ProjectService extends DaoBase{
	
	private static ProjectDao projectDao = new ProjectDao();

	public static Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
	

}
