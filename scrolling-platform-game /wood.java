import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wood extends Enemies
{
    private int move1;
    private int countmove;
    private int movecount = 10;
    private boolean switched;
    private boolean m50;
    private boolean mm50;
    private int countswitch;
    private int switchcount = 10;
    //create boolean varibels and numbers
    public wood(){
        move1 = 50; //start moving right
        GreenfootImage wood = getImage(); //getImage for adjusting size
        wood.scale(wood.getWidth() + 80, wood.getHeight() +20);//adjusting size  
    }
    /**
     * Act - do whatever the wood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
    
    public void edge(){

        if(m50 ==true)
        { 
            //if is moving right, isAtEdge switch direction and counter that it doesnt turn 180°
            if(isAtEdge()){
                if(countswitch >= switchcount ){
                    move1 = -50;

                    countswitch = 0;
                }
            }
        }
        if(mm50 == true)
        {
            // look up just for moving left
            if(isAtEdge()){
                if(countswitch >= switchcount ){
                    move1 = 50;

                    countswitch = 0;
                }
            }
        }

    }    
}
