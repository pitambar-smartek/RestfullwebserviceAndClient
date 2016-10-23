package com.pita.encodeObject;

import org.json.simple.JSONArray;

public class JSONArrayDemo {

	public static void main(String[] args) {
		JSONArray array=new JSONArray();
		
		array.add("pitambar");
		array.add("prabhat");
		array.add("ankita");
		array.add("Amit");
		array.add("Niharika");
		array.add("Hezal");
		
		System.out.println("The JSON array="+array);
		

	}

}
