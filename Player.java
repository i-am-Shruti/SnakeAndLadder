package player;
import java.util.*;

public class Player {
    private String name;
    private int age;
    private String address;
    private String contactNum;
    private String emailId;
    

    public void setPlayersDetails(String name, int age, String address, String contactNum, String emailId){
        this.name= name;
        this.age= age;
        this.address= address;
        this.contactNum= contactNum;
        this.emailId= emailId;
    }


    public String getPlayerName(){
        return this.name;
        }

        public void getPlayersDetails(){
            System.out.println("Player Name:" +this.name);
            System.out.println("Player age:" +this.age);
            System.out.println("Player address:" +this.address);
            System.out.println("Player contactNum:" +this.contactNum);
            System.out.println("Player emailId:" +this.emailId);
            System.out.print("\n");
        }

        public void setPlayerDetailsFromUserInput(Player p){
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the  player details:");
          System.out.println("Enter the  player name:");
          String name= scn.nextLine();
          System.out.println("Enter the  player age:");
          int age = scn.nextInt();
          scn.nextLine();
          System.out.println("Enter the  player address:");
          String address= scn.nextLine();
          System.out.println("Enter the  player contact num:");
          String contactNum= scn.nextLine();
          System.out.println("Enter the  player emailId:");
          String emailId= scn.nextLine();

          System.out.println("\n");
          p.setPlayersDetails(name, age, address, contactNum, emailId);
                }
}
