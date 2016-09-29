/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexando;

/**
 *
 * @author Ankit
 */
public class gameControler {
    
     boolean checkIfWon(int num) {
        int [] gameArray = GameXandO.getGameArray();
        if(gameArray[0] == num && gameArray[1] == num && gameArray[2] == num  ){
            return true;
        }else if(gameArray[3] == num && gameArray[4] == num && gameArray[5] == num ){
            return true;
        }else if(gameArray[6] == num && gameArray[7] == num && gameArray[8] == num ){
            return true;
        }else if(gameArray[0] == num && gameArray[3] == num && gameArray[6] == num ){
            return true;
        }else if(gameArray[1] == num && gameArray[4] == num && gameArray[7] == num ){
            return true;
        }else if(gameArray[2] == num && gameArray[5] == num && gameArray[8] == num ){
            return true;
        }else if(gameArray[0] == num && gameArray[4] == num && gameArray[8] == num ){
            return true;
        }else if(gameArray[2] == num && gameArray[4] == num && gameArray[6] == num ){
            return true;
        }
        return false;
        
    }
     
}
