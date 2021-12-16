package ua.org.arvmheritage.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.org.arvmheritage.model.ArtTechniqueTranslEntity;
import ua.org.arvmheritage.repository.ArtTechniqueTranslRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArtTechniqueTranslService {

    private static final ArtTechniqueTranslRepository artTechniqueTranslRepository = null;

    //public ArtTechniqueTranslService(ArtTechniqueTranslRepository artTechniqueTranslRepository){
        //this.artTechniqueTranslRepository = artTechniqueTranslRepository;}

    public static List<ArtTechniqueTranslEntity> getArtTechniques(){
        return artTechniqueTranslRepository.findAll();
    }

}
