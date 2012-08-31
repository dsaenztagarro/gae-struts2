package com.davlanca.pathfinder.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class LoggingInterceptor implements Interceptor {

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
		System.out.println(action + " - BEGIN");
		
		String result = invocation.invoke();
		
		System.out.println(action + " - END");
		return result;
	}
	
}