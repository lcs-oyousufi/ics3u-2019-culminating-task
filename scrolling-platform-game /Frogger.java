import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frogger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frogger extends Actor
{
    private int countmove1;
    private int movecount1 = 10;
    
    private int countmove2;
    private int movecount2 = 10;
    
    private int countturn1;
    private int turncount1 = 15;
    
    private int countturn2;
    private int turncount2 = 15;
    //varibels(int) for counter/delay between moves and turns
    public frogger(){
        turn(-90);  //turn position for right direction move()

    }

    public void act() 
    {
        checkkeys();    //ask keys if pressed
        countmove1++;  //counter++
        countmove2++;  //counter++
        countturn2++;  //counter++
        countturn1++;  //counter++

    } 

    public void checkkeys(){
        //ask if key is pressed
        if(Greenfoot.isKeyDown("up")){
            if(countmove1 >= movecount1){ // ask if counter = set number for delay 
                move(55);
                countmove1 = 0;//counter set 0 for new row
            }
        }
        
        if(Greenfoot.isKeyDown("down")){
            if(countmove2 >= movecount2){ // ask if counter = set number for delay 
                move(-55);
                countmove2 = 0;//counter set 0 for new row
            }
        }

        if(Greenfoot.isKeyDown("left")){
            // compares if counter >= set number for delay 
            if(countturn2 >= turncount2){ 
               
                // ask for rotation that you cant turn so far that you can move backwards
                if(getRotation() == 270){
                    turn(-90); 
                    countturn2 = 0; 
                    //counter set 0 for new now

                }
            }

            // compares if counter >= set number for delay
            if(countturn2 >= turncount2){  
                // ask for rotation that you cant turn so far that you can move backwards
                if(getRotation() == 0){
                    turn(-90);
                    countturn2 = 0; 
                    //counter set 0 for new now
                }
            }
        }
         
        //ask if key is pressed
        if(Greenfoot.isKeyDown("right")){
            // compares if counter >= set number for delay 
            if(countturn1 >= turncount1){
                // ask for rotation that you cant turn so far that you can move backwards
                if(getRotation() == 270){
                    turn(90);
                    countturn1 = 0; 
                    //counter set 0 for new row
                }
            }
             
            // compares if counter >>= set number for delay
            if(countturn1 >= turncount1){ 
                // ask for rotation that you cant turn so far that you can move backwards
                if(getRotation() == 180){
                    turn(90);
                    countturn1 = 0; 
                }
                //counter set 0 for new now
            }
        }
    }
}
