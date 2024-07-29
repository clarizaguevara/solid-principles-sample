package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long>, ConsumerRepositoryCustom {
}
