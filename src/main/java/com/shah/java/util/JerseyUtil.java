/**
 * 
 */
package com.shah.java.util;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * Common Jersey Util to provide the low level of common Jersey Client utilities
 * 
 * @author Nirav Shah 
 * 
 */
public final class JerseyUtil {

	/**
	 * 
	 */
	private JerseyUtil() {
	}

	/**
	 * Returns the new {@link Client} instance with
	 * {@link JSONConfiguration.FEATURE_POJO_MAPPING} enabled
	 * 
	 * @return {@link Client}
	 */
	public static Client getNewJerseyClient() {
		ClientConfig clientConfig = new DefaultClientConfig();
		return Client.create(clientConfig);
	}

	/**
	 * The builder for building a ClientRequest instance and handling the
	 * request using the UniformInterface.
	 * 
	 * @param rsrc
	 * 
	 *            {@link WebResource}
	 * @return {@link WebResource.Builder}
	 */
	public static Builder getJsonRequestBuilder(WebResource rsrc) {
		return rsrc.type(MediaType.APPLICATION_JSON).accept(
				MediaType.APPLICATION_JSON);
	}

	/**
	 * The builder for building a ClientRequest instance and handling the
	 * request using the UniformInterface.
	 * 
	 * @param uri
	 *            - String URI
	 * @return {@link WebResource.Builder}
	 */
	public static Builder getJsonRequestBuilder(String uri) {
		return getJsonRequestBuilder(buildWebResource(uri));
	}

	/**
	 * The {@link WebResource} instance built from the Jersey Client
	 * 
	 * @param uri
	 *            - String URI
	 * @return {@link WebResource.Builder}
	 */
	public static WebResource buildWebResource(String uri) {
		return getNewJerseyClient().resource(uri);
	}

}
