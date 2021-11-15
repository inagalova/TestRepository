package npmg.edu.library;

public class ReaderProfile {
	private String firstName;
	private String lastName;
	private int class_;
	private int phoneNumber;
	private Sections section;
	private BookEvent bookEvent;

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getClass_() {
		return class_;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public Sections getSection() {
		return section;
	}
	public void setFirstName(String firstName) {
		if (firstName != null && !firstName.isEmpty())
			this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (lastName != null && !lastName.isEmpty())
			this.lastName = lastName;
	}
	
	public ReaderProfile(String firstName, String lastName, int class_, int phoneNumber, Sections section) {
		setFirstName(firstName);
		setLastName(lastName);
		this.class_ = class_;
		this.phoneNumber = phoneNumber;
		this.section = section;
	}
	public ReaderProfile(String firstName, String lastName, int class_, int phoneNumber, 
			Sections section, BookEvent bookEvent) {
		setFirstName(firstName);
		setLastName(lastName);
		this.class_ = class_;
		this.phoneNumber = phoneNumber;
		this.section = section;
		this.bookEvent = bookEvent;
	}
	
	
	public void takeABook(Book currentBook) {
		
	}
}
