package models;

import javax.persistence.Entity;

import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Adherent extends Model {
	
	@Required
	public int idAdherent;
	
	@Required
	public String nomAdherent;

	@Required
	public String prenomAdherent;
	
	@Required
	public String telephoneAdherent;
	
	@Required
	public String numPermisAdherent;

	@Required
	public String loginAdherent;

	@Password
	@Required
	public String passwordAdherent;

	public Adherent(int idAdherent, String nomAdherent, String prenomAdherent,
			String telephoneAdherent, String numPermisAdherent,
			String loginAdherent, String passwordAdherent) {
		super();
		this.idAdherent = idAdherent;
		this.nomAdherent = nomAdherent;
		this.prenomAdherent = prenomAdherent;
		this.telephoneAdherent = telephoneAdherent;
		this.numPermisAdherent = numPermisAdherent;
		this.loginAdherent = loginAdherent;
		this.passwordAdherent = passwordAdherent;
	}

	

}
