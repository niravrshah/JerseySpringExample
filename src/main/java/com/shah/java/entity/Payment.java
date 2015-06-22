/**
 * 
 */
package com.shah.java.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Nirav Shah
 * 
 */
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigDecimal amount;

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payment [amount=" + amount + "]";
	}

}
