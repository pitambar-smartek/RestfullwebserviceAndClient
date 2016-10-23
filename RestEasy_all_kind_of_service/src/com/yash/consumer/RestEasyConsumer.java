package com.yash.consumer;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.yash.bean.Employee;
import com.yash.bean.Item;

public class RestEasyConsumer {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAddress("Bopodi");
		emp.setAge(28);
		emp.setId("1004580");
		emp.setName("Pitambar Mohanty");
		emp.setSalary(52000);
		ResteasyClient restClient = new ResteasyClientBuilder().build();

		/*ResteasyWebTarget target = restClient
				.target("http://localhost:8084/RestEasy_all_kind_of_service/rest/services/rest/insertEmp");

		Response response = target.request().post(Entity.entity(emp, "application/json"));
		System.out.println(response.getStatus());
		System.out.println(response.getLength());
		System.out.println(response.readEntity(String.class));

		System.out.println(
				"--------------------RestClientResponse from simple String as response------------------------");
  */
		ResteasyWebTarget targetOne = restClient
				.target("http://localhost:8084/RestEasy_all_kind_of_service/rest/services/rest/getListEmp/20");
		Response res = targetOne.request().get();
		List<Employee> listEmp = res.readEntity(new GenericType<List<Employee>>() {
		});

		for (Object o : listEmp) {
			Employee e = (Employee) o;
			System.out.println(e.getId());
		}

		
		
		
		ResteasyWebTarget target = restClient
				.target("http://localhost:8084/RestEasy_all_kind_of_service/rest/services/itemService/insertItem/");
	Item it=new	Item("LGTV", "black", "good Tv", 101);
		Response response = target.request().post(Entity.entity(it,"application/xml"));
		System.out.println("The status="+response.getStatus());
		
		Item reItem=response.readEntity(Item.class);
		System.out.println(reItem);
	}
}
