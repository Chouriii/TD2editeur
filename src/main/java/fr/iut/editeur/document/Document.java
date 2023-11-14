package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Description de la méthode
     * @return retourne le texte sous forme de string
     */
    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Description de la méthode
     * @param start debut du texte
     * @param end fin du texte
     * @param remplacement texte de remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start, end, texte.substring(start,end).toUpperCase());
    }

    public void effacer(int start, int end){
        remplacer(start, end, "");
    }

    public void clear() {
        setTexte("");
    }
}
