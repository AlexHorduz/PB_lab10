package lab10_PB_Horduz_Sachko_Sachko;

import java.util.ArrayList;

public class Actor {
	private final String name;
	private ArrayList<String> films;
	
	public Actor(String name, ArrayList<String> films) {
		this.name = name;
		this.films = films;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<String> getFilms() {
		return (ArrayList<String>) this.films.clone();
	}
	
	public void addFilm(String film) {
		this.films.add(film);
	}
}
