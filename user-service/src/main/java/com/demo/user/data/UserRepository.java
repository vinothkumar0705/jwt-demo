package com.demo.user.data;

import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UserRepository extends CrudRepository<UserEntity, BigInteger> {

}
