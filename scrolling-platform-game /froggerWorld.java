import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Template for a side-scrolling platform game.
 * 
 * @author R. Gordon
 * @version May 8, 2019
 */
public class froggerWorld extends World
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */    
 

    // Hero
    frogger thefrogger;

    // Track whether game is on
    private boolean isGameOver;

    /**
     * Constructor for objects of class SideScrollingWorld.
     */
    public froggerWorld()
    {    
        // Create a new world with 612x1000 cells with a cell size of 1x1 pixels.
        super(612, 1000, 1); 

        // Set up the starting scene
        addObject(new frogger(), 306, 968);

        // Game on
        isGameOver = false;
    }

    /**
     * Set up the entire world.
     */
   

    /**
     * Add blocks to create the ground to walk on at bottom-left of scrollable world.
     */
    

    /**
     * Add some fences at left and right side.
     */
    

    /**
     * Add steps made out of metal plates leading to end of world.
     */


    /**
     * Add a few clouds for the opening scene.
     */
    

    /**
     * Act
     * 
     * This method is called approximately 60 times per second.
     */
    public void act()
    {
    }

    

    /**
     * Add blocks to create the ground to walk on at top-right of scrollable world.
     */
    

    /**
     * Return an object reference to the hero.
     */
    public frogger getFrogger()
    {
        return thefrogger;
    }

    /**
     * Set game over
     */
    public void setGameOver()
    {
        isGameOver = true;
    }
}

