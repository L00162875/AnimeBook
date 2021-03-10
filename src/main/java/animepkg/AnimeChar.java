/**
 * 
 */
package animepkg;

/**
 * @author Ruth Lennon
 *
 */
public class AnimeChar {
	
	private String charName;
	private int age;
	private String specialAbility;
	private String book;
	
	
	/**
	 * Empty constructor
	 */
	public AnimeChar() {
		super();
	}

	/**
	 * @param charName
	 * @param age
	 * @param specialAbility
	 * @param book
	 */
	public AnimeChar(String charName, int age, String specialAbility, String book) {
		super();
		this.charName = charName;
		this.age = age;
		this.specialAbility = specialAbility;
		this.book = book;
	}
	
	/**
	 * @return the charName
	 */
	public String getCharName() {
		return charName;
	}
	/**
	 * @param charName the charName to set
	 */
	public void setCharName(String charName) {
		this.charName = charName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the specialAbility
	 */
	public String getSpecialAbility() {
		return specialAbility;
	}
	/**
	 * @param specialAbility the specialAbility to set
	 */
	public void setSpecialAbility(String specialAbility) {
		this.specialAbility = specialAbility;
	}
	/**
	 * @return the book
	 */
	public String getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(String book) {
		this.book = book;
	}
	

}
