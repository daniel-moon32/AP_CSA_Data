/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGameSales;
import java.util.ArrayList;
import core.data.*;
/**
 *
 * @author jfhs-lab3021-22
 */
public class VideoGameSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("C:\\Users\\Burni\\OneDrive\\Documents\\GitHub\\AP_CSA_Data\\VideoGameSales\\VideoGameSales\\Video_Game_Sales.csv");
        ds.load();
        ds.printUsageString();
        ArrayList<VideoGames> sales = ds.fetchList("VideoGames", "VideoGames/name", "VideoGames/platform", "VideoGames/yearOfRelease", "VideoGames/genre", "VideoGames/publisher", "VideoGames/naSales", "VideoGames/euSales", "VideoGames/jpSales", "VideoGames/otherSales", "VideoGames/globalSales", "VideoGames/criticScore", "VideoGames/criticCount", "VideoGames/userScore", "VideoGames/userCount", "VideoGames/developer", "VideoGames/rating");
        System.out.println(sales.get(1));
    }
    
}


