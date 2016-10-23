package com.yash.restservice;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class RestEasyWebFormProvider {

	@Path("/resources/service")
	@POST
	public Response addName(@FormParam("firstname") String first, @FormParam("lastname") String last) {
		String re = "first name=" + first + " last name=" + last;

		return Response.status(200).entity(re).build();
	   }

}
