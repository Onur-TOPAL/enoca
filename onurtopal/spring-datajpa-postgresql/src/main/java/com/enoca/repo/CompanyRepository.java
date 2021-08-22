package com.enoca.repo;

import com.enoca.entitiy.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company,Long>{
}
