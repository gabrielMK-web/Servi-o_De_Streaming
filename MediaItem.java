// Classe abstrata que serve como base para qualquer tipo de mídia.
// Ela obriga subclasses a implementarem play().
public abstract class MediaItem {

    // Identificador do item
    private int id;

    // Título da mídia
    private String title;

    // Duração em minutos
    private int duration;

    // Gênero da mídia (ex: "Ação", "Drama")
    private String genre;

    // Construtor inicializa os campos obrigatórios
    public MediaItem(int id, String title, int duration, String genre) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    // Getters e setters básicos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    // Método abstrato obrigando subclasses a definir a ação de tocar
    public abstract void play();
}
