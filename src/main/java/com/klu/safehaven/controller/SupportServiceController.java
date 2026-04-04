package com.klu.safehaven.controller;


	import com.klu.safehaven.entity.SupportService;
	import com.klu.safehaven.repository.SupportServiceRepository;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/support-services")
	@CrossOrigin("*")
	public class SupportServiceController {

	    private final SupportServiceRepository repository;

	    public SupportServiceController(SupportServiceRepository repository) {
	        this.repository = repository;
	    }

	    @GetMapping
	    public List<SupportService> getAll() {
	        return repository.findAll();
	    }

	    @PostMapping
	    public SupportService add(@RequestBody SupportService service) {
	        return repository.save(service);
	    }
	}

