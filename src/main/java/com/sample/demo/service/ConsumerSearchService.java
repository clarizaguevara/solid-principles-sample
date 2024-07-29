package com.sample.demo.service;

import java.util.List;

import com.sample.demo.model.Consumer;

public interface ConsumerSearchService {
	Consumer findConsumerById(Long id);
	List<Consumer> findAll();
    List<Consumer> findConsumersByEmail(String email);
}
