package com.yash.restservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

import com.yash.bean.Employee;

//@Produces({"application/xml", "application/json"})
@Path("/rest")
public class RestServiceProvider {
	/*@GET
	@Path("/{msg}/{msgOne}")
	public Response showMessage(@PathParam("msg") String message,
			@PathParam("msgOne") String tutorialName) {
		// http://localhost:8084/RestFullWebservice_using_restEasy/rest/services/rest/Pitambar/RestFullWebservice
		// //Please Hit this url to get output
		String greetings = "Hello " + message + "Weblocme to " + tutorialName;
		return Response.status(200).entity(greetings).build();

	}*/

	@GET
	@Path("/getQuery")
	public String getQueryStringFromUrl(@QueryParam("name") String name,
			@QueryParam("tutorialName") String tName) {
		System.out.println("msg is received");
		String greetings = "Hello " + name + " Welcome to " + tName;
		return greetings;
	}

	@AddLinks
	@LinkResource(value = Employee.class)
	@Path("/insertEmp")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response insertEmployeeData(Employee e) {

		// System.out.println("The Employee details="+e);
		String output = e.toString();
		return Response.status(200).entity(output).build();

	}

	@AddLinks
	@LinkResource(value = Employee.class)
	@Path("/getListEmp/{deptNo}")
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Response insertEmployeeData(@PathParam("deptNo") String  departmentNo) {

		// public Employee(String name, String address, int age, long salary,
		// String id) {
		List<Employee> emplist = new ArrayList();
		Employee emp = new Employee("pita", "bopodi", 27, 52000, "1004580");
		Employee empOne = new Employee("Ajaya", "Dangechowk", 29, 43000,
				"104541");
		Employee empTwo = new Employee("Manoj", "Yerwada", 32, 145000,
				"1004581");
		emplist.add(emp);
		emplist.add(empOne);
		emplist.add(empTwo);

		return Response.status(200).entity(emplist).build();

	}
}
