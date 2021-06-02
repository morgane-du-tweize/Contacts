package regex;

public class MainContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Contact contact1 = new Contact ("Guy", "LEclair", "+330700000000", "guyLeBosssTreize@gmail.com");
			System.out.println(contact1.getElectronicMail());			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Paramètre invalide");
		}

	}

}
