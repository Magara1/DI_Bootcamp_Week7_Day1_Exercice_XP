package Person;

public class Person {
	
	//les attributs de la classe
	
	private String name;
	
	private String Lastname;
	
	private String email;
	
	private int age;
	
	//constructeur avec parametres

	public Person(String name, String lastname, String email, int age) {
		super();
		this.name = name;
		Lastname = lastname;
		this.email = email;
		this.age = age;
	}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//la methode toString
	
	public String toString(){
	return	" name: " + name + " Lastname: " + Lastname + " email: " + email + " age: " + age ;
	}
	
	
//	Proposition d'Emmanuel
	
//    public String toString() {
//        return "Person{" + "\n" + "\t" +
//                "name='" + name + '\'' +
//                "," + "\n" + "\t" + "lastName='" + lastName + '\'' +
//                "," + "\n" + "\t" + "email='" + email + '\'' +
//                ", age=" + age + "\n" +
//                '}';
//    }
	
	
	

	
	

}
