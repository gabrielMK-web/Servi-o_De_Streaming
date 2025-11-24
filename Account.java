import java.util.ArrayList;
import java.util.List;

// Representa uma conta no sistema, ligada a um usuário e suas playlists.
public class Account {

    // ID da conta (ex: "acc001")
    private String accountId;

    // Dono da conta (objeto User)
    private User owner;

    // Lista de playlists cadastradas nessa conta
    private List<Playlist> playlists = new ArrayList<>();

    // Construtor inicializa a conta com ID e dono
    public Account(String accountId, User owner) {
        this.accountId = accountId;
        this.owner = owner;
    }

    // Retorna o ID da conta
    public String getAccountId() { return accountId; }

    // Altera o ID da conta
    public void setAccountId(String accountId) { this.accountId = accountId; }

    // Retorna o dono da conta
    public User getOwner() { return owner; }

    // Altera o dono da conta
    public void setOwner(User owner) { this.owner = owner; }

    // Adiciona uma nova playlist à lista da conta
    public void addPlaylist(Playlist p) {
        playlists.add(p);
    }

    // Retorna todas as playlists
    public List<Playlist> getPlaylists() { return playlists; }

    // Representação textual da conta
    @Override
    public String toString() {
        return "Account{" + accountId + ", owner=" + owner.getUsername() + "}";
    }
}
