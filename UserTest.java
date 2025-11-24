// Testa a classe User.
public class UserTest {

    // Testa se uma review é adicionada corretamente.
    public static void testAddReview() {
        User u = new User("luiz", "l@email");
        Movie m = new Movie(1, "Teste", 100, "Drama", "Dir");
        Review r = new Review(u, m, 5, "bom");

        u.addReview(r);

        assert u.getReviews().size() == 1 : "Review não adicionada";
    }

    // Testa se o username é retornado corretamente.
    public static void testGetUsername() {
        User u = new User("joao", "j@email");

        assert u.getUsername().equals("joao") : "Username incorreto";
    }

    public static void main(String[] args) {
        testAddReview();
        testGetUsername();
        System.out.println("UserTest OK");
    }
}
