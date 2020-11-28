package game.objects;

import interfaces.IDescribable;

public class Player extends GameObject implements IDescribable {
	
	public Player() {
		super("Player");
	}

	@Override
	public String describe() {
		return "I am a Player";
	}

}
