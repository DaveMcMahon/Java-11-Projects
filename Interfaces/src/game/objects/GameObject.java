package game.objects;

public abstract class GameObject {

	private String name;

	public GameObject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
