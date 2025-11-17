package edu.pitt.cs;

public class CatImpl implements Cat {

	public int id;
	public String name;
	public boolean isRented;
	public boolean isReturned;


	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.isRented = false;
		this.isReturned = false;
	}

	public void rentCat() {
		this.isRented = true;
	}

	public void returnCat() {
		this.isRented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return isRented;
	}

	public String toString() {
		return "ID " + this.id + ". " + this.name;
	}

}