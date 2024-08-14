package com.sn.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sn.mongo.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
}