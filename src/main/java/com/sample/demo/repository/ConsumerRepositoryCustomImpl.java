package com.sample.demo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import com.sample.demo.model.Consumer;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ConsumerRepositoryCustomImpl implements ConsumerRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Consumer> findByEmail(String email) {
    	String queryString = "SELECT c FROM Consumer c WHERE c.email = :email";
    	
        TypedQuery<Consumer> query = entityManager.createQuery(queryString, Consumer.class);
        query.setParameter("email", email);
        
        return query.getResultList();
    }
}