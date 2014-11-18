package com.zitro.interactive.labs.primefaces.repository;

import org.springframework.data.repository.CrudRepository;

import com.zitro.interactive.labs.primefaces.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}