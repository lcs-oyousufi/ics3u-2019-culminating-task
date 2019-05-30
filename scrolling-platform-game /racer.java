import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class racer extends Enemies
{
    private int countmove; 
    private int movecount = 2;
    private int racercount = 100; //increase for less trucks decrease for faster truck rate
    private int countracer;
    
    public racer(){
        GreenfootImage racer = getImage();
        racer.scale(racer.getWidth() +40, racer.getHeight() +20 );
        
    }

    public void act() 
    {
        ObjectinWorld = true;
        countracer++;
        edge();
        countmove++;
        newracer();
        isTouchingfrogger();
        if(countmove>= movecount){
            move(10);
            countmove = 0;
        }
    }
    public void newracer(){
        
            if(countracer>=racercount){
                
                getWorld().addObject(new racer(), 12, getY());
                countracer = 0;
            }
        
    }

    public void edge(){
        if(isAtEdge()){
            getWorld().removeObject(this);
            ObjectinWorld = false;
        }
    }
}
