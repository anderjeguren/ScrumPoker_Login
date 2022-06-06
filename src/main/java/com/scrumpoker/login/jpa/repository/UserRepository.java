package com.scrumpoker.login.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scrumpoker.login.jpa.entity.UserEntity;

@Repository
public interface UserRepository  extends CrudRepository<UserEntity, Long>{

}
