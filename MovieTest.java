// Testa a classe Movie.
public class MovieTest {

    // Testa se o diretor é retornado corretamente.
    public static void testDirector() {
        Movie m = new Movie(1, "Filme", 90, "Ação", "Carlos");

        assert m.getDirector().equals("Carlos") : "Diretor errado";
    }

    // Teste simples apenas para garantir que o stream executa sem erro.
    public static void testStreamOutput() {
        Movie m = new Movie(2, "X", 80, "Drama", "Ana");

        m.stream(); // Apenas verifica que não trava nem lança erro
    }

    public static void main(String[] args) {
        testDirector();
        testStreamOutput();
        System.out.println("MovieTest OK");
    }
}
