package com.tcc.bfn.uni.facade.populators;

import com.tcc.bfn.uni.data.UserDTO;
import com.tcc.bfn.uni.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserReversePopulator implements Populator<UserDTO, User>{

	@Override
	public void populate(UserDTO source, User target) {
		target.setId(source.getId());
		target.setNome(source.getNome());
		target.setEmail(source.getEmail());
		target.setCpf(source.getCpf());
		target.setPassword(source.getPassword());
	}

}
