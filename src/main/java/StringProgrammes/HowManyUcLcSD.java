package StringProgrammes;

public class HowManyUcLcSD {
	public static void main(String[] arg) {
		
		int Uc=0,Lc=0,Di=0,sp=0;
		String st="Balaji@123";
		
		for(int i=0;i<=st.length()-1;i++) {
			
			char ch=st.charAt(i);
		if(ch>='A'&& ch<='Z') 
			Uc++;
		
		 else if(ch>='a'&& ch<='z') 
			Lc++;
			
		 else if(ch>='0'&& ch<='9') 
			Di++;
		 else sp++;	
	}
System.out.println(Uc);
System.out.println(Lc);
System.out.println(Di);
System.out.println(sp);
}
}