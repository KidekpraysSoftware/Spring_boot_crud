package com.kidek.crud.repository;

import com.kidek.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface UserDAO extends JpaRepository<User, Long> {

}
