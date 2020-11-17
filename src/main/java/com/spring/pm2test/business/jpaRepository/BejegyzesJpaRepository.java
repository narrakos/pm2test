package com.spring.pm2test.business.jpaRepository;

import com.spring.pm2test.business.entity.Bejegyzes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BejegyzesJpaRepository extends JpaRepository<Bejegyzes, Long> {
}
