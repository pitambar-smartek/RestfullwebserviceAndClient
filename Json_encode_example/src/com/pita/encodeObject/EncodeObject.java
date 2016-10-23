package com.pita.encodeObject;

import org.json.simple.JSONObject;

public class EncodeObject {

	public static void main(String[] args) {
		JSONObject object=new JSONObject();
		object.put("pitambar", "odisha");
		object.put("prabhat", "Utarakhanda");
		object.put("Amit", "jharakhand");
		object.put("Niharika", "Hariyana");
		object.put("Hezal", "Maharastra");
		
		System.out.println("The Json object="+object);

	}

}
