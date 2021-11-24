package com.mirna.springapischool.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirna.springapischool.domain.User;

public interface UserDAO extends JpaRepository<User, Long>{

}
