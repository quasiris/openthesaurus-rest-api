package com.quasiris.nlp.openthesaurus.dto;

import java.util.List;

public class SynonymDTO {

    private String keyword;

    private List<String> synonyms;

    private List<String> topics;
    private List<String> species;
    private List<String> associations;

    /**
     * Getter for property 'keyword'.
     *
     * @return Value for property 'keyword'.
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Setter for property 'keyword'.
     *
     * @param keyword Value to set for property 'keyword'.
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Getter for property 'synonyms'.
     *
     * @return Value for property 'synonyms'.
     */
    public List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * Setter for property 'synonyms'.
     *
     * @param synonyms Value to set for property 'synonyms'.
     */
    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    /**
     * Getter for property 'topics'.
     *
     * @return Value for property 'topics'.
     */
    public List<String> getTopics() {
        return topics;
    }

    /**
     * Setter for property 'topics'.
     *
     * @param topics Value to set for property 'topics'.
     */
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    /**
     * Getter for property 'species'.
     *
     * @return Value for property 'species'.
     */
    public List<String> getSpecies() {
        return species;
    }

    /**
     * Setter for property 'species'.
     *
     * @param species Value to set for property 'species'.
     */
    public void setSpecies(List<String> species) {
        this.species = species;
    }

    /**
     * Getter for property 'associations'.
     *
     * @return Value for property 'associations'.
     */
    public List<String> getAssociations() {
        return associations;
    }

    /**
     * Setter for property 'associations'.
     *
     * @param associations Value to set for property 'associations'.
     */
    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }

    @Override
    public String toString() {
        return "SynonymDTO{" +
                "keyword='" + keyword + '\'' +
                ", synonyms=" + synonyms +
                ", topics=" + topics +
                ", species=" + species +
                ", associations=" + associations +
                '}';
    }
}
