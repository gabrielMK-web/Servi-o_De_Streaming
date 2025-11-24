// Testa a classe Review.
public class ReviewTest {

    // Testa se o toString retorna algo coerente.
    public static void testToString() {
        User u = new User("gabriel", "g@email");
        Movie m = new Movie(1, "T", 100, "Drama", "Ana");
        Review r = new Review(u, m, 5, "bom");

        String out = r.toString();

        assert out.contains("gabriel") : "toString sem autor";
        assert out.contains("5") : "toString sem nota";
    }

    public static void main(String[] args) {
        testToString();
        System.out.println("ReviewTest OK");
    }
}
