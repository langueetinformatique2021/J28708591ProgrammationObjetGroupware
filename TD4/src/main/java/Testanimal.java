public class Testanimal {
    public static void main(String[] args) {
        // Créer une instance de Félin (au lieu d'Animal)
        Felin felin = new Felin("Chat");

        // Appeler la méthode présente de la classe Félin
        felin.présente();

        // Appeler la méthode crie de la classe Félin (qui devrait avoir une implémentation spécifique)
        felin.crie();
    }
}
