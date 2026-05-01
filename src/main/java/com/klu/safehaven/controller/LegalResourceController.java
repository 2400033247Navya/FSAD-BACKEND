package com.klu.safehaven.controller;



	import com.klu.safehaven.entity.LegalResource;
	import com.klu.safehaven.repository.LegalResourceRepository;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/legal-resources")
	@CrossOrigin("*")
	public class LegalResourceController {

	    private final LegalResourceRepository repository;

	    public LegalResourceController(LegalResourceRepository repository) {
	        this.repository = repository;
	    }

	    @GetMapping
	    public List<LegalResource> getAll() {
	        return repository.findAll();
	    }

	    @PostMapping
	    public LegalResource add(@RequestBody LegalResource resource) {
	        return repository.save(resource);
	    }
	}

