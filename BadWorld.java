import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadWorld here.
 * 
 * @author Omar Nakhleh
 * @professor Scott Hardman
 * @Assigment Assignment 2 part 2
 * @version (3/23/2017)
 */
public class BadWorld extends World
{
    /**
     * Constructor for objects of class BadWorld.
     * 
     */
    public BadWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * @param There is no parameters
     * @return Nothing is returned 
     */
    private void prepare()
    {
        Explosion explosion = new Explosion();
        addObject(explosion,130,108);
        Explosion explosion2 = new Explosion();
        addObject(explosion2,421,90);
        Explosion explosion3 = new Explosion();
        addObject(explosion3,457,224);
        Explosion explosion4 = new Explosion();
        addObject(explosion4,184,262);
        Explosion explosion5 = new Explosion();
        addObject(explosion5,380,334);
        Rock rock = new Rock();
        addObject(rock,391,341);
        Rock rock2 = new Rock();
        addObject(rock2,463,236);
        Rock rock3 = new Rock();
        addObject(rock3,423,93);
        Rock rock4 = new Rock();
        addObject(rock4,194,275);
        Rock rock5 = new Rock();
        addObject(rock5,132,104);
        rock4.setLocation(188,264);
        rock2.setLocation(461,228);
    }
}
