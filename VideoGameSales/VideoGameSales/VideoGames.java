/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGameSales;

/**
 *
 * @author jfhs-lab3021-21
 */
public class VideoGames {

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
        private double userScore;
        private int userCount;
        private String developer;
        private String rating;

        VideoGames(String name, String platform, int yearOfRelease, String genre, String publisher, double naSales, double euSales, double jpSales, double otherSales, double globalSales, int criticScore, int criticCount, double userScore, int userCount, String developer, String rating)
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
        
        public String getName(){
          return name;
        }
         public String getPlatform(){
          return platform;
        }
         public int getYearOfRelease(){
          return yearOfRelease;
        }
         public String getGenre(){
          return genre;
        }
         public String getPublisher(){
          return publisher;
        }
         public double getNaSales(){
          return naSales;
        }
         public double getEuSales(){
          return euSales;
        }
         public double getjpSales(){
          return jpSales;
        }
         public double getOtherSales(){
          return otherSales;
        }
         public double getGlobalSales(){
          return globalSales;
        }
         public int getCriticScore(){
          return criticScore;
        }
         public int getCriticCount(){
          return criticCount;
        }
         public double getUserScore(){
          return userScore;
        }
         public int getUserCount(){
          return userCount;
        }
         public String getDeveloper(){
          return developer;
        }
         public String getRating(){
          return rating;
        }
        public String toString(){
            return "\n" + getName() + " Statistics:\nPlatform: " + getPlatform() + "\nYear of Release: " + getYearOfRelease() + "\nGenre: " + getGenre() + "\nPublisher: " + getPublisher() + "\nNA Sales: " +
                    getNaSales() + "\nEU Sales: " + getEuSales() + "\nJP Sales: " + getjpSales() + "\nOther Sales: " + getOtherSales() + "\nGlobal Sales: " + getGlobalSales() + "\nCritic Score: " +
                    getCriticScore() + "\nCritic Number: " + getCriticCount() + "\nUser Score: " + getUserScore() + "\nUser Count: " + getUserCount() + "\nDeveloper: " + getDeveloper() + "\nRating: " + getRating() + "\n";

        }


    }


