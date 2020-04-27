package project;
import java.util.*;
class Singleton {
	private static Singleton instance = null;
	 HashMap<String,Integer> map;
	
	private Singleton() {
		map = new HashMap<>();
		map.put("s1",4000);
		map.put("s2",4000);
		map.put("s3",4000);
	}
	
	public static Singleton getInstance(){
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void removeShare (String name, double amount) {
		int newShare = (int) (map.get(name) - amount);
		if(newShare<0) {
			System.out.println("You do not have that much share");
			return;
		}
		map.replace(name,newShare);
		System.out.println("Your Share is updated :"+map.get(name));	
	
	}
	
	public void addShare (String name, double amount) {
		int newShare = (int) (map.get(name) + amount);
		map.replace(name,newShare);
		System.out.println("Your Share is updated :"+map.get(name));
	}
	
	public void logTransfer (String fromAccount, String toAccount, double amount) {
		System.out.println("TRANSFER (" + fromAccount + "->" + toAccount + "): " + amount + "$");
	}
	public void display(String name) {
		
		System.out.println("Your share amount: "+map.get(name));
		
	}

}
