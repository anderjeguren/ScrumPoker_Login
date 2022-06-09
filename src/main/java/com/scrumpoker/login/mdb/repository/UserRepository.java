package com.scrumpoker.login.mdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scrumpoker.login.mdb.model.UserEntity;

@Repository
public interface UserRepository  extends MongoRepository<UserEntity, Long>{

}
