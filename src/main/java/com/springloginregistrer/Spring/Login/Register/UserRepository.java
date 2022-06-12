package com.springloginregistrer.Spring.Login.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
 
	//@Query("SELECT * FROM userdb.Users WHERE email = "+User.getEmail().toString());
    public User findByEmail(String email);
	
}
