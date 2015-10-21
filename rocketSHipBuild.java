
package rocketShip;
import java.util.Scanner;
public class rocketSHipBuild {

	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("What Size RocketShip?");
		int line = 0;
		int size = input.nextInt() ;
		int space = 0;
		int slashes = 0;
		int equalStar = 0;
		int dot = 0;
		int slashCombo = 0;
		int half = 0;
		//Cone Algorithm 
		for(line = 1 ; line <= (size * 2 - 1) ; line++){
			
			for(space = size * 2 -1 ; space >= line; space--){
				System.out.print(" ");	
			}
			for(slashes = line ; slashes >= 1; slashes--){
				System.out.print("/");
			}
			System.out.print("**");
			for(slashes = line ; slashes >= 1; slashes--){
				System.out.print("\\");
				}
			System.out.println();
			}
		//Section Seperator
		System.out.print("+");
		    for (equalStar = 1; equalStar <= size * 2; equalStar++){
		    	System.out.print("=*");
		    }
		System.out.println("+"); 
		//First Box part 1
		for(line = 1 ; line <= size ; line++){
			System.out.print("|");
			
			for (half = 1;half <= 2; half++){
				for(dot = size - 1;dot >= line; --dot){
					System.out.print(".");
					}
				for(slashCombo = 1; slashCombo <= line; slashCombo++){
					System.out.print("/\\");
				}
				for(dot = size - 1 ;dot >= line; --dot){
				System.out.print(".");
				}
			}
			System.out.println("|");	
				}
		// First Box part two
		for(line = 1 ; line <= size ; line++){
			System.out.print("|");
			for (half = 1;half <= 2; half++){
				for(dot = 2; dot <= line;++dot){
					System.out.print(".");
					}
				for(slashCombo = size; slashCombo >= line ;slashCombo--){
					System.out.print("\\/");
				}
				for(dot = 2; dot <= line;++dot){
					System.out.print(".");
				}
			}
			System.out.println("|");	
				}
		//Section Seperator
		System.out.print("+");
	    for (equalStar = 1; equalStar <= size * 2; equalStar++){
	    	System.out.print("=*");
	    }
	System.out.println("+");
		//Second box first part
	for(line = 1 ; line <= size ; line++){
		System.out.print("|");
		for (half = 1;half <= 2; half++){
			for(dot = 2; dot <= line;++dot){
				System.out.print(".");
				}
			for(slashCombo = size; slashCombo >= line ;slashCombo--){
				System.out.print("\\/");
			}
			for(dot = 2; dot <= line;++dot){
				System.out.print(".");
			}
		}
		System.out.println("|");	
			}

	    // Second box second part 
	
for(line = 1 ; line <= size ; line++){
	System.out.print("|");
	
	for (half = 1;half <= 2; half++){
		for(dot = size - 1;dot >= line; --dot){
			System.out.print(".");
			}
		for(slashCombo = 1; slashCombo <= line; slashCombo++){
			System.out.print("/\\");
		}
		for(dot = size - 1 ;dot >= line; --dot){
		System.out.print(".");
		}
	}
	System.out.println("|");	
	}
//Section Seperator
		System.out.print("+");
	    for (equalStar = 1; equalStar <= size * 2; equalStar++){
	    	System.out.print("=*");
	    }
	System.out.println("+");
	
	//Cone Algorithm 
			for(line = 1 ; line <= (size * 2 - 1) ; line++){
				
				for(space = size * 2 -1 ; space >= line; space--){
					System.out.print(" ");	
				}
				for(slashes = line ; slashes >= 1; slashes--){
					System.out.print("/");
				}
				System.out.print("**");
				for(slashes = line ; slashes >= 1; slashes--){
					System.out.print("\\");
					}
				System.out.println();
				}
	}
	
}
		
	

