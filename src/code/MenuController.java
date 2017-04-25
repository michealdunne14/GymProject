package code;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController
{
    private Scanner sc = new Scanner(System.in);
    private Scanner input = new Scanner(System.in);
    private GymApi Gym = new GymApi();
    private Person person;
	private String packchoice;
    
    public static void main(String[] args) 
    {
        MenuController app = new MenuController();
        app.run();
    }
    
    private int mainMenu()
    {
      System.out.println("1) login");      
      System.out.println("2) register");
      System.out.println("0) Exit");
      System.out.print("==>>");
      int option = sc.nextInt();
      return option;
    }
     
    public void run() {
        {
           System.out.println("Posts");
           int option = mainMenu();
           while (option != 0)
           {
            
             switch (option)
             {
               case 1:               
                 login();
                 break;
               case 2:
                 register();
                 break;
                }
            
             option = mainMenu();
           }
           System.out.println("Exiting... bye");
        }
    }
   public String login() {
	   System.out.println("Please enter your email");
	   if (System.in = person.internet){
		   System.out.println("Valid email");
	   }
	   else {
		   System.out.println("InValid email");
		   login();
	   }	   
}
   public void register() {
	   System.out.println("Please enter if you are trainer/member");
	   String pass = input.next();
	   System.out.println("Please enter your email");
	   String mail = input.next();
	   if (mail = person.internet)
   }
    public void member()
    {

        System.out.println("Please enter the author's name: ");
        sc.nextLine();
        String author = sc.nextLine();
        System.out.println("Please enter the author's email: ");
        String email = sc.nextLine();
        System.out.println("Please enter your address: ");
        String address = sc.nextLine();
        System.out.println("Please enter your gender m/f");
        String gender = sc.nextLine();
      
        
    }
    public void trainer(){
    	System.out.println("Please enter your name");
    	String trainername = input.next();
    	String listmembers;
    	System.out.print(feed.addPost(person));
    }

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void showPosts()
    {
        System.out.println(feed.show());
    }
}






private void weight() {
	Scanner input = new Scanner(System.in);
	System.out.println("Your total Weight is " + we);
	System.out.println("Please enter chest measurement");
	int chest = input.nextInt();
	System.out.println("Please enter upperArm measurement");
	int upperArm = input.nextInt();
	System.out.println("Please enter thigh measurement");
	int thigh = input.nextInt();
	System.out.println("Please enter hip measurement");
	int hip = input.nextInt();
	System.out.println("Please enter waste measurement");
	int waste = input.nextInt();
Weight object = new Weight(chest,upperArm,thigh,hip,waste);
	weight.add(object);

}

public void StudentID(){
	System.out.println("Please Type your Student ID");
	ArrayList<String> list=new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	String input = "";
    while (input.length() != 8){
    	input = sc.next();
    	list.add(input);
    	String ID = input ;
    }
}
public void packchoice(String packageChoice) {
	System.out.println("Please chose your package");
	System.out.println("Package 1: Costs 5: Daily");
	System.out.println("Package 2: Costs 150: Year");
	System.out.println("Package 3: Costs : default ");
	Scanner scanchoice = new Scanner(System.in);
	System.out.println("Enter your package");
	int choice = scanchoice.nextInt();
	
	while (choice !=3){
		if (choice < 1||choice >3){
			System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
	        choice = scanchoice.nextInt();
		}
		else if (choice == 1){
		System.out.println("You chose Package 1");
		}
		else if (choice == 2){
			System.out.println("You chose Package 2");
			}
		else if (choice == 3){
			System.out.println("default");
			}
		int ch = choice;
	}
}


public void packagechoice(String packageChoice) {
	System.out.println("Please chose your package");
	System.out.println("Package 1: Costs 8: Daily");
	System.out.println("Package 2: Costs 29: Montly");
	System.out.println("Package 3: Costs 250: Year");
	Scanner scanchoice = new Scanner(System.in);
	System.out.println("Enter your package");
	int choice = scanchoice.nextInt();
	
	while (choice !=3){
		if (choice < 1||choice >3){
			System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
	        choice = scanchoice.nextInt();
		}
		else if (choice == 1){
		System.out.println("You chose Package 1");
		}
		else if (choice == 2){
			System.out.println("You chose Package 2");
			}
		else if (choice == 3){
			System.out.println("You chose Package 3");
			}
	}
}
}