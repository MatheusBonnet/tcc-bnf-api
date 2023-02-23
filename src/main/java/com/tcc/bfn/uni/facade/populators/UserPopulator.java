package com.tcc.bfn.uni.facade.populators;

import com.tcc.bfn.uni.data.UserDTO;
import org.springframework.stereotype.Service;

import com.tcc.bfn.uni.entities.User;

@Service
public class UserPopulator implements Populator<User, UserDTO>{

	@Override
	public void populate(User source, UserDTO target) {	
		target.setId(source.getId());
		target.setNome(source.getNome());
		target.setEmail(source.getEmail());
		target.setCpf(source.getCpf());
		target.setPassword(source.getPassword());
	}	
}
