package com.quasiris.nlp.openthesaurus.web;

import com.quasiris.nlp.openthesaurus.dto.SynonymDTO;
import com.quasiris.nlp.openthesaurus.jpa.TermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/synonyms")
public class SynonymController {

    @Autowired
    private TermRepository termRepository;

    @GetMapping
    public SynonymDTO query(
            @RequestParam String q
    ) {
        List<String> term = termRepository.findSynonyms(q);
        SynonymDTO synonymDTO = new SynonymDTO();
        synonymDTO.setKeyword(q);


        synonymDTO.setSynonyms(term);
        return synonymDTO;
    }

}
