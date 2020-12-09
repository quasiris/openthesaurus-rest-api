package com.quasiris.nlp.openthesaurus.web;

import com.quasiris.nlp.openthesaurus.dto.SynonymDTO;
import com.quasiris.nlp.openthesaurus.jpa.Term;
import com.quasiris.nlp.openthesaurus.jpa.TermRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/synonyms")
public class SynonymController {

    private static final Logger logger = LoggerFactory.getLogger(SynonymController.class);

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
    @GetMapping("all")
    public List<SynonymDTO> all() {
        List<Term> terms = termRepository.findAll();
        logger.info("Compute synonyms for {} Terms.", terms.size());
        List<SynonymDTO> synonyms = new ArrayList<>();
        int count = 0;
        for(Term term : terms) {
            count++;
            logger.info("Terms processed: {}", count);
            SynonymDTO synonymDTO = query(term.getWord());
            synonyms.add(synonymDTO);
        }


        return synonyms;
    }

}
