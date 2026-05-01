package com.klu.safehaven.entity;

	import jakarta.persistence.*;

	@Entity
	public class SupportService {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String serviceName;
	    private String contactNumber;
	    private String location;
	    private String type;

	    public SupportService() {
	    }

	    public SupportService(Long id, String serviceName, String contactNumber, String location, String type) {
	        this.id = id;
	        this.serviceName = serviceName;
	        this.contactNumber = contactNumber;
	        this.location = location;
	        this.type = type;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getServiceName() {
	        return serviceName;
	    }

	    public void setServiceName(String serviceName) {
	        this.serviceName = serviceName;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }

	    public void setContactNumber(String contactNumber) {
	        this.contactNumber = contactNumber;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }
	}

