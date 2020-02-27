/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalabactivity4;
/**
 *
 * @author jfhs-lab3021-21
 */
public class DataLabActivity4 {

    /**
     * @param args the command line arguments
     *
     */
    private String name;
    private String platform;
    private int yearOfRelease;
    private String genre;
    private String publisher;
    private double naSales;
    private double euSales;
    private double jpSales;
    private double otherSales;
    private double globalSales;
    private int criticScore;
    private int criticCount;
    private int userScore;
    private int userCount;
    private String developer;
    private int rating;
    
    DataLabActivity4(String name, String platform, int yearOfRelease, String genere, String publisher,double naSales,double euSales, double jpSales, double globalSales,int criticScore, int criticCount,int userScore, int userCount,String developer, int rating)
    {
        this.name = name;
        this.platform = platform;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.publisher = publisher;
        this.naSales = naSales;
        this.euSales = euSales;
        this.jpSales = jpSales;
        this.otherSales = otherSales;
        this.globalSales = globalSales;
        this.criticScore = criticScore;
        this.criticCount = criticCount;
        this.userScore = userScore;
        this.userCount = userCount;
        this.developer = developer;
        this.rating = rating;
    }
    
    public String name() { 
      return name;
   }
   
   /* Produce the name of this station */
   public String platform() { 
      return platform;
   }
   public int yearOfRelease(){
       return yearOfRelease;
   }
   public String genre(){
       return genre;
   }
   public String publisher(){
       return publisher;
   }
   public double naSales(){
       return naSales;
   }
   public double euSales(){
       return euSales;
   }
   public double jpSales(){
       return jpSales;
   }
   public double globalSales(){
       return globalSales;
   }
   public int criticScore(){
       return criticScore;
   }
   public int criticCount(){
       return criticCount;

   }
   public int userScore(){
       return userScore;
   }
   public int userCount(){
       return userCount;
   }
   public String developer(){
       return developer;
   }
   public int rating(){
       return rating;
   }
}
