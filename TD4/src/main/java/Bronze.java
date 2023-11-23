
public class Bronze extends Metal{

    public Bronze(String type){
        super(type,200);
        
}
    public void présente() {
        // appel de la méthode de la sur-classe
        super.présente();
        String etat = "conducteur";
        System.out.println("je suis " + etat);
    }
}

