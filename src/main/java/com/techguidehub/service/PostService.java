package com.techguidehub.service;

import org.springframework.stereotype.Service;
import com.techguidehub.model.Post;
import com.techguidehub.repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;

    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(Long id){
        return postRepository.findById(id).orElse(null);
    }

    public Post creaPost(Post post) {
        return postRepository.save(post);
    }

    public Post updatePost(Post post) {
        return postRepository.save(post);

    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}