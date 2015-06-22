/**
 * 
 */
package com.shah.java.reference.service.ws.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shah.java.reference.service.ws.entity.Child;
import com.shah.java.reference.service.ws.entity.Parent;
import com.shah.java.util.JerseyUtil;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;

/**
 * Sample Jersey Client that can be refer to use in any client code (like feeder
 * web app) who would like to make a call to any jersey resource
 * 
 * @author Nirav Shah 
 */
@Component
@Path("reference/entityservice/client")
public class ReferenceEntityServiceClient {

	private static Logger logger = LoggerFactory
			.getLogger(ReferenceEntityServiceClient.class);
	
	private final String URI_ROOT = "http://localhost:8080/resid-ws/rs/referenceservice";
	
	
	
	/**
	 * Sample service example
	 */
	@POST
	@Path("save/parent")
	public void saveParentEntity() {
		
		Parent p = new Parent();

		Child c1 = new Child();
		Child c2 = new Child();
		
		c1.setParent(p);
		c2.setParent(p);
		
		List<Child> chldlist = new ArrayList<Child>();
		
		chldlist.add(c1);
		chldlist.add(c2);
		p.setChildList(chldlist);
	
		try {
			// Call the resource builder and POST the request with Parent entity
			ClientResponse response = JerseyUtil.getJsonRequestBuilder(
					JerseyUtil.buildWebResource(URI_ROOT).path("save")
							.path("parent")).post(ClientResponse.class, p);
			
			logger.info("ClientResponse response.getStatus() = "
					+ response.getStatus());
			logger.info("Response.getEntity =  "
					+ response.getEntity(Parent.class));

		} catch (UniformInterfaceException ue) {
			ClientResponse response = ue.getResponse();
			logger.info("Exception while calling the WS " + response);
		}
	}
}