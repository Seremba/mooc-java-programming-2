/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author seremba
 */
public class SaveableDictionary {

    private File file;
    private Map<String, String> toFinish;
    private Map<String, String> fromFinish;

    public SaveableDictionary() {
        this.toFinish = new HashMap<>();
        this.fromFinish = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = new File(file);
    }

    public void add(String words, String translation) {
        this.toFinish.put(words, translation);
        this.fromFinish.put(translation, words);
    }

    public String translate(String word) {
        String translation = null;
        if (this.toFinish.containsKey(word)) {
            translation = this.toFinish.get(word);
        }
        if (this.fromFinish.containsKey(word)) {
            translation = this.fromFinish.get(word);
        }
        return translation;
    }

    public void delete(String word) {
        if (this.toFinish.containsKey(word)) {
            String translation = this.toFinish.get(word);
            this.toFinish.remove(word);
            this.fromFinish.remove(translation);
        }

        if (this.fromFinish.containsKey(word)) {
            String translation = this.fromFinish.get(word);
            this.fromFinish.remove(word);
            this.toFinish.remove(translation);
        }
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String sentence = scanner.nextLine();
                String[] words = sentence.split(":");

                this.toFinish.put(words[0], words[1]);
                this.fromFinish.put(words[1], words[0]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String key : this.toFinish.keySet()) {
                writer.append(key + ":" + this.toFinish.get(key));
            }
            writer.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
