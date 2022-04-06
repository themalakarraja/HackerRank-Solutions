

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        age=initialAge;
        if(age<0) {
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String status;
        if(age<13)
            status="You are young.";
        else if(age>=13 && age<18)
            status="You are a teenager.";
        else
            status="You are old.";
        System.out.println(status);
	}

	public void yearPasses() {
  		// Increment this person's age.
          age++;
	}

