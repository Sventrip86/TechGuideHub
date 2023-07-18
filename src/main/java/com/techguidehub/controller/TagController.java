package com.techguidehub.controller;

import com.techguidehub.model.Tag;
import com.techguidehub.service.TagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
     
    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping
    public List<Tag> getAllTags(){
        return tagService.getAllTags();
    }

    @GetMapping("/{id}")
    public Tag getTag(@PathVariable Long id) {
        return tagService.getTagById(id);
    }

    @PostMapping
    public Tag createTag(@RequestBody Tag tag) {
        return tagService.createTag(tag);
    }

    @PutMapping("/{id}")
    public Tag updateTag(@PathVariable Long id, @RequestBody Tag tag) {
        tag.setTagId(id);
        return tagService.updateTag(tag);
    }

    @DeleteMapping("/{id}")
    public void deleteTag(@PathVariable Long id) {
        tagService.deleteTag(id);
    }


}
