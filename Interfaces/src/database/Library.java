package database;

import interfaces.IDescribable;

public class Library implements IDescribable {

	private String desc;

	public Library(String desc) {
		this.desc = desc;
	}

	@Override
	public String describe() {
		return this.desc;
	}

}
