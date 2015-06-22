/**
 * 
 */
package com.shah.java.service.ws;

import javax.ws.rs.Path;

import com.shah.java.service.ws.entity.BaseEntityService;
import com.shah.java.service.ws.task.BaseTaskService;
import com.shah.java.service.ws.utility.BaseUtilityService;

/**
 * Central service interface. Captures the common behavior across all the
 * different services being exposed.
 * <p>
 * Other services extending this interface can selectively expose more specific
 * methods by simply declaring methods of the one which are more specific to the
 * Context of the service functionality being exposed.
 * <p>
 * Only the service functionality which is common across all the different
 * services should go here. Anything which is more specific to the type of the
 * services should go in sub types of this interface.
 * <p>
 * For example, any service function which is common across all the Task
 * services should go inside the {@link BaseTaskService}
 * 
 * @see BaseEntityService
 * @see BaseTaskService
 * @see BaseUtilityService
 * @author Nirav Shah 
 */
@Path("/")
public interface BaseService {
}
