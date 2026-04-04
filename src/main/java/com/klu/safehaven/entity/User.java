package com.klu.safehaven.entity;

	import jakarta.persistence.*;

	@Entity
	@Table(name = "users")
	public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String fullName;

	    @Column(unique = true)
	    private String email;

	    private String password;

	    @Enumerated(EnumType.STRING)
	    private Role role;

	    private String phone;

	    public User() {
	    }

	    public User(Long id, String fullName, String email, String password, Role role, String phone) {
	        this.id = id;
	        this.fullName = fullName;
	        this.email = email;
	        this.password = password;
	        this.role = role;
	        this.phone = phone;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public Role getRole() {
	        return role;
	    }

	    public void setRole(Role role) {
	        this.role = role;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	}

