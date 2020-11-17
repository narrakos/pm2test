package com.spring.pm2test.business.jpaService;

import com.spring.pm2test.business.entity.Bejegyzes;
import com.spring.pm2test.business.jpaRepository.BejegyzesJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BejegyzesJpaService {
    private BejegyzesJpaRepository repository;

    @Autowired
    public BejegyzesJpaService(BejegyzesJpaRepository repository) {
        this.repository = repository;
    }

    public void save(Bejegyzes bejegyzes){
        repository.save(bejegyzes);
    }

    public Bejegyzes findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Bejegyzes bejegyzes){
        repository.delete(bejegyzes);
    }


}
