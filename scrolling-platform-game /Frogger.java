import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frogger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frogger extends Actor
{
    private int countMove;

    private int movecount;

    private int countMove2;

    private int movecount2;

    private int countturn1;
    private int turncount1 = 15;
    private int countturn2;
    private int turncount2 = 15;
    // the int is for the delay between the turns and moves
    public frogger()
    {
        //position to turn right
        turn(-90);

    }

    /**
     * Act - do whatever the Frogger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // ask for keys that are being pressed
        checkkeys();

    }    
    public void checkkeys()
    {
        //ask if key is pressed
        if(Greenfoot.isKeyDown("up"))
        {
            if(countMove >= movecount)
            // ask for the count and set number for delay 
            { 
                move(55);
                //the count is being set to 0 for new row
                countMove = 0;
            }
        }

        if(Greenfoot.isKeyDown("down"))
        {
            if(countMove2>=movecount2)
            // ask for the count and set number for delay 
            { 
                move(-55);
                //the count is being set to 0 for new row
                countMove2 = 0;
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
