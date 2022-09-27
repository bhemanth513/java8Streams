package Java8Assignment;

/**
 * **
 * @author HEMANTH
 * 
 * Georgia Resort is a pioneer boutique resort and is known for their personalized treatment to the guests. While registering the guest for a particular date of stay, the resort has collected few details like

Name of the guest

Date Of Birth

Country – Assumption: Guests visit only from the following countries

USA, Spain, Germany, France, China

Language – Guests speak only one of the below languages

English, Spanish, French, Chinese, German

Hobby – Need to be from the following

Eat, Drink, Sports, Dance, Travel, Read, Music

The Event Management team of the resort is planning for different events for the guests during their stay and needs the list of guests.

 

Write a Java program using the new features learned in Java SE 8 course by following the steps given below:

Create a Guest class to hold the data for the guest having name, dob, country, language, and hobby as attributes.

Create another main class named EventManager

In the main method of this class invoke the below-mentioned methods in step 2 and step 3

Define a method called populateGuests to populate a List, containing Guest objects having different values

Define another method called filterGuest for filtering the guest

For example, if there is a guest from the USA then the code will be

Predicate<Guest> pAmerican = g -> {
        return Country.USA.equals( g.getCountry() );
    }; // Assuming Country is a enum class
lstGuest.stream().filter(pAmerican).forEach(guest -> System.out.println(guest));

In a similar manner create different filters using lambda and stream, and print the guest list as per the requirement below so that the event management team can use the list for planning different events.

List of guests  from Spain and

Love music and dance

Love to drink and age is above 18

List of guests from France and

Love playing sports

Number of guests of age above 70 years

List of guests who speak Chinese and love to read


 *
 */
public class Guest {
	private String name;
	private String dob;
	private Country country;
	private Language language;
	private Hobby hobby;

	public Guest(String name, String dob, Country country, Language language, Hobby hobby) {
		super();
		this.name = name;
		this.dob = dob;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", dob=" + dob + ", country=" + country + ", language=" + language + ", hobby="
				+ hobby + "]";
	}

}
