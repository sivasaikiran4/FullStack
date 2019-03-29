package org.poc.services;

import java.util.ArrayList;
import java.util.List;

import org.poc.entity.Post;
import org.poc.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
	@Autowired
	private PostRepository repo;
   String str;
	public List<Post> getPosts(){
		List<Post> list = new ArrayList<>();
		
		for(Post post: repo.findAll()) {
			
		    list.add(post);	
		}
		return list;
	}
	
	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post listElement) {
		repo.save(listElement);
		
	}
	public void updatePost(Post post) {
	
		repo.save(post);
	}

	public void deletePost(int id) {
		 try {
			    repo.deleteById(id);
			      }catch(Exception ex) {
			          //some code
			          }
	}
}






