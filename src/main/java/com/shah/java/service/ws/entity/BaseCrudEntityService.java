package com.shah.java.service.ws.entity;

import javax.ws.rs.core.Response;

import com.shah.java.service.ws.BaseService;
import com.shah.java.service.ws.task.BaseTaskService;
import com.shah.java.service.ws.utility.BaseUtilityService;

/**
 * Central CRUD service interface for the different kind of
 * <code><b><i>CRUD Entity Services</i></b></code> being exposed.
 * <p>
 * <p>
 * Other services extending this interface can selectively expose more specific
 * <code><b><i>CRUD Entity</i></b></code> methods by simply declaring methods of
 * the one which are more specific to the Context of the
 * <code><b><i>Entity Services</i></b></code> functionality being exposed.
 * <p>
 * 
 * All the <code><b>new CRUD Entity Services MUST</b></code> have to extend this
 * interface to get the common behavior across all the <b>Entity Services
 * 
 * @param <R>
 *            - Any class that is a type of {@link Response}
 * @param <E>
 *            - Type of entity for which this Entity Service Belongs
 * @param <ID>
 *            - Id type, could {@link Long}, {@link Integer} etc...
 * 
 * 
 * @see BaseService
 * @see BaseTaskService
 * @see BaseUtilityService
 * @author Nirav Shah 
 */
public interface BaseCrudEntityService<E, ID extends Number, R extends Response>
		extends BaseEntityService {

	/**
	 * Saves a given entity. Use the returned instance for further operations as
	 * the save operation might have changed the entity instance completely.
	 * 
	 * @param entity
	 *            - Entity that needs to be persisted/created
	 * @return R - {@link Response}
	 */
	R save(E entity);

	/**
	 * Saves all given entities.
	 * 
	 * @param entities
	 *            - {@link Iterable} list of entities
	 * @return R - {@link Response}
	 */
	R save(Iterable<E> entities);

	/**
	 * Retrieves an entity by its id.
	 * 
	 * @param id
	 *            - Id type, could {@link Long}, {@link Integer} etc...
	 * @return R - {@link Response}
	 */
	R findOne(ID id);

	/**
	 * Returns all instances of the type.
	 * 
	 * @return R - {@link Response}
	 */
	R findAll();

	/**
	 * Deletes the entity with the given id.
	 * 
	 * @param id
	 *            - Id type, could {@link Long}, {@link Integer} etc...
	 * 
	 * 
	 * @return R - {@link Response}
	 */
	R delete(ID id);

	/**
	 * Deletes a given entity.
	 * 
	 * @param entity
	 *            - Entity that needs to deleted
	 * 
	 * @return R - {@link Response}
	 */
	R delete(E entity);

	/**
	 * Deletes the given entities.
	 * 
	 * * @param entities - {@link Iterable} list of entities
	 * 
	 * 
	 * @return R - {@link Response}
	 */
	R delete(Iterable<? extends E> entities);

}
