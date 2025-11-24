// Testa a classe Playlist.
public class PlaylistTest {

    // Testa se itens são adicionados corretamente.
    public static void testAddItems() {
        Playlist p = new Playlist("P");
        Movie m = new Movie(1, "F", 100, "Ação", "D");

        p.add(m);

        assert p.getItems().size() == 1 : "Item não adicionado";
    }

    // Teste básico: só verifica que playAll() executa sem erro.
    public static void testPlayAll() {
        Playlist p = new Playlist("P");
        p.add(new Movie(2, "G", 80, "Drama", "K"));

        p.playAll(); // Não deve travar
    }

    public static void main(String[] args) {
        testAddItems();
        testPlayAll();
        System.out.println("PlaylistTest OK");
    }
}
