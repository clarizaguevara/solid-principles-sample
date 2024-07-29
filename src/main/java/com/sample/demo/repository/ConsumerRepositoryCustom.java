package com.sample.demo.repository;

import java.util.List;

import com.sample.demo.model.Consumer;

public interface ConsumerRepositoryCustom {
    List<Consumer> findByEmail(String email);
}