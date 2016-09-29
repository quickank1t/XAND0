/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexando;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ankit
 */
public class GameXandO {

    /**
     * @param args the command line arguments
     */
    
    private static int [] gameArray = new int [9];

    public static int[] getGameArray() {
        return gameArray;
    }

    public static void setGameArray(int[] gameArray) {
        GameXandO.gameArray = gameArray;
    }
    
        
    public static void main(String[] args) {
        // objects variables 
        Bot bot = new Bot();
        Display display = new Display ();
        gameControler game = new gameControler();
        Scanner read = new Scanner (System.in);
        int difficulty,userMove,count=0;
        boolean gameEnd=false,skip;
        
        //setting difficulty
        display.askForDificultyLvl();
        difficulty = read.nextInt();
        
        if(difficulty != 1){
            bot.playRandomMove();
            count++;
        }else{
            gameArray[4]=10;
            count++;
        }
        
        display.game();
        
        try{
            while(!gameEnd){
                userMove= read.nextInt();
                userMove--;
                if(gameArray[userMove] == 0){
                    gameArray[userMove]=20;
                    if(game.checkIfWon(20)){
                        System.out.println("Player Won");
                        
                        break;
                    }
                    count++;
                }else{
                    System.out.println("Cannot play that move! try again");
                    continue;
                }
                if(difficulty == 3){
                    bot.playRandomMove();
                    count++;
                }else if(difficulty == 2){
                    skip=false;
                    skip = bot.checkIfWining(10);
                    if(skip){
                        count++;
                        display.game();
                        //break;
                    }else{
                        skip=bot.checkIfWining(20);
                        if(skip){
                            count++;
                        }else{
                            bot.playRandomMove();
                            count++;
                        }
                    }
                }else{
                    skip=false;
                    skip = bot.checkIfWining(10);
                    if(skip){
                        count++;
                        display.game();
                        //break;
                    }else{
                        skip=bot.checkIfWining(20);
                        if(skip){
                            count++;
                        }else{
                            skip= bot.smartCheckr();
                            if(skip){
                                count++;
                            }else{
                                bot.playRandomMove();
                                count++;
                            }
                        } 
                    }
                }
                if(game.checkIfWon(10)){
                    System.out.println("OMG! bot won");
                    display.game();
                    break;
                }
                if(count == 9){
                    System.out.println("DRAW");
                    gameEnd=true;
                }
                display.game();
            }
            
        }catch(InputMismatchException i){
            System.out.println("Please cheak the input");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //bot.playRandomMove();
    }
    
}
