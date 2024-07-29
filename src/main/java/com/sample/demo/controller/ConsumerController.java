package com.sample.demo.controller;

import com.sample.demo.service.ConsumerRegistrationService;
import com.sample.demo.service.ConsumerSearchService;

import com.sample.demo.model.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {
	
	@Autowired
    private final ConsumerRegistrationService registrationService;
	
	@Autowired
    private final ConsumerSearchService searchService;

    public ConsumerController(ConsumerRegistrationService registrationService, ConsumerSearchService searchService) {
        this.registrationService = registrationService;
        this.searchService = searchService;
    }

    @PostMapping
    public Consumer registerConsumer(@RequestBody Consumer consumer) {
        return registrationService.registerConsumer(consumer);
    }
    
    @GetMapping
    public List<Consumer> getAll() {
        return searchService.findAll();
    }

    @GetMapping("/{id}")
    public Consumer getConsumerById(@PathVariable Long id) {
        return searchService.findConsumerById(id);
    }

    @GetMapping("/search")
    public List<Consumer> getConsumersByEmail(@RequestParam String email) {
        return searchService.findConsumersByEmail(email);
    }
}
