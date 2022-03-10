package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	//MovieController faz requisiçao pra o service
	@Autowired
	private MovieService service;
	
	//Metodo que busca Page de MovieDTO retornando o metodo findAll do service
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	//Metodo que busca um objeto MovieDTO retornando o metodo findById do service
	@GetMapping("/{id}")
	public MovieDTO findById(@PathVariable Long id){
		return service.findById(id);
	}

}
