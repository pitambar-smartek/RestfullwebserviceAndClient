package com.yash.consume;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.yash.bean.Employee;

public class RestEasyConsumer {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAddress("bopodi");
		emp.setAge(28);
		emp.setId(1004580);
		emp.setName("pitambar mohanty");
		emp.setSalary(64000);
		try {

			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client

					.target("http://localhost:8084/RestEasyRestService/rest/services/message/store");

			Response response = target.request().post(Entity.entity(emp, "application/json"));

			if (response.getStatus() != 200) {

				throw new RuntimeException("Failed : HTTP error code : "

						+ response.getStatus());

			}

			System.out.println("Server response : \n");

			// System.out.println(response.readEntity(String.class));

			response.close();

		} catch (Exception e) {

		}

	}
}
