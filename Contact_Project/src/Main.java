
public class Main {

	public static void main(String[] args) {
		Contact contact = new Contact();
		
		
		System.out.println(contact.toString());
		
		contact.setName("김승민");
		contact.setAddress("안산시");
		contact.setBirthday("3/24");
		contact.setEmail("none");
		contact.setGroup("none");
		contact.setPhoneNum("010-0000-0000");
		
		System.out.println(contact.toString());
	}
	

}
