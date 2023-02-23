package com.tcc.bfn.uni.services;

import com.tcc.bfn.uni.data.UserDTO;
import com.tcc.bfn.uni.entities.User;
import com.tcc.bfn.uni.exception.UserException;

public interface IUserService {

	

	public User buscaPorId(final Long cpf);


	public User findAuth() throws Exception;

}
