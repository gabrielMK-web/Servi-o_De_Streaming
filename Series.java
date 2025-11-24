import java.util.ArrayList;
import java.util.List;

// Representa uma série, que possui temporadas e vários episódios.
public class Series extends MediaItem {

    // Quantidade de temporadas
    private int seasons;

    // Lista de episódios da série
    private List<Episode> episodes = new ArrayList<>();

    // Construtor cria série com título, duração média, gênero e temporadas
    public Series(int id, String title, int durationPerEpisode, String genre, int seasons) {
        super(id, title, durationPerEpisode, genre);
        this.seasons = seasons;
    }

    public int getSeasons() { return seasons; }
    public void setSeasons(int seasons) { this.seasons = seasons; }

    // Cria novo episódio e adiciona na lista
    public Episode addEpisode(int episodeNumber, String epTitle) {

        // Cria ID exclusivo baseado no ID da série
        Episode ep = new Episode(
            getId() * 100 + episodeNumber,
            getTitle(),
            getDuration(),
            getGenre(),
            episodeNumber,
            epTitle,
            this
        );

        episodes.add(ep);
        return ep;
    }

    public List<Episode> getEpisodes() { return episodes; }

    @Override
    public void play() {
        System.out.println("Série: " + getTitle() + " - escolha um episódio para reproduzir.");
    }

    @Override
    public String toString() {
        return "Series{" + getId() + ", '" + getTitle() + "', eps=" + episodes.size() + "}";
    }
}

