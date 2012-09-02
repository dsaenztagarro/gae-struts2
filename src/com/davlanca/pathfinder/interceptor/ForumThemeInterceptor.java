package com.davlanca.pathfinder.interceptor;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.davlanca.pathfinder.model.ForumTheme;
import com.davlanca.pathfinder.service.ForumService;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class ForumThemeInterceptor implements Interceptor { //extends AbstractInterceptor implements StrutsStatics {
	
	@Autowired
	ForumService forumService;
	
	
	/**
	 * @return the forumService
	 */
	public ForumService getForumService() {
		return forumService;
	}

	/**
	 * @param forumService the forumService to set
	 */
	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String action = invocation.getAction().toString();
		HashMap parameters = (HashMap)invocation.getInvocationContext().getParameters();
		
		HashMap<String,Object>propList = new HashMap();
		propList.put("name","test");
		System.out.println("forumService: " + getForumService());
		List<ForumTheme> list = getForumService().findyForumThemeBy(propList);
		System.out.println("list: " + list);
		System.out.println("list.size: " + list!=null? list.size() : -1);
		System.out.println("username: " + parameters.get("name").toString());

		String result = invocation.invoke();
		return result;
	}
	
}