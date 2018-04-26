package org.mishra.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.mishra.com.entity.Customer;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Repository;


@Repository(value="customerDao")
public class CustomerDaoImpl implements CustomerDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer getUserInformationByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getUserInformationById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getUserInformation(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attributeRole(Role r, Long userId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saveUser(Customer c)
	{
		em.persist(c);
	}

}
