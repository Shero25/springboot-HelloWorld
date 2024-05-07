package com.congo.helloworld.repository;

import com.congo.helloworld.entity.Hello;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Hello,Long> {


}
