// Representa a avaliação de um usuário sobre um item de mídia.
public class Review {

    // Usuário que fez a review
    private User author;

    // Item avaliado
    private MediaItem item;

    // Nota dada pelo usuário
    private int rating;

    // Comentário escrito
    private String comment;

    public Review(User author, MediaItem item, int rating, String comment) {
        this.author = author;
        this.item = item;
        this.rating = rating;
        this.comment = comment;
    }

    public User getAuthor() { return author; }
    public MediaItem getItem() { return item; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }

    @Override
    public String toString() {
        return "Review{" + author.getUsername() + ": " + rating + " - " + comment + "}";
    }
}
