package com.pita.encodeObject;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONDecodeExample {

	public static void main(String[] args) {

    String JsonData="{\"name\":\"Pitambar\",\"salary\":600000.0,\"age\":27}"; 
    Object o=JSONValue.parse(JsonData);
    
    JSONObject jsonObject=(JSONObject)o;
    System.out.println("The Name="+jsonObject.get("name"));
    System.out.println("The salary="+jsonObject.get("salary"));
    System.out.println("The Age="+jsonObject.get("age"));

	}

}
