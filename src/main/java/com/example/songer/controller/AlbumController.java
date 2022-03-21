package com.example.songer.controller;

import com.example.songer.Repositries.AlbumRepository;
import com.example.songer.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class AlbumController {


    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/Albums")
    public String Add(Model model){
//        model.addAttribute("albums",albumRepository.findAll());
        return "home";
    }
    @GetMapping("/newAlbum")
    public String render(Model model){
        model.addAttribute("albums",albumRepository.findAll());
        return "albums";
    }

    @PostMapping("/addAlbum")
    public RedirectView createNewAlbum(@ModelAttribute Album album){
        albumRepository.save(album);
        return new RedirectView("newAlbum");
    }

//    @GetMapping("/delete/{id}")
//    public void delete(@PathVariable String id){
//        albumRepository.findById(Integer.parseInt(id));
//        Optional<Album> album=albumRepository.findById(Integer.parseInt(id));
//        System.out.println(album);
//        albumRepository.deleteById(Integer.parseInt(id));
//        return  ResponseEntity.noContent().build();
//    }



}
