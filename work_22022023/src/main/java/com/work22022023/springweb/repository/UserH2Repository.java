package com.work22022023.springweb.repository;

import com.work22022023.springweb.entity.UserH2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserH2Repository extends JpaRepository<UserH2, Integer> {

}
