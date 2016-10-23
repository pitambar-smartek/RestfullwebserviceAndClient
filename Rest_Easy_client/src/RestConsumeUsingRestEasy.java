
public class RestConsumeUsingRestEasy {

	public static void main(String args[]) {

		

		try {

			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client

					.target("http://localhost:9090/RESTEasyJSONExample/rest/jsonServices/send");

			Response response = target.request().post(

					Entity.entity(st, "application/json"));

			if (response.getStatus() != 200) {

				throw new RuntimeException("Failed : HTTP error code : "

						+ response.getStatus());

			}

			System.out.println("Server response : \n");

			System.out.println(response.readEntity(String.class));

			response.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
