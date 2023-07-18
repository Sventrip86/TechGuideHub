package com.techguidehub.service;

import com.techguidehub.model.PostTag;
import com.techguidehub.repository.PostTagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostTagService {
    private final PostTagRepository postTagRepository;

    public PostTagService(PostTagRepository postTagRepository) {
        this.postTagRepository = postTagRepository;
    }

    public List<PostTag> getAllPostTags() {
        return postTagRepository.findAll();
    }

    public PostTag getPostTagById(Long id) {
        return postTagRepository.findById(id).orElse(null);
    }

    public PostTag createPostTag(PostTag postTag) {
        return postTagRepository.save(postTag);
    }

    public PostTag updatePostTag(PostTag postTag) {
        return postTagRepository.save(postTag);
    }

    public void deletePostTag(Long id) {
        postTagRepository.deleteById(id);
    }
}
