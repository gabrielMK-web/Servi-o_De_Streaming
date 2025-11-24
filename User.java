import java.util.ArrayList;
import java.util.List;

// Representa um usuário do sistema, contendo nome, email e suas avaliações.
public class User {

    // Nome de usuário exibido no sistema
    private String username;

    // Email do usuário
    private String email;

    // Lista de reviews feitas por este usuário
    private List<Review> reviews = new ArrayList<>();

    // Construtor inicializa nome e email
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Retorna o nome de usuário
    public String getUsername() { return username; }

    // Altera o nome de usuário
    public void setUsername(String username) { this.username = username; }

    // Retorna o email
    public String getEmail() { return email; }

    // Altera o email
    public void setEmail(String email) { this.email = email; }

    // Adiciona uma review à lista de avaliações do usuário
    public void addReview(Review r) {
        reviews.add(r);
    }

    // Retorna todas as reviews feitas por esse usuário
    public List<Review> getReviews() { return reviews; }

    // Retorna uma representação textual do usuário (útil em prints)
    @Override
    public String toString() {
        return "User{" + username + "}";
    }
}
