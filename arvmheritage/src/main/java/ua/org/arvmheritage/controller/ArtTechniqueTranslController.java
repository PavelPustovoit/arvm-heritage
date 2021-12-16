package ua.org.arvmheritage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.org.arvmheritage.model.ArtTechniqueTranslEntity;
import ua.org.arvmheritage.service.ArtTechniqueTranslService;

import java.util.List;

@Controller
public class ArtTechniqueTranslController {

    private final ArtTechniqueTranslService artTechniqueTranslService;

    @Autowired
    public ArtTechniqueTranslController(ArtTechniqueTranslService artTechniqueTranslService){
        this.artTechniqueTranslService = artTechniqueTranslService;
    }

    @GetMapping(value = "/techniques")
    public ResponseEntity<List<ArtTechniqueTranslEntity>> getArtTechniques( ){
        return ResponseEntity.ok(artTechniqueTranslService.getArtTechniques());
    }
}
