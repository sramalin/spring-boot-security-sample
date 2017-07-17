package com.sample.springsecuritysample.repository;


import com.sample.springsecuritysample.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
