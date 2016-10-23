package com.yash.restservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

import com.yash.bean.Item;
import com.yash.bean.ItemList;

@Path("/itemService")
@Produces("application/xml")
@Consumes("application/xml")
public class RestServiceXmlBasedProvider {

	@AddLinks
	@Path("/getItem/{itemId}")
	@GET
	public Item getItem(@PathParam("{itemId}") String id) {
		return new Item("LGTV", "black", "good Tv", 101);

	}

	@AddLinks
	@Path("/allItems")
	@GET
	public List<Item> getItemList() {
		List<Item> listItem = new ArrayList<Item>();

		Item it = new Item("LGTV", "black", "good Tv", 101);
		Item it1 = new Item("panasonic tv", "red", "better  Tv", 102);
		Item it2 = new Item("micromaxTV", "grey", "smart Tv", 103);
		Item it3 = new Item("konark TV", "blue", "old weighted Tv", 104);

		listItem.add(it3);
		listItem.add(it1);
		listItem.add(it2);
		listItem.add(it);

		return listItem;

	}

	@AddLinks
	@LinkResource(value = Item.class)
	@Path("/insertItem/")
	@POST
	public Response insertItem(Item it) {
		// return new Item("LGTV", "black", "good Tv", 101);
		return Response.status(200).entity(it).build();
	}

	@AddLinks
	@LinkResource(value = ItemList.class)
	@Path("/insertListItem")
	@POST
	public Response insertListItem(List<Item> listItem) {
		/*
		 * List<Item> listItem = new ArrayList<Item>();
		 * 
		 * Item it = new Item("LGTV", "black", "good Tv", 101); Item it1 = new
		 * Item("panasonic tv", "red", "better  Tv", 102); Item it2 = new
		 * Item("micromaxTV", "grey", "smart Tv", 103); Item it3 = new
		 * Item("konark TV", "blue", "old weighted Tv", 104);
		 * 
		 * listItem.add(it3); listItem.add(it1); listItem.add(it2);
		 * listItem.add(it);
		 */

		 return Response.status(200).entity(listItem).build();

	}

}
