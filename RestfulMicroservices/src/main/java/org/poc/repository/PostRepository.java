package org.poc.repository;

import org.poc.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PostRepository extends CrudRepository<Post, Integer> 
{      }