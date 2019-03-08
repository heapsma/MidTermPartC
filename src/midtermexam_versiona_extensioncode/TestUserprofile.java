package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class TestUserprofile {

    public static void main(String args[]) {
        UserProfile newProfile = new UserProfile();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name:");
        newProfile.setUserID(sc.nextLine());
        System.out.println("choose a genre of movies");
        System.out.println(newProfile.getGenre());
        newProfile.setGenre(sc.nextLine());
        System.out.println("your accuont name is: " +newProfile.getUserID() +
                " and your favourite genre is: " + newProfile.getGenre());
        System.out.println("your account has been set");
    }
}
