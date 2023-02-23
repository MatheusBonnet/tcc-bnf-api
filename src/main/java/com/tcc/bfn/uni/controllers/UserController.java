package com.tcc.bfn.uni.controllers;

import java.util.List;
import java.util.Optional;

import com.tcc.bfn.uni.entities.User;
import com.tcc.bfn.uni.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.bfn.uni.repositories.IUserRepository;
import com.tcc.bfn.uni.services.IUserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	public static final String UPDATE = "Atualizado com sucesso.";

	public static final String DELETE = "Deletado com sucesso";
	
	@Autowired
	private IUserService userService;
		
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

    private final IUserRepository repository;
    
    private final PasswordEncoder encoder;

    public UserController(IUserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> listarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(repository.findById(id));
    }
}
