package regex;

public class Contact {
	private String nom ;
	private String prenom ;
	private String numTelephone ;
	private String electronicMail ;
	
	public Contact(String nom, String prenom, String numTelephone, String electronicMail) throws Exception {
		setNom(nom);
		setPrenom(prenom);
		setNumTelephone(numTelephone);
		setElectronicMail(electronicMail);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) throws Exception {
		if (nom.matches("^[a-zA-Z' ]+$")) {
			System.out.println("correct");
			this.nom = nom;
		}
		else {
			throw new Exception("Chaîne de caractères invalide");
		}
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) throws Exception {
		if (prenom.matches("^[a-zA-Z ]+$")) {
			System.out.println("correct");
			this.prenom = prenom;
		}
		else {
			throw new Exception("Chaîne de caractères invalide");
		}
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) throws Exception {
		/*
		 * Contraintes sur les numéros de téléphone :
		 * Un numéro de téléphone ne doit contenir que des chiffres, 
		 * avec éventuellement chaque couple de chiffre séparés par des espaces.
		 * Sont autorisés les numéros de téléphone avec indicateurs.
		 */
	
		if (numTelephone.matches("^((\\+|0{2})[0-9][0-9])?[0-9]{2} ?[0-9]{2} ?[0-9]{2} ?[0-9]{2} ?[0-9]{2}$")) {
			System.out.println("correct");
			this.numTelephone = numTelephone;
		}
		else {
			throw new Exception("Chaîne de caractères invalide");
		}
	}

	public String getElectronicMail() {
		return electronicMail;
	}

	public void setElectronicMail(String electronicMail) throws Exception {
		if (electronicMail.matches("^[a-zA-Z'._ ]*@[a-zA-Z'._ ]*$")) {
			System.out.println("correct");
			this.electronicMail = electronicMail;
		}
		else {
			throw new Exception("Chaîne de caractères invalide");
		}
	}
	

}
