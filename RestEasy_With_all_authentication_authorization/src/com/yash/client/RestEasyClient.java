package com.yash.client;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class RestEasyClient {

	public static void main(String[] args) {
		ResteasyClient restClient = new ResteasyClientBuilder().build();

		ResteasyWebTarget target = restClient
				.target("http://localhost:8084/RestEasy_With_Basic_authentication_authorization/rest/service/pitambar/restfullwebservices");

		String userPassword = "tomcat:admin";
		String encoding = new sun.misc.BASE64Encoder().encode(userPassword
				.getBytes());
		/*
		 * Response res = target.request() .header("Authorization", "Basic" +
		 * encoding).get(); System.out.println("The response code=" +
		 * res.getStatus());
		 */

		MultivaluedMap<String, Object> headersValue = new MultivaluedHashMap<String, Object>();
		headersValue.add("Authorization", "Basic" + encoding);
		headersValue.add("roles", "admin");

		Response res = target.request().headers(headersValue).get();
		System.out.println(res.getStatus());

	}
}
