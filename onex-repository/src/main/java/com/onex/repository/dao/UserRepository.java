package com.onex.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onex.repository.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

}
