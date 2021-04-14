package lab10_PB_Horduz_Sachko_Sachko;


import java.util.ArrayList;
import java.util.List;

public class Films_DB {
	private List<Film> films;
    private List<Actor> actors;

    public Films_DB() {
        this.films = new ArrayList<Film>();
        this.actors = new ArrayList<Actor>();
    }
    
    public Films_DB(ArrayList<Film> films, ArrayList<Actor> actors) {
    	this.films = films;
    	this.actors = actors;
    }

    public void addFilm(Film film) {
        films.add(film);
    }


    public boolean removeFilm(Film film) {
        return films.remove(film);
    }

    public boolean removeFilm(int index) {
        if (index < films.size() && index >= 0)
            return removeFilm(films.get(index));
        return false;
    }

    public void addActor(Actor actor) {
    	if (actor == null) {
            throw new NullPointerException("Null passed as a parameter");
        }
        actors.add(actor);
    }

    public boolean removeActor(Actor actor) {
        return actors.remove(actor);
    }

    public boolean removeActor(int index) {
        if (index < actors.size() && index >= 0)
            return removeActor(actors.get(index));
        return false;
    }

    public List<Film> getFilms() {
        return (List<Film>) ((ArrayList<Film>)films).clone();
    }

    public List<Actor> getActors() {
        return (List<Actor>) ((ArrayList<Actor>)actors).clone();
    }
    
    @Override
    public int hashCode()
    {
    	final int prime = 17;
	int result = 1;
	result = prime * result + films.hashCode();
	result = prime * result + actors.hashCode();
	return result;
    }
    
    @Override
    public boolean equals(Object o) {
    	if (this == o) {
    		return true;
    	}
    	
    	if (o == null || getClass() != o.getClass()){ 
    		return false;
    	}
    	
    	Films_DB other = (Films_DB) o;
    	
    	return other.hashCode() == hashCode();
    }
} 
