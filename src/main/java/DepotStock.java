// Interface du dépôt de stock (à implémenter en test)
public interface DepotStock {
    int getStock(String referenceArticle);
}

// Classe de commande créée par le service
public record Commande(String identifiantClient, double total, LocalDateTime dateCreation) {}