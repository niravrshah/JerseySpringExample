/**
 * 
 */
package com.shah.java.reference.service.ws.entity;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.shah.java.entity.Parent;
import com.sun.jersey.api.client.ClientResponse.Status;

/**
 * @author Nirav Shah 
 * 
 */
@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("referenceservice")
public class ReferenceEntityServiceImpl implements ReferenceEntityService {

	private static Logger logger = LoggerFactory.getLogger(ReferenceEntityServiceImpl.class);

	@POST
	@Path("save/parent")
	public Response saveParent(Parent entity) {
		logger.info("About to save the Parent entity = " + entity);
		return Response.status(Status.CREATED).entity(entity).status(200).build();
	}

	/**
	 * 
	 * @param sourceName
	 *            - return the source name
	 * @return return the source name
	 */
	@GET
	@Path("sources/{sourceid}")
	public String getSourceName(@PathParam("sourceid") Long sourceId) {
		return "You requested source name as " + getSourceNameFromMap(sourceId);
	}

	/**
	 * 
	 * @param sourceName
	 *            - return the source name
	 * @return return the source name
	 */
	@SuppressWarnings("unchecked")
	@GET
	@Path("sources")
	public Map<Long, String> getAllSources() {
		return getAllSourcesMap();
	}

	/**
	 * 
	 * @param sourceId
	 * @return
	 */
	@GET
	@Path("sources/sourcename/{sourcename}")
	public Object getSourceByName(@PathParam("sourcename") String sourceName) {
		return getAllSourcesMap().getKey(sourceName);
	}

	/**
	 * @return
	 */
	private String getSourceNameFromMap(Long srcId) {
		@SuppressWarnings("unchecked")
		Map<Long, String> srcMap = getAllSourcesMap();
		return srcMap.get(srcId);
	}

	/**
	 * @return
	 */
	private BidiMap getAllSourcesMap() {
		BidiMap srcMap = new DualHashBidiMap();
		srcMap.put(Long.valueOf(1), "Java");
		srcMap.put(Long.valueOf(2), "Jersey Rest");
		srcMap.put(Long.valueOf(3), "Spring");
		srcMap.put(Long.valueOf(4), "Big Data");
		return srcMap;
	}

	@Override
	public Response save(Parent entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response save(Iterable<Parent> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response delete(Parent entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response delete(Iterable<? extends Parent> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}