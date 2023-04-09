import java.util.Arrays;

public class Movie {
    private int movieId;
    private String title;
    private String directorName;
    private String[] actorsName;
    private String date;
    private String definition;
    private String type;

    public Movie(int movieId, String title, String directorName, String[] actorsName, String date, String definition, String type) {
        this.movieId=movieId;
        this.title = title;
        this.directorName = directorName;
        this.actorsName = actorsName;
        this.date = date;
        this.definition = definition;
        this.type = type;
    }

    public int getId() {
        return movieId;
    }

    public void setId(int id) {
        this.movieId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String[] getActorsName() {
        return actorsName;
    }

    public void setActorsName(String[] actorsName) {
        this.actorsName = actorsName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + movieId +
                ", title='" + title + '\'' +
                ", directorName='" + directorName + '\'' +
                ", actorsName=" + Arrays.toString(actorsName) +
                ", date='" + date + '\'' +
                ", definition='" + definition + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
