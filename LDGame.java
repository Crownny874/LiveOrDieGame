import java.util.*;
public class LDGame {
	
	public static void main(String[] args) throws Exception  {
		
		String[] correctdoor = new String[]{
		"live","die"
		};
			
		 Random r = new Random();
	   int random = r.nextInt(2);
	 	System.out.println(random);
		
		 String door = correctdoor[random];
		 System.out.println(door);
		 System.out.println("This is a live & die game \n  (you have 3 levels to pass the game)");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter playerName To Play game:");
		 String name = sc.next();
		 System.out.println("enter door:");
		 String doors = sc.next();
		 
		 if(door.equalsIgnoreCase(doors)) {
		 System.out.println("Player "+name+" wins!,you chose the correct door,you live!");
			  }
	 else {
		 	 System.out.println("Player "+name+" lose!,you chose the correct door,you die!");
				  }
			}		  
   }
  