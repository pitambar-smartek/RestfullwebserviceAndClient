package com.yash.restservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestDemoApp extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RestDemoApp() {

		singletons.add(new RestServiceProvider());
		singletons.add(new RestServiceXmlBasedProvider());
		singletons.add(new RestEasyWebFormProvider());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
