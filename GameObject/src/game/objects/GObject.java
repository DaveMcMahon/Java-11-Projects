package game.objects;

public abstract class GObject implements Comparable<GObject> {

	private int id;
	private String name;

	// @formatter:off
	private int[][] comparison = {
							//	Rock	Paper	Scissors
			/*	Rock */		{	0,		-1,		1	},
			/*	Paper */	{	1,		0,		-1	},
			/*	Scissors */	{	-1,		1,		0	}
	};
	// @formatter:on

	@Override
	public int compareTo(GObject other) {
		return comparison[this.id][other.id];
	}

	public GObject(int id, String name) {
		this.id = id;
		this.name = name;
	}

	protected int getID() {
		return this.id;
	}

	protected String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return getName();
	}
}
