package org.mishra.com.dao;

import org.mishra.com.entity.Customer;
import org.springframework.context.annotation.Role;

public interface CutomerDao {

	public Customer getUserInformationByEmail(String email);
	public Customer getUserInformationById(Long id);
	public Customer getUserInformation(Customer c);
	public void attributeRole(Role r,Long userId);
	
}
