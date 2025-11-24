// Um episódio é tratado como um "MediaItem" especial, mas tecnicamente está extendendo Series
// apenas por simplicidade do projeto. Também implementa Streamable porque pode ser transmitido.
public class Episode extends Series implements Streamable {

    // Número do episódio (ex: Episódio 1)
    private int episodeNumber;

    // Título do episódio (ex: "O Começo")
    private String episodeTitle;

    // Série a qual o episódio pertence
    private Series parentSeries;

    // Construtor cria o episódio usando informações básicas + vínculo à série
    public Episode(int id, String seriesTitle, int duration, String genre,
                   int episodeNumber, String episodeTitle, Series parent) {

        // Chama o construtor da classe Series (pai)
        super(id, seriesTitle, duration, genre, 1);

        this.episodeNumber = episodeNumber;
        this.episodeTitle = episodeTitle;
        this.parentSeries = parent;
    }

    public int getEpisodeNumber() { return episodeNumber; }
    public void setEpisodeNumber(int episodeNumber) { this.episodeNumber = episodeNumber; }

    public String getEpisodeTitle() { return episodeTitle; }
    public void setEpisodeTitle(String episodeTitle) { this.episodeTitle = episodeTitle; }

    // Retorna a série dona do episódio
    public Series getParentSeries() { return parentSeries; }

    // Ação de tocar o episódio
    @Override
    public void play() {
        System.out.println("Reproduzindo episódio: " +
            parentSeries.getTitle() + " - Ep" + episodeNumber + ": " + episodeTitle);
    }

    // Stream chama uma mensagem e depois o play()
    @Override
    public void stream() {
        System.out.println("Stream do episódio: " + episodeTitle);
        play();
    }

    @Override
    public String toString() {
        return "Episode{" + getId() + ", '" + episodeTitle + "'}";
    }
}
