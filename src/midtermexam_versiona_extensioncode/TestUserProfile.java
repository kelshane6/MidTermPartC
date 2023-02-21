package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Shane Kelly
 */
public class TestUserProfile {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String givenID = input.nextLine();

        System.out.println("List of genres: Comedy, Drama, Action, Mystery ");

        System.out.print("Please enter your favourite genre: ");
        String givenGenre = input.nextLine();
        
        UserProfile userProfile = new UserProfile(givenID, givenGenre);
        
        System.out.println("Your profile has been created!");
     
    }
    
}
