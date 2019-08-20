package com.erivan.fly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erivan.fly.document.Passagem;
import com.erivan.fly.repository.PassagemRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PassagemServiceImplements implements PassagemService{
	//injeção do repositorio
	@Autowired
	PassagemRepository ps;

	//lista todos
	@Override
	public Flux<Passagem> findAll() {
		return ps.findAll();
	}
	//lista atraves do id
	@Override
	public Mono<Passagem> findById(String id) {
		return ps.findById(id);
	}
	//salva a passagem
	@Override
	public Mono<Passagem> save(Passagem passagem) {
		return ps.save(passagem);
	}
	

}
