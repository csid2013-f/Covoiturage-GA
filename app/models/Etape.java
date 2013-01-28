package models;

import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Etape extends Model {
	
	@Required
	public int idEtape;
	
	@Required
	public String horaireDebut;
	
	@Required
	public String pointDepart;
	
	@Required
	public String pointArrivee;

	public Etape(int idEtape, String horaireDebut, String pointDepart,
			String pointArrivee) {
		super();
		this.idEtape = idEtape;
		this.horaireDebut = horaireDebut;
		this.pointDepart = pointDepart;
		this.pointArrivee = pointArrivee;
	}
	
	
}
