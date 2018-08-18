package com.portal.service;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.portal.facade.Encryption;

@Path("/GenResult")
public class GenResult {

	Encryption en = new Encryption("Ritesh");
	
@GET
@Path("/encrypt/{id}")
public Response getGenresult(@PathParam("id") String id) {
	
	return Response.status(200).entity("Encrypted Value: "+en.encrypt(id)).build();
	
}

@GET
@Path("/decrypt/{id}")
public Response getGenDecyptedresult(@PathParam("id") String id) {
	
	return Response.status(200).entity("Decrypted value: "+en.decrypt(id)).build();
}

}
