package com.gallery.scenography.controllers;

import com.gallery.scenography.dto.ArtistDTO;
import com.gallery.scenography.entities.Artist;
import com.gallery.scenography.repositories.ArtistRepository;
import com.gallery.scenography.services.ArtistService;
import java.util.Optional;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.gallery.scenography.util.ResourceMappings.ARTIST;

@RestController
@RequestMapping(ARTIST)
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping
    public List<ArtistDTO> getAllArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/{id}")
    public ArtistDTO getOneArtist(@PathVariable Long id) {
        return artistService.getOneArtist(id);
    }

//    @PostMapping("/{id}")
//    public void update(@RequestBody Artist artist, @PathVariable Long id){
//        artistService.update(id, artist);
//    }

    @PostMapping("/{id}")
    public void put(@RequestBody Artist artist){
        artistService.put(artist);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        artistService.remove(id);
    }



}
