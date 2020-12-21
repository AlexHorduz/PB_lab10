package lab10_PB_Horduz_Sachko_Sachko;

import java.util.ArrayList;

public class Films_DB {
	private static ArrayList<Film> films = new ArrayList<Film>();
	private static ArrayList<Actor> actors = new ArrayList<Actor>();
	
	private Films_DB() {
	}
	
	public static void addFilm(Film film) {
		if (!films.contains(film))
			films.add(film);
	}
	
	public static boolean removeFilm(Film film) {
		return films.remove(film);
	}
	
	public static void addActor(Actor actor) {
		if (!actors.contains(actor))
			actors.add(actor);
	}
	
	public static boolean removeActor(Actor actor) {
		return actors.remove(actor);
	}
	
	public static ArrayList<Film> getFilms() {
		return (ArrayList<Film>) films.clone();
	}
	
	public static ArrayList<Actor> getActors() {
		return (ArrayList<Actor>) actors.clone();
	}
} 
