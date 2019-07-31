import java.util.Scanner;
public class stars {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Please choose one of these four options by typing thier correspoding digit."
				+ "\n 1.Right angled decending stars || 2.Right angled ascending starts \n 3.Decending Equalatierall stars || 4.Acending Equalteral Stars");
		
		int selection = in.nextInt();
		
		switch(selection) {
		case 1:
			stars1 st1 = new stars1();
			System.out.println("Please enter a positive integer greater than 1");
			int val = in.nextInt();
			if(val <= 0) {
				System.out.println("Error please try again");
			}
			st1.tree(val);
			break;
		case 2:
			stars2 st2 = new stars2();
			System.out.println("Please enter a positive integer greater than 1");
			val = in.nextInt();
			if(val <= 0) {
				System.out.println("Error please try again");
			}
			st2.tree(val);
			break;
		case 3:
			stars3 st3 = new stars3();
			System.out.println("Please enter a positive integer greater than 1");
			val = in.nextInt();
			if(val <= 0) {
				System.out.println("Error please try again");
			}
			st3.tree(val);
			break;
		case 4:
			stars4 st4 = new stars4();
			System.out.println("Please enter a positive integer greater than 1");
			val = in.nextInt();
			if(val <= 0) {
				System.out.println("Error please try again");
			}
			st4.tree(val);
			break;
			
		default:
			System.out.println("Error: Please Choose a number between 1 and 4");
		}
		
		
		
		}		

}
class stars1{
	public void tree(int n) {
	for(int i=0;i<n;i++) {
		for(int j=-1;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}

class stars2{
	public void tree(int n) {
	for(int i=0;i<n;i++) {
		for(int j=n;j>i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}

class stars3{
	public void tree(int n) {
	for(int i=0;i<n;i++) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<((i*2)+1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}

class stars4{
	public void tree(int n) {
	for(int i=n;i>0;i--) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<((i*2)-1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}