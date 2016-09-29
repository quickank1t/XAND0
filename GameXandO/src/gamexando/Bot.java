/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexando;

import java.util.Random;

/**
 *
 * @author Ankit
 */
public class Bot {

    void playRandomMove() {
       int randomNumber;
        Random rand = new Random();
        int [] gameArray=new int [9];
        gameArray= GameXandO.getGameArray();
        while(true){
            randomNumber=rand.nextInt(9) + 0;
            //System.out.println("=====================================random");
            if(gameArray[randomNumber] == 0){
                gameArray[randomNumber]=10;
                break;
            }
        }
        GameXandO.setGameArray(gameArray);
    }

    boolean checkIfWining(int num) {
        int num2= 10;
        boolean changed =false;
        
        int gameArray [] = GameXandO.getGameArray();

        if(gameArray[0] == num && gameArray[1] == num )  {
            if(gameArray[2] == 0){
                 gameArray[2] = num2;
                 changed =true;
            }  
        }else if(gameArray[0] == num && gameArray[2] == num){
            if(gameArray[1] == 0){
                gameArray[1] = num2;
                changed =true;
            }
        }else if(gameArray[2] == num && gameArray[1] == num){
            if(gameArray[0] == 0){
                gameArray[0] = num2;
                changed =true;
            }
        }
        
        if(gameArray[3] == num && gameArray[4] == num){
             if(gameArray[5] == 0){
                gameArray[5] = num2;
                changed =true;
             }
        }else if(gameArray[5] == num && gameArray[3] == num){
             if(gameArray[4] == 0){
                 gameArray[4] = num2;
                 changed =true; 
             }
        }else if(gameArray[4] == num && gameArray[5] == num){
            if(gameArray[3] == 0){
                 gameArray[3] = num2;
                 changed =true; 
             }
        }
        
        if(gameArray[6] == num && gameArray[7] == num){
            if(gameArray[8] == 0){
                 gameArray[8] = num2;
                 changed =true; 
             }
        }else if(gameArray[8] == num && gameArray[6] == num){
            if(gameArray[7] == 0){
                 gameArray[7] = num2;
                 changed =true; 
             }
        }else if(gameArray[7] == num && gameArray[8] == num){
            if(gameArray[6] == 0){
                 gameArray[6] = num2;
                 changed =true; 
             }
        }
        
        if(!changed){
            if(gameArray[0] == num && gameArray[3] == num){
            if(gameArray[6] == 0){
                 gameArray[6] = num2;
                 changed =true; 
             }
            }else if(gameArray[0] == num && gameArray[6] == num){
                if(gameArray[3] == 0){
                     gameArray[3] = num2;
                     changed =true; 
                 }
            }else if(gameArray[3] == num && gameArray[6] == num){
                if(gameArray[0] == 0){
                     gameArray[0] = num2;
                     changed =true; 
                 }
            }

            if(gameArray[1] == num && gameArray[4] == num){
                if(gameArray[7] == 0){
                     gameArray[7] = num2;
                     changed =true; 
                 }
            }else if(gameArray[7] == num && gameArray[1] == num){
                if(gameArray[4] == 0){
                     gameArray[4] = num2;
                     changed =true; 
                 }
            }else if(gameArray[4] == num && gameArray[7] == num){
                if(gameArray[1] == 0){
                     gameArray[1] = num2;
                     changed =true; 
                 }
            }

            if(gameArray[5] == num && gameArray[8] == num){
                if(gameArray[2] == 0){
                     gameArray[2] = num2;
                     changed =true; 
                 }
            }else if(gameArray[2] == num && gameArray[5] == num){
                if(gameArray[8] == 0){
                     gameArray[8] = num2;
                     changed =true; 
                 }
            }else if(gameArray[2] == num && gameArray[8] == num){
                if(gameArray[5] == 0){
                     gameArray[5] = num2;
                     changed =true; 
                 }
            }
        }
        
        if(!changed){
            if(gameArray[0] == num && gameArray[4] == num){
            if(gameArray[8] == 0){
                 gameArray[8] = num2;
                 changed =true; 
             }
            }else if(gameArray[0] == num && gameArray[8] == num){
                if(gameArray[4] == 0){
                     gameArray[4] = num2;
                     changed =true; 
                 }
            }else if(gameArray[4] == num && gameArray[8] == num){
                if(gameArray[0] == 0){
                     gameArray[0] = num2;
                     changed =true; 
                 }
            }

            if(gameArray[4] == num && gameArray[6] == num){
                if(gameArray[2] == 0){
                     gameArray[2] = num2;
                     changed =true; 
                 }
            }else if(gameArray[2] == num && gameArray[4] == num){
                if(gameArray[6] == 0){
                     gameArray[6] = num2;
                     changed =true; 
                 }
            }else if(gameArray[2] == num && gameArray[6] == num){
                if(gameArray[4] == 0){
                     gameArray[4] = num2;
                     changed =true; 
                 }
            }
        }
        
        
        if(changed == true){
            GameXandO.setGameArray(gameArray);
        }
        //System.out.println("trytowin");
        return changed;
    }

