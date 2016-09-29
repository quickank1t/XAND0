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
public class Display {

    void game() {
        
        System.out.println("");
        System.out.println("");
        int [] gameArray = GameXandO.getGameArray();
        int counter=0,count=1;
        for(int i=0;i<9;i++){
            if(gameArray[i] == 10){
                System.out.print("  X  ");
            }else  if(gameArray[i] == 20){
                 System.out.print("  0  ");
            }else{
                 System.out.print("     ");
            }
            
            if((i + 1) % 3 == 0){
                System.out.print("    "+count+++"|  "+count+++"|  "+ count++);
            }
            
            if(counter == 2){
                System.out.println("");
                if(i < 7){
                    System.out.println("    -   -   -        -   -   -");
                }
                
                counter=0;
            }else{
                System.out.print("|");
                counter++;
            } 
        }
        System.out.println("");
        System.out.println("");
    }
    
     void askForDificultyLvl() {
        System.out.println("Enter Dificulty");
        System.out.println("1.pro");
        System.out.println("2.ok");
        System.out.println("3.noob");
    }
    
}
