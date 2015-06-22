/**
 * 
 */
package com.shah.java.service.ws.entity;

import com.shah.java.service.ws.BaseService;
import com.shah.java.service.ws.task.BaseTaskService;
import com.shah.java.service.ws.utility.BaseUtilityService;

/**
 * Central service interface for the different kind of
 * <code><b><i>Entity Services</i></b></code> being exposed.
 * <p>
 * <p>
 * Other services extending this interface can selectively expose more specific
 * <code><b><i>Entity</i></b></code> methods by simply declaring methods of the
 * one which are more specific to the Context of the
 * <code><b><i>Entity Services</i></b></code> functionality being exposed.
 * <p>
 * 
 * All the <code><b>new Entity Services MUST</b></code> have to extend this
 * interface to get the common behavior across all the <b>Entity Services
 * 
 * @see BaseService
 * @see BaseCrudEntityService
 * @see BaseTaskService
 * @see BaseUtilityService
 * @author Nirav Shah 
 * 
 */
public interface BaseEntityService extends BaseService {

}
