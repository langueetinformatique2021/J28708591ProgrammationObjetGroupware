public class Felin extends Animal{
    // ajout d'attributs propres à la sous-classe
    protected boolean domestique = false;

    /** le constructeur de Félins fait appel au constructeur de la sur-classe Animal
     * @param type */
    public Felin(String type) { // les félins ont 4 pattes
        super(type, 4);
    }

    /** présentation des caractéristiques du félin */

    @Override
    public void présente() {
        // appel de la méthode de la sur-classe
        super.présente();
        String etat = (domestique) ? "domestique" : "sauvage";
        System.out.println("je suis vraiment un animal " + etat);
    }

    @Override
    public void crie() {
        // Implémentez le cri du félin ici
    }
}
