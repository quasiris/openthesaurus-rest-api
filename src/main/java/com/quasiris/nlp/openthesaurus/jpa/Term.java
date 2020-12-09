package com.quasiris.nlp.openthesaurus.jpa;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "term")
@EntityListeners(AuditingEntityListener.class)
public class Term implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Access(AccessType.PROPERTY) @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "level_id")
    private Integer levelId;

    @Column(name = "normalized_word")
    private String normalizedWord;

    @Column(name = "original_id")
    private Integer originalId;

    @Column(name = "synset_id")
    private Integer synsetId;


    @Column(name = "user_comment")
    private String userComment;

    @Column(name = "word")
    private String  word;

    @Column(name = "normalized_word2")
    private String  normalizedWord2;


    /**
     * Getter for property 'serialVersionUID'.
     *
     * @return Value for property 'serialVersionUID'.
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for property 'languageId'.
     *
     * @return Value for property 'languageId'.
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * Setter for property 'languageId'.
     *
     * @param languageId Value to set for property 'languageId'.
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * Getter for property 'levelId'.
     *
     * @return Value for property 'levelId'.
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * Setter for property 'levelId'.
     *
     * @param levelId Value to set for property 'levelId'.
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * Getter for property 'normalizedWord'.
     *
     * @return Value for property 'normalizedWord'.
     */
    public String getNormalizedWord() {
        return normalizedWord;
    }

    /**
     * Setter for property 'normalizedWord'.
     *
     * @param normalizedWord Value to set for property 'normalizedWord'.
     */
    public void setNormalizedWord(String normalizedWord) {
        this.normalizedWord = normalizedWord;
    }

    /**
     * Getter for property 'originalId'.
     *
     * @return Value for property 'originalId'.
     */
    public Integer getOriginalId() {
        return originalId;
    }

    /**
     * Setter for property 'originalId'.
     *
     * @param originalId Value to set for property 'originalId'.
     */
    public void setOriginalId(Integer originalId) {
        this.originalId = originalId;
    }

    /**
     * Getter for property 'synsetId'.
     *
     * @return Value for property 'synsetId'.
     */
    public Integer getSynsetId() {
        return synsetId;
    }

    /**
     * Setter for property 'synsetId'.
     *
     * @param synsetId Value to set for property 'synsetId'.
     */
    public void setSynsetId(Integer synsetId) {
        this.synsetId = synsetId;
    }

    /**
     * Getter for property 'userComment'.
     *
     * @return Value for property 'userComment'.
     */
    public String getUserComment() {
        return userComment;
    }

    /**
     * Setter for property 'userComment'.
     *
     * @param userComment Value to set for property 'userComment'.
     */
    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    /**
     * Getter for property 'word'.
     *
     * @return Value for property 'word'.
     */
    public String getWord() {
        return word;
    }

    /**
     * Setter for property 'word'.
     *
     * @param word Value to set for property 'word'.
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Getter for property 'normalizedWord2'.
     *
     * @return Value for property 'normalizedWord2'.
     */
    public String getNormalizedWord2() {
        return normalizedWord2;
    }

    /**
     * Setter for property 'normalizedWord2'.
     *
     * @param normalizedWord2 Value to set for property 'normalizedWord2'.
     */
    public void setNormalizedWord2(String normalizedWord2) {
        this.normalizedWord2 = normalizedWord2;
    }
}
