// Classe principal usada só para demonstração do funcionamento do sistema.
public class Main {
    public static void main(String[] args) {

        // Cria um usuário
        User gabriel = new User("gabriel", "gabriel@email.com");

        // Cria conta associada
        Account acc = new Account("acc001", gabriel);

        // Cria filme
        Movie movie1 = new Movie(1, "A Viagem", 120, "Drama", "Ana Direto");

        // Cria série
        Series series1 = new Series(2, "Mistérios da Sala", 45, "Suspense", 2);

        // Cria episódios da série
        Episode ep1 = series1.addEpisode(1, "O Começo");
        Episode ep2 = series1.addEpisode(2, "A Reviravolta");

        // Cria playlist e adiciona itens
        Playlist p1 = new Playlist("Favoritos");
        p1.add(movie1);
        p1.add(ep1);
        p1.add(ep2, 1); // Adiciona em posição específica

        // Adiciona playlist na conta
        acc.addPlaylist(p1);

        // Cria uma review e registra no usuário
        Review r = new Review(gabriel, movie1, 5, "Ótimo filme!");
        gabriel.addReview(r);

        // Testa interface Streamable
        Streamable s1 = movie1;
        Streamable s2 = ep1;

        // Impressão de demonstração
        System.out.println("--- Execução de demonstração ---");
        System.out.println(acc);
        System.out.println(p1);

        s1.stream();
        s2.stream();

        // Reproduz playlist inteira
        System.out.println("\nTocando playlist:");
        p1.playAll();

        // Lista episódios
        System.out.println("\nEpisódios da série: " + series1.getTitle());
        for (Episode e : series1.getEpisodes())
            System.out.println(e);

        // Mostra reviews
        System.out.println("\nReviews do usuário:");
        for (Review rev : gabriel.getReviews())
            System.out.println(rev);
    }
}
