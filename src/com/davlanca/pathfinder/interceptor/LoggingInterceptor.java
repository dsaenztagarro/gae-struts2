package com.davlanca.pathfinder.interceptor;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class LoggingInterceptor implements Interceptor {

	private static final Logger log = Logger.getLogger(LoggingInterceptor.class.getName());
	
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
		Object action = invocation.getAction();
		String actionClass = ((ActionSupport)action).getClass().toString();
		log.info(actionClass + " - BEGIN");
		
		String result = invocation.invoke();
		
		log.info(actionClass + " - END");
		return result;
	}
	
}