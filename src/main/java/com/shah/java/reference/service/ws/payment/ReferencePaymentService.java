/**
 * 
 */
package com.shah.java.reference.service.ws.payment;

import javax.ws.rs.core.Response;

import com.shah.java.entity.Payment;
import com.shah.java.service.ws.entity.BaseCrudEntityService;

/**
 * @author Nirav Shah
 * 
 */
public interface ReferencePaymentService extends BaseCrudEntityService<Payment, Long, Response> {

}
