package com.tcc.bfn.uni.facade;

import com.tcc.bfn.uni.data.UserDTO;
import com.tcc.bfn.uni.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.bfn.uni.entities.User;
import com.tcc.bfn.uni.facade.populators.Populator;
import com.tcc.bfn.uni.repositories.IUserRepository;
import com.tcc.bfn.uni.services.IUserService;

import java.util.List;

@Service
public class UserFacade {

	@Autowired
	private Populator<UserDTO, User> userReversePopulator;
	
	@Autowired
	private IUserService userService;
	
	
	@Autowired
	private IUserRepository repository;

	public Populator<UserDTO, User> getUserReversePopulator() {
		return userReversePopulator;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void setUserReversePopulator(Populator<UserDTO, User> userReversePopulator) {
		this.userReversePopulator = userReversePopulator;
	}
	
	public IUserRepository getRepository() {
		return repository;
	}

	public void setRepository(IUserRepository repository) {
		this.repository = repository;
	}

}
