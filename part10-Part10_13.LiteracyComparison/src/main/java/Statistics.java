/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seremba
 */
public class Statistics{
    private String country;
    private int year;
    private String gender;
    private Double percentage;

    public Statistics(String country, int year, String gender, Double percentage) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percentage = percentage;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public Double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percentage;
    }
    
}
//Niger (2015), female, 11.01572