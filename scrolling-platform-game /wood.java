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
        // Add your action code here.

    }    
}
