package com.shah.java.reference.service.ws.payment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shah.java.entity.Payment;
import com.shah.java.transaction.TransactionService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/payment")
public class ReferencePaymentServiceImpl implements ReferencePaymentService {

	@Autowired
	TransactionService transactionService;

	@GET
	@Path("/save")
	public Response savePayment() {

		String result = transactionService.save();

		return Response.status(200).entity(result).build();

	}

	@Override
	public Response save(Payment entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response save(Iterable<Payment> entities) {
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
	public Response delete(Payment entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response delete(Iterable<? extends Payment> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}