package com.klu.safehaven.service;



	import com.klu.safehaven.entity.HelpRequest;
	import com.klu.safehaven.repository.HelpRequestRepository;
	import org.springframework.stereotype.Service;

	import java.util.List;

	@Service
	public class HelpRequestService {

	    private final HelpRequestRepository helpRequestRepository;

	    public HelpRequestService(HelpRequestRepository helpRequestRepository) {
	        this.helpRequestRepository = helpRequestRepository;
	    }

	    public HelpRequest createRequest(HelpRequest request) {
	        request.setStatus("OPEN");
	        return helpRequestRepository.save(request);
	    }

	    public List<HelpRequest> getAllRequests() {
	        return helpRequestRepository.findAll();
	    }
	}

