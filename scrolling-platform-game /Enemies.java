import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    public boolean ObjectinWorld;
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 

    public void isTouchingfrogger()
    {
        if(ObjectinWorld == true)
        {
            //with help from someone I got a fix for the enemies otherwise when they were being removed they would bug
            if(isTouching(frogger.class)){
                Greenfoot.stop();
            }
        }
    }
}
