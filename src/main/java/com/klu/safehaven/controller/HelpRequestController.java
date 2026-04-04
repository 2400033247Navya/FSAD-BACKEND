package com.klu.safehaven.controller;


	import com.klu.safehaven.entity.HelpRequest;
	import com.klu.safehaven.service.HelpRequestService;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/help-requests")
	@CrossOrigin("*")
	public class HelpRequestController {

	    private final HelpRequestService helpRequestService;

	    public HelpRequestController(HelpRequestService helpRequestService) {
	        this.helpRequestService = helpRequestService;
	    }

	    @PostMapping
	    public HelpRequest create(@RequestBody HelpRequest request) {
	        return helpRequestService.createRequest(request);
	    }

	    @GetMapping
	    public List<HelpRequest> getAll() {
	        return helpRequestService.getAllRequests();
	    }
	}

