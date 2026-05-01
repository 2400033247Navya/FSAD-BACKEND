package com.klu.safehaven.entity;

	import jakarta.persistence.*;

	@Entity
	public class LegalResource {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String category;

	    @Column(length = 2000)
	    private String description;

	    public LegalResource() {
	    }

	    public LegalResource(Long id, String title, String category, String description) {
	        this.id = id;
	        this.title = title;
	        this.category = category;
	        this.description = description;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	}

