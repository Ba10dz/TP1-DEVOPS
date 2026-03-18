import java.time.LocalDateTime;
public interface DepotStock {
    int getStock(String referenceArticle);
}

// Classe de commande créée par le service
public record Commande(String identifiantClient, double total, LocalDateTime dateCreation) {}
