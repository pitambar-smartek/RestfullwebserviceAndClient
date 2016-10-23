package com.yash.provider;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/service")
public class RestEasyProvider {

	@GET
	@PermitAll
	@RolesAllowed({ "supervisor", "admin" })
	@Path("/{msg}/{msgOne}")
	public Response showMessage(@PathParam("msg") String message,
			@PathParam("msgOne") String tutorialName) {
		// http://localhost:8084/RestFullWebservice_using_restEasy/rest/services/rest/Pitambar/RestFullWebservice
		// //Please Hit this url to get output
		String greetings = "****Hello " + message + " Welcome to "
				+ tutorialName + " World*****";
		return Response.status(200).entity(greetings).build();

	}

	@GET
	@Path("/getQuery")
	public Response getQueryStringFromUrl(@QueryParam("name") String name,
			@QueryParam("tutorialName") String tName) {
		System.out.println("msg is received");
		String greetings = "Hello " + name + "Weblocme to " + tName;
		return Response.status(200).entity(greetings).build();
	}

}
