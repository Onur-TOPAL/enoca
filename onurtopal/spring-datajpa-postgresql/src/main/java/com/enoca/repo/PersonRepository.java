package com.enoca.repo;

import com.enoca.entitiy.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person,Long>{
}
