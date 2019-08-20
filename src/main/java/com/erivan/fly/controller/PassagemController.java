package com.erivan.fly.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erivan.fly.document.Passagem;
import com.erivan.fly.services.PassagemService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class PassagemController {
	
	@Autowired
	PassagemService service;
	@GetMapping(value="/passagens")
	public Flux<Passagem> getPassagem(){
		return service.findAll();
	}
	//lista somente 1
	@GetMapping(value="/passagem/{id}")
	public Mono<Passagem> getPassagemId(@PathVariable String id){
		return service.findById(id);
	}
	
	//salva
	@PostMapping("/passagem")
	public Mono<Passagem> save(@RequestBody Passagem passagem){
		return service.save(passagem);
	}
	@GetMapping(value="/passagem/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Tuple2<Long, Passagem>> getPassagemByEvents(){
		//intervalo de cada resposta que vai ser enviado para o cliente
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
		Flux<Passagem> events = service.findAll();
		return Flux.zip(interval, events); //exibe uma passagem a cada intervalo que declarado. Que foi de 10 segundos
	}
	

}
