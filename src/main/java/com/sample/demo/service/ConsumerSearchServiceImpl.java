package com.sample.demo.service;

import com.sample.demo.repository.ConsumerRepository;

import org.springframework.stereotype.Service;

import com.sample.demo.model.Consumer;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumerSearchServiceImpl implements ConsumerSearchService {
	
	private final ConsumerRepository consumerRepository;

    public ConsumerSearchServiceImpl(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }
    
    @Override
    public List<Consumer> findAll() {
    	return consumerRepository.findAll();
    }

    @Override
    public Consumer findConsumerById(Long id) {
    	Optional<Consumer> consumerOpt = consumerRepository.findById(id);
        
        return consumerOpt.orElseThrow(() -> new RuntimeException("Consumer not found with ID: " + id));
    }

    @Override
    public List<Consumer> findConsumersByEmail(String email) {
        return consumerRepository.findByEmail(email);
    }
}
