/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class CD implements Packable {

    private String artist;
    private String cdName;
    private int publicationYear;

    public CD(String artist, String cdName, int publicationYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.artist + ": "+ this.cdName +" (" + this.publicationYear + ")";
                //Pink Floyd: Dark Side of the Moon (1973)
    }

    
}
