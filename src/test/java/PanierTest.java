import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PanierTest {
    @Test
    void ajouterArticleDoitAugmenterLeNombreDeArticles() {
        // Arranger
        Panier panier = new Panier();
        Article article = new Article("REF-001", "Stylo bleu", 1.50);
        // Agir
        panier.ajouterArticle(article, 2);
        // Affirmer
        assertEquals(1, panier.nombreArticles());
    }

    @Test
    void calculerTotalDoitRetournerLaSommeDessousTotaux() {
        //Arranger
        Panier panier = new Panier();
        Article article1 = new Article("REF-001", "Stylo bleu", 1.5);
        Article article2 = new Article("REF-002", "Stylo noir", 1.5);
        //Agir
        panier.ajouterArticle(article1, 3);
        panier.ajouterArticle(article2, 3);
        //Affirmer
        assertEquals(9.0, panier.calculerTotal());
    }

    @Test
    void panierVideDoitRetournerEstVideEgalTrue() {
        //Arranger
        Panier panier = new Panier();
        //Agir
        //Affirmer
        assertTrue(panier.estVide());
    }

    @Test
    void panierAvecArticlesNeDoitPasEtreVide() {
        //Arranger
        Panier panier = new Panier();
        Article article = new Article("REF-001", "Stylo bleu", 1.5);
        //Agir
        panier.ajouterArticle(article, 2);
        //Affirmer
        assertFalse(panier.estVide());
    }
}