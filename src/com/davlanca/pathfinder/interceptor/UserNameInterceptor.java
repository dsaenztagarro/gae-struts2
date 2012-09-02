package com.davlanca.pathfinder.interceptor;

import java.util.HashMap;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class UserNameInterceptor implements Interceptor {

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
		
		System.out.println("username: " + parameters.get("userName").toString());
		
		String result = invocation.invoke();
		return result;
	}
	
}