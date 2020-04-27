package project;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addCheck,removeCheck;
		Scanner sc = new Scanner(System.in);
		while(true) {
		    int count = 0;
			System.out.println("1.Share Holder1\n2.Share Holder2\n3.Share Holder3\n4.Exit\n\n");
			System.out.println("Enter your choice:  ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				Singleton s1 = Singleton.getInstance();
				s1.display("s"+(Integer.toString(ch)));
				System.out.println("Do you want to add Share? (0-No , 1-Yes)");
				addCheck = sc.nextInt();
				if(addCheck==1) {
					System.out.println("Amount of share to add: ");
					int addAmount = sc.nextInt();
					s1.addShare("s"+(Integer.toString(ch)),addAmount);
					break;
				}
				System.out.println("Do you want to remove Share? (0-No , 1-Yes)");
				removeCheck = sc.nextInt();
				if(removeCheck==1) {
					System.out.println("Amount of share to remove: ");
					int removeAmount = sc.nextInt();
					s1.removeShare("s"+(Integer.toString(ch)),removeAmount);
					break;
				}
				break;
			
			case 2:
				Singleton s2 = Singleton.getInstance();
				s2.display("s"+(Integer.toString(ch)));
				System.out.println("Do you want to add Share? (0-No , 1-Yes)");
				addCheck = sc.nextInt();
				if(addCheck==1) {
					System.out.println("Amount of share to add: ");
					int addAmount = sc.nextInt();
					s2.addShare("s"+(Integer.toString(ch)),addAmount);
					break;
				}
				System.out.println("Do you want to remove Share? (0-No , 1-Yes)");
				removeCheck = sc.nextInt();
				if(removeCheck==1) {
					System.out.println("Amount of share to remove: ");
					int removeAmount = sc.nextInt();
					s2.removeShare("s"+(Integer.toString(ch)),removeAmount);
					break;
				}
				break;
				
			case 3:
				Singleton s3 = Singleton.getInstance();
				s3.display("s"+(Integer.toString(ch)));
				System.out.println("Do you want to add Share? (0-No , 1-Yes)");
				addCheck = sc.nextInt();
				if(addCheck==1) {
					System.out.println("Amount of share to add: ");
					int addAmount = sc.nextInt();
					s3.addShare("s"+(Integer.toString(ch)),addAmount);
					break;
				}
				System.out.println("Do you want to remove Share? (0-No , 1-Yes)");
				removeCheck = sc.nextInt();
				if(removeCheck==1) {
					System.out.println("Amount of share to remove: ");
					int removeAmount = sc.nextInt();
					s3.removeShare("s"+(Integer.toString(ch)),removeAmount);
					break;
				}
				break;
				
			}
		}
		
	}

}
