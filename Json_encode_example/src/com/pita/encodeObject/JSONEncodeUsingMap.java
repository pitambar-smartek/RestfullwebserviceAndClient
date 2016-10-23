package com.pita.encodeObject;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JSONEncodeUsingMap {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("name", "Pitambar Mohanty");
		map.put("Age", 27);
		map.put("gender", "Male");
		map.put("Address", "Bishnuchakra,Ballipadar,Ganjam,Odisha");
		map.put("fathername", "Ramesh Chandra mohanty");
		String jsonValue=JSONValue.toJSONString(map);
		System.out.println("The json value="+jsonValue);
		

	}

}
