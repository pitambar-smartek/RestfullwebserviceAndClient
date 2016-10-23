package com.pita.encodeObject;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

public class JSONArrayEncodeUsingList {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("pitambar");
		list.add("damodar");
		list.add("krishna");
		list.add("Bishnu");
		list.add("ramesh");
		list.add("pratima");
		
		String stringList=JSONValue.toJSONString(list);
		System.out.println("java list to json data="+list);
		

	}

}
