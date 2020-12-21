package lab10_PB_Horduz_Sachko_Sachko;

import java.util.ArrayList;

public class Film {
	private final String name;
	private final ArrayList<String> actors;
	
	public Film(String name, ArrayList<String> actors) {
		this.name = name;
		this.actors = actors;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<String> getActors() {
		return (ArrayList<String>) this.actors.clone();
	}
}
