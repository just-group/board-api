package com.justboard.demo.domain.post.parkye.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value={"/parkye/posts"})
public class PostController {

    @PostMapping("/")
    public ResponseEntity createPost() {
        return new ResponseEntity("parkye 테스트", HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public ResponseEntity getPost(@PathVariable("id") Long id) {
        return new ResponseEntity("parkye 테스트", HttpStatus.OK);
    };

    @GetMapping("/")
    public ResponseEntity getPostList() {
        return new ResponseEntity("parkye 테스트", HttpStatus.OK);
    };

    @PutMapping("/{id}")
    public ResponseEntity updatePost(@PathVariable("id") Long id) {
        return new ResponseEntity("parkye 테스트", HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    public ResponseEntity deletePost(@PathVariable("id") Long id) {
        return new ResponseEntity("parkye 테스트", HttpStatus.OK);
    };

}
