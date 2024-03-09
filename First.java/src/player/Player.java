package player;

import java.util.Scanner;

public class Player {
    String name;
    String contactno;
    String emailId;
    String address;
    int age;

    public void setPlayerDetails(String name,String address,String contaString,String emaString,int age)
    {
        this.name=name;
        this.address=address;
        this.contactno=contaString;
        this.age=age;
        this.emailId=emailId;
    }
    public void setPlayerName(String name)
    {
        this.name=name;
    }
    public void getPlayerDetails()
    {
        System.out.println("Player name:" + this.name);
        System.out.println("Player age:" + this.age);
        System.out.println("Player contactno:" + this.contactno);
        System.out.println("Player emailid:" + this.emailId);
        System.out.println("Player address:" + this.address);
    }
    public String getPlayerName()
    {
        return this.name;
    }
    public void setPlayerDetailsfromuserinput() {

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
        
    }

    
}
