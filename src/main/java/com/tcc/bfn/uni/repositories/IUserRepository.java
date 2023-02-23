package com.tcc.bfn.uni.repositories;

import java.util.Optional;

import com.tcc.bfn.uni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

	public User findByCpf(String cpf);

	@Query("SELECT u FROM User u WHERE u.email = :email")
	public Optional<User> findByEmail(@Param("email")String email);

}
