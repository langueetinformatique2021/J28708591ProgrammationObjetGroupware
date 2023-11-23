
public abstract class Metal {
    private String type_metal;
    private int prix = 200;

    public Metal(String type, int cout) {
		type_metal= type;
		prix = cout;
	}

	/** présentation des caractéristiques de l'animal */
	public void présente() {
		System.out.println("je suis composé de " + type_metal + " et je coute " + prix + " euros");
	}

	/** cri de l'animal */
}
