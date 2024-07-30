package com.sample.demo.service;

import com.sample.demo.repository.ConsumerRepository;

import org.springframework.stereotype.Service;

import com.sample.demo.model.Consumer;

@Service
public class ConsumerRegistrationServiceImpl implements ConsumerRegistrationService {
	
	private final ConsumerRepository consumerRepository;

    public ConsumerRegistrationServiceImpl(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @Override
    public Consumer registerConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }
}
