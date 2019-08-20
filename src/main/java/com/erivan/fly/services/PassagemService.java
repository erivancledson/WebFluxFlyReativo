package com.erivan.fly.services;

import com.erivan.fly.document.Passagem;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PassagemService {
	Flux<Passagem> findAll(); //retorna todos
	Mono<Passagem> findById(String id); //retorna somente 1 documento
	Mono<Passagem> save(Passagem passagem); // salva e retorna a passagem
	
}
