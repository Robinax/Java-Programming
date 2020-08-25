import java.util.Scanner;
public class Passwordlogin {
public static void main(String[] args) {
			String Pw = "Admin";
			System.out.println("What is the Password?");
			Scanner reader = new Scanner(System.in);
			String Password = reader.nextLine();
			
			if (Password.equals(Pw)){
				System.out.println("The password is right!");	
			}
			
			else {
				System.out.println("You got the wrong password, you have 2 attempts left");	
				reader = new Scanner(System.in);
				Password = reader.nextLine();
				
				if (Password.equals(Pw)){
					System.out.println("The password is right!");		
				}
				
				else {
					System.out.println("You got the wrong password, you have 1 attempts left");
					reader = new Scanner(System.in);
					Password = reader.nextLine();
					
					if (Password.equals(Pw)){
					System.out.println("The password is right!");		
				}
					
				else {
					System.out.println("You got the wrong password to many times, Good bye");
				}
				}
			}				
		}
}