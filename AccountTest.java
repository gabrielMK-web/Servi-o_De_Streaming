// Testa a classe Account de forma simples.
public class AccountTest {

    // Testa se a playlist é adicionada corretamente.
    public static void testAddPlaylist() {
        User u = new User("gabriel", "g@email");
        Account a = new Account("01", u);
        Playlist p = new Playlist("Favoritos");

        a.addPlaylist(p);

        assert a.getPlaylists().size() == 1 : "Playlist não adicionada";
    }

    // Testa se o owner (dono da conta) é retornado corretamente.
    public static void testGetOwner() {
        User u = new User("ana", "a@email");
        Account a = new Account("02", u);

        assert a.getOwner() == u : "Owner incorreto";
    }

    public static void main(String[] args) {
        testAddPlaylist();
        testGetOwner();
        System.out.println("AccountTest OK");
    }
}
