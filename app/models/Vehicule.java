package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Vehicule extends Model{
	public String num_immatriculation;
	public int nb_place;
	public String marque;
	public String modele;
	public String type_essence;
	
	public Vehicule(String num_immatriculation, int nb_place, String marque,
			String modele, String type_essence) {
		super();
		this.num_immatriculation = num_immatriculation;
		this.nb_place = nb_place;
		this.marque = marque;
		this.modele = modele;
		this.type_essence = type_essence;
	}
	
	

}
