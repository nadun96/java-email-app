package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Nadun", "Udaraka");
		em1.setAlternateEmail("nadunudaraka@gmail.com");
		em1.setMailboxCapacity(50);
		System.out.println(em1.getMailboxCapacity());	
		
	}

}
