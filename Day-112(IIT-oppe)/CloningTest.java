// Director.java
class Director implements Cloneable {
    private String name;
    private int experience;

    // Constructor
    public Director(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // toString
    @Override
    public String toString() {
        return "Director{name='" + name + "', experience=" + experience + "}";
    }

    // clone (deep copy not needed here since fields are primitives/immutable Strings)
    @Override
    protected Director clone() throws CloneNotSupportedException {
        return (Director) super.clone();
    }
}

// Movie.java
class Movie implements Cloneable {
    private String title;
    private Director director;

    // Constructor
    public Movie(String title, Director director) {
        this.title = title;
        this.director = director;
    }

    // Mutators (setters)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    // toString
    @Override
    public String toString() {
        return "Movie{title='" + title + "', director=" + director + "}";
    }

    // Deep clone
    @Override
    protected Movie clone() throws CloneNotSupportedException {
        Movie cloned = (Movie) super.clone();
        cloned.director = director.clone(); // deep copy of Director
        return cloned;
    }
}

// CloningTest.java
public class CloningTest {
    public static void main(String[] args) {
        try {
            Director d1 = new Director("Christopher Nolan", 25);
            Movie m1 = new Movie("Inception", d1);

            // Clone m1 to create m2 (deep copy)
            Movie m2 = m1.clone();

            // Modify m2’s details
            m2.setTitle("Interstellar");
            m2.getDirector().setName("Denis Villeneuve"); // change director in m2

            // Printing both movies
            System.out.println("Movie 1: " + m1);
            System.out.println("Movie 2: " + m2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
