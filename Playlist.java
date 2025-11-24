import java.util.ArrayList;
import java.util.List;

// Playlist armazena itens de mídia e permite reproduzir tudo.
public class Playlist {

    // Nome da playlist
    private String name;

    // Lista de itens (filmes, séries, episódios)
    private List<MediaItem> items = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Adiciona item no final da playlist
    public void add(MediaItem item) {
        items.add(item);
    }

    // Sobrecarga: adiciona item em posição específica
    public void add(MediaItem item, int position) {

        // Se a posição for inválida, adiciona no fim
        if (position < 0 || position > items.size()) {
            items.add(item);
        } else {
            items.add(position, item);
        }
    }

    public List<MediaItem> getItems() { return items; }

    // Reproduz todos os itens sequencialmente
    public void playAll() {
        for (MediaItem m : items) {
            m.play();
        }
    }

    @Override
    public String toString() {
        return "Playlist{" + name + ", size=" + items.size() + "}";
    }
}
