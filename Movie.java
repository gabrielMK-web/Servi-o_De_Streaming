// Representa um filme e herda de MediaItem.
// Também implementa Streamable, permitindo transmissão.
public class Movie extends MediaItem implements Streamable {

    // Nome do diretor do filme
    private String director;

    // Construtor preenche os dados básicos + diretor
    public Movie(int id, String title, int duration, String genre, String director) {
        super(id, title, duration, genre);
        this.director = director;
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    // Ação de tocar o filme
    @Override
    public void play() {
        System.out.println("Tocando filme: " + getTitle() + " (diretor: " + director + ")");
    }

    // Streaming chama uma mensagem e depois play()
    @Override
    public void stream() {
        System.out.println("Stream do filme: " + getTitle());
        play();
    }

    @Override
    public String toString() {
        return "Movie{" + getId() + ", '" + getTitle() + "'}";
    }
}
