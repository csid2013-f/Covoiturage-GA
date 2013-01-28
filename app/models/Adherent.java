package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Adherent extends Model {

	public int idAdherent;

	public String nomAdherent;

	public String prenomAdherent;

	public String telephoneAdherent;

	public String numPermisAdherent;

	public String loginAdherent;

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
