public class LigneCommande {
    private Article article;
    private int quantite;

    public LigneCommande(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public double sousTotal() {
        return article.getPrix() * quantite;
    }
}