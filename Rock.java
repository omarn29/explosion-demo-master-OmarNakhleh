import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * act will call for explode() method
     * @param There is no parameters
     * @return Nothing is returned 
     */
    public void act() 
    {
        explode();
    }

    /**
     * explode will play MetalExplosion.wav, then use a for loop to 
     * add 50 new Debris objects to the world. After the for loop, 
     * it’ll remove itself from the world
     * 
     * @param There is no parameters
     * @return Nothing is returned 
     */
    private void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");
        for( int i = 0; i < 50; i++ )
        {
            getWorld().addObject( new Debris(), getX(), getY() );
            
        }
        getWorld().removeObject(this);
    }
}