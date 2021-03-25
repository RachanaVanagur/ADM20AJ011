package com.cognizant.util;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ProductIdGenerator implements IdentifierGenerator {
	public static String prodId="RELIANCE_";
	public static Long pid=100L; 
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		System.out.println("------ generating product id----");
		return prodId+(pid++);
	}

}
