package com.spring.pm2test.business.repository;

import com.spring.pm2test.business.entity.Bejegyzes;
import com.spring.pm2test.business.entity.Profile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class BejegyzesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void update(Bejegyzes bejegyzes){
        entityManager.merge(bejegyzes);
    }

    public void save(Bejegyzes bejegyzes){
        entityManager.persist(bejegyzes);
    }

    public Bejegyzes findById(Long id) {
        return entityManager.find(Bejegyzes.class, id);
    }

    public void delete(Bejegyzes bejegyzes){
        entityManager.remove(findById(bejegyzes.getId()));
    }

    public List<Bejegyzes> findAllByProfile(Profile profile) {
        return entityManager.createQuery("SELECT b from Bejegyzes b where b.profile:=" + profile).getResultList();
    }
}
