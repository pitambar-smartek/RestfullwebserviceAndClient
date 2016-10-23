package com.yash.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/service")
 public class RestServiceProvider {
	@GET
	@Path("/{msg}/{msgOne}")
	public Response showMessage(@PathParam("msg") String message,
			@PathParam("msgOne") String tutorialName) {
		// http://localhost:8084/RestFullWebservice_using_restEasy/rest/services/rest/Pitambar/RestFullWebservice
		// //Please Hit this url to get output
		String greetings = "Hello " + message + "Weblocme to " + tutorialName;
		return Response.status(200).entity(greetings).build();

	}
}