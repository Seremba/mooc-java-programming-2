/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Book implements Packable{
    private String author;
    private String bookName;
    private double bookweight;

    public Book(String author, String bookName, double bookweight) {
        this.author = author;
        this.bookName = bookName;
        this.bookweight = bookweight;
    }
    
    @Override
    public double weight() {
         return this.bookweight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.bookName;
    }
    
}
