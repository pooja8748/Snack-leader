import player.Player;
import java.util.*;
import dice.Dice;
import coordinates.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Player p1 = new Player();
        // p1.setPlayerDetailsfromuserinput();
        // Player p2= new Player();
        // p2.setPlayerDetailsfromuserinput();
        // Dice dice = new Dice();
        // System.out.println(dice.diceRoll());
        Coordinates c = new Coordinates(9, 4);
        System.out.println(c.printCoordinates());
    }

    public static Player setPlayerDetailsfromuserinput()
    {
        System.out.println("Hello, World!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the playuer detail:");
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the contatctno:");
        String contactno=sc.nextLine();
        System.out.println("Enter the adress:");
        String address=sc.nextLine();
        System.out.println("Enter the emailId:");
        String emailid=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        return null;
    }
}
