package com.yash.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

import com.yash.bean.Employee;

@Consumes("html/text")
@Path("/message")
public class RestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Welcome to Restful webservice : " + msg;

		return Response.status(200).entity(result).build();

	}

	@AddLinks
	@LinkResource(value = Employee.class)
	@POST
	@Path("/store")
	@Consumes("application/json")
	public void storeEmployee(Employee emp) {
		System.out.println("The emp details=" + emp);

	}

}