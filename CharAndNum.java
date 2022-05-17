package GroupPractice16;

public class CharAndNum {

	public static void main(String[] args) {
		
		String str="automation1130918test95931";
		String st="";
		int ct=0;
		String digit="";
		int dc=0;
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='a' && ch[i]<='z')
			{
				st= st+ch[i];
				ct++;
			}
			if(ch[i]>='0' && ch[i]<='9')
			{
				digit=digit+ch[i];
				dc++;
			}
				
		}
		System.out.println(st);
		System.out.println(ct);
		System.out.println(digit);
		System.out.println(dc);

	}

}
