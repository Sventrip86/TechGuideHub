package com.techguidehub.controller;

import com.techguidehub.model.PostTag;
import com.techguidehub.service.PostTagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posttags")
public class PostTagController {

    private final PostTagService postTagService;

    public PostTagController(PostTagService postTagService) {
        this.postTagService = postTagService;
    }

    @GetMapping
    public List<PostTag> getAllPostTags() {
        return postTagService.getAllPostTags();
    }

    @GetMapping("/{postId}/{tagId}")
    public PostTag getPostTag(@PathVariable Long postId, @PathVariable Long tagId) {
        return postTagService.getPostTagById(postId);
    }

    @PostMapping
    public PostTag createPostTag(@RequestBody PostTag postTag) {
        return postTagService.createPostTag(postTag);
    }

    @DeleteMapping("/{postId}/{tagId}")
    public void deletePostTag(@PathVariable Long postId, @PathVariable Long tagId) {
        postTagService.deletePostTag(postId);
    }
}
