/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author incendio
 */
public abstract class Animal {
	private String espèce;
	private int nb_pattes = 0;


	public Animal(String type, int pattes) {
		espèce = type;
		nb_pattes = pattes;
	}

	/** présentation des caractéristiques de l'animal */
	public void présente() {
		System.out.println("je suis un représentant de l'espèce des " + espèce + " et j'ai " + nb_pattes + " pattes");
	}

	/** cri de l'animal */
	public abstract void crie();
}
