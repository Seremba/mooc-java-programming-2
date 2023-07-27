/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author seremba
 */
public class SaveableDictionary {

    private Map<String, String> translateToFinish;
    private Map<String, String> translateFromFinish;

    public SaveableDictionary() {
        this.translateToFinish = new HashMap<>();
        this.translateFromFinish = new HashMap<>();
    }

    public void add(String words, String translation) {
        this.translateToFinish.put(words, translation);
        this.translateFromFinish.put(translation, words);
    }

    public String translate(String word) {
        String translation = null;
        if (this.translateToFinish.containsKey(word)) {
            translation = this.translateToFinish.get(word);
        }
        if (this.translateFromFinish.containsKey(word)) {
            translation = this.translateFromFinish.get(word);
        }
        return translation;
    }

    public void delete(String word) {
        if (this.translateToFinish.containsKey(word)) {
            String translation = this.translateToFinish.get(word);
            this.translateToFinish.remove(word);
            this.translateFromFinish.remove(translation);
        }

        if (this.translateFromFinish.containsKey(word)) {
            String translation = this.translateFromFinish.get(word);
            this.translateFromFinish.remove(word);
            this.translateToFinish.remove(translation);
        }
    }
}
