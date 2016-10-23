package com.yash.registery;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.yash.provider.FileDownloadService;
import com.yash.provider.FileUploadService;
import com.yash.provider.RestServiceProvider;

public class RestApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RestApplication() {
		singletons.add(new FileUploadService());
		singletons.add(new RestServiceProvider());
		singletons.add(new FileDownloadService());

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
