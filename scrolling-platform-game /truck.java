import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class truck extends Enemies
{
    private int countmove; 
    private int movecount = 2;
    private int truckcount = 100; //increase for less trucks decrease for faster truck rate
    private int counttruck;
    
    public truck()
    {
        GreenfootImage truck = getImage();
        truck.scale(truck.getWidth() +50, truck.getHeight() +20 );
        
    }

    public void act() 
    {
        ObjectinWorld = true;
        counttruck++;
        edge();
        countmove++;
        newtruck();
        isTouchingfrogger();
        if(countmove>= movecount)
        {
            move(-10);
            countmove = 0;
        }
    }
    public void newtruck()
    {
        
            if(counttruck>=truckcount){
                
                getWorld().addObject(new truck(), 600, getY());
                counttruck = 0;
            }
        
    }

    public void edge()
    {
        if(isAtEdge()){
            getWorld().removeObject(this);
            ObjectinWorld = false;
        }
    }
}
