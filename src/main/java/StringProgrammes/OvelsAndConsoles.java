package StringProgrammes;

public class OvelsAndConsoles {

	public static void main(String[] args) {

		int Ove=0,Cos=0;

		String st="Balaji";

		for(int i=0;i<st.length()-1;i++) {
			char ch=st.charAt(i);

			if (ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')
			{
				if(ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U'||  ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u')
					Ove++;
				else
					Cos++;
			}
		}
System.out.println(Ove);
System.out.println(Cos);

		}
	}




