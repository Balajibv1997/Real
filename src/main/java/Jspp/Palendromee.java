package Jspp;

public class Palendromee {
	public static void main(String[] args) {

		String s="soas";
		String bala="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			
		String	revname=ch+bala;
		
		//System.out.print(revname);
		
		if(revname.equals(revname))
			System.out.println("String is palendrome");
		
			else
				System.out.println("String is not palendrome");
		
		
		
		
		}
	}
}
		
	


