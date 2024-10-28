package com.example.d;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d.model.UserData;

@Repository
public interface UserRepo extends JpaRepository<UserData, Long> {

}
