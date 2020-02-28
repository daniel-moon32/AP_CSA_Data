/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGameSales;
import core.data.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jfhs-lab3021-22
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("Z:\\VideoGameSales.csv").load();
        ds.printUsageString();
        ArrayList<VideoGames> sales = ds.fetchList(VideoGames.class, "Name", "Platform", "Year_of_Release", "Genre", "Publisher", "NA_Sales", "EU_Sales", "JP_Sales", "Other_Sales", "Global_Sales", "Critic_Score", "Critic_Count", "User_Score", "User_Count", "Developer", "Rating");
        System.out.println("What game do you want to find");
        Scanner input = new Scanner(System.in);

    }
    


}


