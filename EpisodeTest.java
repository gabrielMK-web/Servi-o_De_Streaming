// Testa a classe Episode.
public class EpisodeTest {

    // Testa se o play executa sem erro.
    public static void testPlay() {
        Series s = new Series(1, "Serie", 40, "Ação", 1);
        Episode e = new Episode(101, "Serie", 40, "Ação", 1, "Piloto", s);

        e.play(); // Não pode travar
    }

    // Testa se o stream executa sem erro.
    public static void testStream() {
        Series s = new Series(2, "Serie2", 40, "Drama", 1);
        Episode e = new Episode(201, "Serie2", 40, "Drama", 1, "Intro", s);

        e.stream(); // Não pode travar
    }

    public static void main(String[] args) {
        testPlay();
        testStream();
        System.out.println("EpisodeTest OK");
    }
}
