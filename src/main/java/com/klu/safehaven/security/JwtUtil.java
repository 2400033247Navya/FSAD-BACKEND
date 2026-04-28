
	package com.klu.safehaven.security;

	import io.jsonwebtoken.Jwts;
	import io.jsonwebtoken.security.Keys;
	import org.springframework.stereotype.Component;

	import javax.crypto.SecretKey;
	import java.util.Date;

	@Component
	public class JwtUtil {

	    private final String SECRET = "safehavenprojectsecretkeysafehavenprojectsecretkey";
	    private final long EXPIRATION = 1000 * 60 * 60;

	    private SecretKey getSigningKey() {
	        return Keys.hmacShaKeyFor(SECRET.getBytes());
	    }

	    public String generateToken(String email, String role) {
	        return Jwts.builder()
	                .subject(email)
	                .claim("role", role)
	                .issuedAt(new Date())
	                .expiration(new Date(System.currentTimeMillis() + EXPIRATION))
	                .signWith(getSigningKey())
	                .compact();
	    }

	    public String extractEmail(String token) {
	        return Jwts.parser()
	                .verifyWith(getSigningKey())
	                .build()
	                .parseSignedClaims(token)
	                .getPayload()
	                .getSubject();
	    }

	    public String extractRole(String token) {
	        return Jwts.parser()
	                .verifyWith(getSigningKey())
	                .build()
	                .parseSignedClaims(token)
	                .getPayload()
	                .get("role", String.class);
	    }

	    public boolean validateToken(String token) {
	        try {
	            extractEmail(token);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }
	}

