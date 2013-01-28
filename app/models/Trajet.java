package models;

import javax.persistence.Entity;

import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Trajet extends Model {
	
	@Required
	public int idTrajet;
	
	@Required
	public float distanceTrajet;

	public Trajet(int idTrajet, float distanceTrajet) {
		super();
		this.idTrajet = idTrajet;
		this.distanceTrajet = distanceTrajet;
	}
	
	

	

}
