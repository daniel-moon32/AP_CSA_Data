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
public class VideoGameSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("Z:\\VideoGameSales.csv").load();
        ArrayList<VideoGames> sales = ds.fetchList(VideoGames.class, "Name", "Platform", "Year_of_Release", "Genre", "Publisher", "NA_Sales", "EU_Sales", "JP_Sales", "Other_Sales", "Global_Sales", "Critic_Score", "Critic_Count", "User_Score", "User_Count", "Developer", "Rating");
        sort(sales);
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option:\n1. Find game by name\n2. Find Games by Developer\n3. Find Games by Critic Score\n4. Find Games by User Score\n5. Quit");
        int option = input.nextInt();
        while(true) {
            while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5) {
                System.out.println("Please choose an option:\n1. Find game by name\n2. Find Games by Developer\n3. Find Games by Critic Score\n4. Find Games by User Score\n5. Quit");
                option = input.nextInt();
            }

            if(option == 1){
                System.out.println("Please enter the name of the game you wish to find: ");
                String name = input.nextLine();
                name = input.nextLine();
                System.out.println(sales.get(SearchName(sales, name)).toString());
            }
            else if(option == 2){
                System.out.println("Please enter the name of the developer of the Games you wish to find: ");
                String dev = input.nextLine();
                dev = input.nextLine();
                ArrayList<Integer> templist = SearchDev(sales, dev);
                for (Integer integer : templist) {
                    System.out.println(sales.get(integer).toString());
                }

            }else if(option ==3){
                System.out.println("Please enter the minimum critic score of a game you would like to find (Out of 100): ");
                double minScore = input.nextDouble();
                ArrayList<Integer> templist = CriticScore(sales, minScore);
                for(Integer integer: templist){
                    System.out.println(sales.get(integer).toString());
                }
            }else if(option ==4){
                System.out.println("Please enter the minimum user score of a game you would like to find (Out of 10): ");
                double minScore = input.nextDouble();
                ArrayList<Integer> templist = UserScore(sales, minScore);
                for(Integer integer: templist){
                    System.out.println(sales.get(integer).toString());
                }
            }else{
                break;
            }
            System.out.println("Please choose an option:\n1. Find game by name\n2. Find Games by Developer\n3. Find Games by Critic Score\n4. Find Games by User Score\n5. Quit");
            option = input.nextInt();
        }

    }

    static int SearchName(ArrayList<VideoGames> array, String name){
            int output = -1;
            for(int i = 0; i<array.size(); i ++){
                if(array.get(i).getName().equals(name)){
                    output = i;
                }
            }
            return output;
    }

    static ArrayList<Integer> SearchDev(ArrayList<VideoGames> array, String name){
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i<array.size(); i ++){
            if(array.get(i).getDeveloper().equals(name)){
                output.add(i);
            }
        }
        return output;
    }

    static ArrayList<Integer> CriticScore(ArrayList<VideoGames> array, double criticScore){
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i<array.size(); i ++){
            if(array.get(i).getCriticScore()>criticScore){
                output.add(i);
            }
        }
        return output;
    }

    static ArrayList<Integer> UserScore(ArrayList<VideoGames> array, double userScore){
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i<array.size(); i ++){
            if(array.get(i).getUserScore()>userScore){
                output.add(i);
            }
        }
        return output;
    }


    static void sort(ArrayList<VideoGames> array){
        for(int i = 1; i < array.size(); i++){
            VideoGames currentGame = array.get(i);
            String currentString = currentGame.getName();
            int currentidx = i -1;


            while(currentidx >=  0  && array.get(currentidx).getName().compareTo(currentString) > 0){
                array.set(currentidx+1, array.get(currentidx));
                currentidx --;


            }

            array.set(currentidx+1, currentGame);
        }
    }

}


