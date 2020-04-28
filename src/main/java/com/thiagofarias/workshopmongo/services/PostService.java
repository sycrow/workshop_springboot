package com.thiagofarias.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagofarias.workshopmongo.domain.Post;
import com.thiagofarias.workshopmongo.repository.PostRepository;
import com.thiagofarias.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		
		Optional<Post> user = repo.findById(id);
		
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
	}
}