    boolean smartCheckr() {
        int gameArray [] = GameXandO.getGameArray();
        boolean changed=false;
        int usermove=20;
        if(gameArray[3] == usermove && gameArray[7] == usermove){
            if(gameArray[0] == 0 && gameArray[6] == 0 && gameArray[8] == 0){
                gameArray[6]= 10;
                changed=true;
            }       
        }else if(gameArray[3] == usermove && gameArray[1] == usermove){
            if(gameArray[0] == 0 && gameArray[6] == 0 && gameArray[2] == 0){
                gameArray[0]= 10;
                changed=true;
            }       
        }else if(gameArray[1] == usermove && gameArray[5] == usermove){
            if(gameArray[0] == 0 && gameArray[2] == 0 && gameArray[8] == 0){
                gameArray[2]= 10;
                changed=true;
            }       
        }else if(gameArray[5] == usermove && gameArray[7] == usermove){
            if(gameArray[2] == 0 && gameArray[8] == 0 && gameArray[6] == 0){
                gameArray[8]= 10;
                changed=true;
            }       
        }else if(gameArray[1] == usermove && gameArray[6] == usermove){
            if(gameArray[0] == 0 && gameArray[2] == 0 && gameArray[3] == 0){
                gameArray[0]= 10;
                changed=true;
            }       
        }else if(gameArray[3] == usermove && gameArray[2] == usermove){
            if(gameArray[0] == 0 && gameArray[6] == 0 && gameArray[1] == 0){
                gameArray[0]= 10;
                changed=true;
            }       
        }else if(gameArray[2] == usermove && gameArray[6] == usermove){
            if(gameArray[0] == 0 && gameArray[1] == 0 && gameArray[3] == 0){
                gameArray[0]= 10;
                changed=true;
            }       
        }else if(gameArray[0] == usermove && gameArray[7] == usermove){
            if(gameArray[3] == 0 && gameArray[6] == 0 && gameArray[8] == 0){
                gameArray[6]= 10;
                changed=true;
            }       
        }else if(gameArray[3] == usermove && gameArray[8] == usermove){
            if(gameArray[0] == 0 && gameArray[6] == 0 && gameArray[7] == 0){
                gameArray[6]= 10;
                changed=true;
            }       
        }else if(gameArray[0] == usermove && gameArray[8] == usermove){
            if(gameArray[3] == 0 && gameArray[6] == 0 && gameArray[7] == 0){
                gameArray[6]= 10;
                changed=true;
            }       
        }else if(gameArray[1] == usermove && gameArray[8] == usermove){
            if(gameArray[0] == 0 && gameArray[2] == 0 && gameArray[5] == 0){
                gameArray[2]= 10;
                changed=true;
            }       
        }else if(gameArray[0] == usermove && gameArray[5] == usermove){
            if(gameArray[1] == 0 && gameArray[2] == 0 && gameArray[8] == 0){
                gameArray[2]= 10;
                changed=true;
            }       
        }else if(gameArray[0] == usermove && gameArray[8] == usermove){
            if(gameArray[1] == 0 && gameArray[2] == 0 && gameArray[5] == 0){
                gameArray[2]= 10;
                changed=true;
            }       
        }else if(gameArray[2] == usermove && gameArray[7] == usermove){
            if(gameArray[5] == 0 && gameArray[6] == 0 && gameArray[8] == 0){
                gameArray[8]= 10;
                changed=true;
            }       
        }else if(gameArray[5] == usermove && gameArray[6] == usermove){
            if(gameArray[2] == 0 && gameArray[7] == 0 && gameArray[8] == 0){
                gameArray[8]= 10;
                changed=true;
            }       
        }else if(gameArray[2] == usermove && gameArray[6] == usermove){
            if(gameArray[8] == 0 && gameArray[7] == 0 && gameArray[5] == 0){
                gameArray[8]= 10;
                changed=true;
            }       
        }
            if(changed){
                GameXandO.setGameArray(gameArray);
            }
            
           return changed;
    }
    
}
