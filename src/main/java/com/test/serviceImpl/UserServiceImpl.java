package com.test.serviceImpl;


import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.test.bean.User;
import com.test.service.UserService;

/**
 * @author Nawed Alam 26/03/2020
 *
 */

@Service
public class UserServiceImpl implements UserService {

	
	@Override
	public Response userRegister(User user) {
		
		
		
		return  null;
	}

	@Override
	public Response userVerifications(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response userReset(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response userDelete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(@NotNull Long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
