package com.quasiris.nlp.openthesaurus.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by tbl on 9.12.2020.
 */
public interface TermRepository extends JpaRepository<Term, Integer> {



    @Query(value = "SELECT term.word FROM term, synset, term term2 WHERE synset.is_visible = 1 AND synset.id = term.synset_id AND term2.synset_id = synset.id AND term2.word=:q", nativeQuery = true)
    List<String> findSynonyms(String q);
}
