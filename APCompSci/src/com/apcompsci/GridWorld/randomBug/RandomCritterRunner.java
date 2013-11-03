package com.apcompsci.GridWorld.randomBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

import com.apcompsci.GridWorld.critters.ChameleonCritter;

public class RandomCritterRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
        int x = (int)(Math.random() * 10) + 1;
        int y = (int)(Math.random() * 10) + 1;
        System.out.println(x + " " + y);
        world.add(new Location(y, x), new RandomCritter());
        world.add(new Location(1, 2), new RandomCritter());
        world.add(new Location(3, 4), new RandomCritter());
        world.add(new Location(2, 6), new RandomCritter());
        world.add(new Location(7, 2), new RandomCritter());
        world.show();
        	
	}

}
