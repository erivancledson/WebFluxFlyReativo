package com.erivan.fly.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.erivan.fly.document.Passagem;

public interface PassagemRepository extends ReactiveMongoRepository<Passagem, String>{

}
