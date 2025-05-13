package com.deep.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.springboot.entity.Userentity;

@Repository
public interface UserRepo extends JpaRepository<Userentity, Integer> {

}
