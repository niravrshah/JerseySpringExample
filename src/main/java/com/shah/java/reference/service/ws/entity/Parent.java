/**
 * 
 */
package com.shah.java.reference.service.ws.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author Nirav Shah 
 * 
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Parent implements Serializable {

	/**
	 * 
	 */
	Parent nextParent;

	private static final long serialVersionUID = 1L;
	private List<Child> childList;
	
	/**
	 * @return the childList
	 */
	public List<Child> getChildList() {
		return childList;
	}

	/**
	 * @param childList the childList to set
	 */
	public void setChildList(List<Child> childList) {
		this.childList = childList;
	}

	/**
	 * @return the nextParent
	 */
	public Parent getNextParent() {
		return nextParent;
	}

	/**
	 * @param nextParent
	 *            the nextParent to set
	 */
	public void setNextParent(Parent nextParent) {
		this.nextParent = nextParent;
	}

}