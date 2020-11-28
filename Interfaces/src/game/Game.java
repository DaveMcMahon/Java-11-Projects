package game;

import database.Library;
import game.objects.GameObject;
import game.objects.Monster;
import game.objects.Player;
import interfaces.IDescribable;

public class Game {

	// Parent and child class relationship only
	private GameObject[] objs = { new Player(), new Monster() };

	// Any type of object regardless of parents class, once its interfaced
	private IDescribable[] iobjs = { new Library("Oracle 12c Port 2234"), new Library("MSSQL 2013 Poert 3532"),
			new Player(), new Monster() };

	public void start() {
		for (var obj : objs) {
			System.out.println(obj);
		}

		for (IDescribable objs : iobjs) {
			System.out.println(objs.describe());
		}

	}

}
