import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Enemies
{
    private int move1;
    private int countmove;
    private int movecount = 10;
    private boolean switched;
    private boolean m50;
    private boolean mm50;
    private int countswitch;
    private int switchcount = 10;
    private GreenfootImage carl = new GreenfootImage("carl.png");
    //create boolean varibels and numbers
    public car(){
        move1 = 50; //start moving right
        GreenfootImage carr = getImage(); //getImage for adjusting size
        carr.scale(carr.getWidth() + 30, carr.getHeight() +20);//adjusting size  
        carl.scale(carl.getWidth() + 30, carl.getHeight() +20);
    
    }

    public void act() 
    {
        ObjectinWorld = true;
        countmove++; //counter+1
        countswitch++;
        if(countmove>=movecount)
        {
            move(move1);
            countmove = 0;
        }
        edge();
        if(move1 == 50)
        { 
            //if moving right m50 = true mm50 = false
            m50 = true;
            mm50 = false;
        } 
        if(move1 == -50)
        { 
            //if moving left m50 = false mm50 = true
            m50 = false;
            mm50 = true;
        }
        isTouchingfrogger();
    }  
    
    public void edge()
    {
        if(m50 ==true)
        { 
            //if is moving right, isAtEdge switch direction and counter that it doesnt turn 180°
            if(isAtEdge())
            {
                if(countswitch >= switchcount )
                {
                    move1 = -50;
                    countswitch = 0;
                    turn(90);
                    move(50);
                    turn(90);
                }
            }
        }
        if(mm50 == true)
        { 
            // look up just for moving left
            if(isAtEdge())
            {
                if(countswitch >= switchcount )
                {
                    move1 = 50;
                    countswitch = 0;
                }
            }
        }
    }
}
