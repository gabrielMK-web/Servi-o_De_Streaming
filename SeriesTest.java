// Testa a classe Series.
public class SeriesTest {

    // Testa se um episódio é criado e adicionado corretamente.
    public static void testAddEpisode() {
        Series s = new Series(10, "Série", 40, "Suspense", 2);

        Episode e = s.addEpisode(1, "Piloto");

        assert s.getEpisodes().size() == 1 : "Episódio não adicionado";
        assert e.getEpisodeNumber() == 1 : "Número incorreto";
    }

    // Testa se a lista de episódios é retornada corretamente.
    public static void testGetEpisodes() {
        Series s = new Series(11, "Outra", 45, "Drama", 1);

        s.addEpisode(1, "Um");
        s.addEpisode(2, "Dois");

        assert s.getEpisodes().size() == 2 : "Lista incorreta";
    }

    public static void main(String[] args) {
        testAddEpisode();
        testGetEpisodes();
        System.out.println("SeriesTest OK");
    }
}
