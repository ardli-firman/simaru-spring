package com.ardli.simaru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ardli.simaru.model.Users;

/**
 * UserRepo
 */
@Repository
public interface UserRepo extends JpaRepository<Users, String> {

}