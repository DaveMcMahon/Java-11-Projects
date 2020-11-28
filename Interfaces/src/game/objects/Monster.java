package game.objects;

import interfaces.IDescribable;

public class Monster extends GameObject implements IDescribable {

	public Monster() {
		super("Monster");
	}

	@Override
	public String describe() {
		return "I am a Monster";
	}

}
