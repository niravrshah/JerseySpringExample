/**
 * 
 */
package com.shah.java.service.ws.utility;

import com.shah.java.service.ws.BaseService;
import com.shah.java.service.ws.entity.BaseCrudEntityService;
import com.shah.java.service.ws.task.BaseTaskService;

/**
 * Central service interface for the different kind of
 * <code><b><i>Utility Services</i></b></code> being exposed.
 * <p>
 * <p>
 * Other services extending this interface can selectively expose more specific
 * <code><b><i>Utility</i></b></code> methods by simply declaring methods of the
 * one which are more specific to the Context of the
 * <code><b><i>Utility Services</i></b></code> functionality being exposed.
 * <p>
 * 
 * * All the <code><b>new Utility Services MUST</b></code> have to extend this
 * interface to get the common behavior across all the <b>Utility Services
 * 
 * @see BaseService
 * @see BaseTaskService
 * @see BaseCrudEntityService
 * @author Nirav Shah 
 */
public interface BaseUtilityService extends BaseService {

}
