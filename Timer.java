
public class Timer {
	
	   Timer(int a) {
	  for(int i = 0; i < 60; i++) {
		  if(a == 0 && i == 60) {
			 System.out.println("time limit reached,you lose,you die!");
				break;
			}	
		 }
		for(int j = 0; j < 30; j++) {
	  if(a == 1 && j == 30) {
 	System.out.println("time limit reached,you lose,you die!");
				break;
		}
	 }
 	for(int k = 0; k < 10; k++) {
	  if(a == 2 && k == 10) {
 	System.out.println("time limit reached,you lose,you die!");
				break;
		}
	 }
	}
}