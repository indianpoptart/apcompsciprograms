package com.apcompsci.GridWorld.knightBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

import com.apcompsci.GridWorld.critters.ChameleonCritter;

public class KnightCritterRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
        
        world.add(new Location(4, 4), new KnightCritter());
        world.show();
        
	}

}
