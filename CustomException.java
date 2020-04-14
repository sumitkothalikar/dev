
public class CustomException {

	public static void main(String[] args) throws AgeException  {
		Animal cat = null;
		try {
			
			cat= new Animal(1, "Cat ");
			cat =new Animal(-5, "cat1 ");
			cat =new Animal(6, "cat2 ");

            
		}
		catch(AgeException ae) {
			System.out.println(ae.getMessage());
		}

	}
		

}

class Animal{
	int age;
	String name;
		
	public Animal(int age, String name) throws AgeException  {
		if(age<0) {
			throw new AgeException("Invalid age for "+name+" "+ age);
		}else {
			
			this.age = age;
			this.name = name;
			System.out.println("You have created a "+name);
		}
	}
	
	
	}
	


// Custom Exception class
class AgeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1356368036796071296L;

	public AgeException(String message) {
		super(message);
	}
}
