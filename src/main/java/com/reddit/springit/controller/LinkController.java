package com.reddit.springit.controller;

import com.reddit.springit.domain.Link;
import com.reddit.springit.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository){
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List<Link> list(){
        return linkRepository.findAll();
    }

    //CRUD
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link){
        return linkRepository.save(link);
    }

    // /links/1 To achieve something like this we use the path variable
    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id){
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link){
        //Get the id
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        linkRepository.deleteById(id);
    }
}
