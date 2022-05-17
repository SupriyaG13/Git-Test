package GroupPractice16;

public class Area {

   public float circle(float r)                      // non static method with return type
	{
	   float pi=3.14f;
		float areacircle=pi*r*r;
		return areacircle;
		
	}
	public double triangle(double b,double h)       // non static method with return type
	{
		double areatriangle=(b*h)/2;
		return areatriangle;
	}
	public int square(int s)                         // non static method with return type
	{
		int areasquare=s*s;
		return areasquare;
	}
	public int rectangle(int l,int w)                // non static method with return type
	{
		int arearectangle=l*w;
		return arearectangle;
	}

public static void main(String[] args)
{
	Area x=new Area();
	 int ch;
	 ch=1;
	 if(ch==1)
	 {
		 System.out.println("area of circle="+x.circle(12.5f));
	 }
	 else if(ch==2)
	 {
		 System.out.println("area of triangle="+x.triangle(23,40));
	 }
	 else if(ch==3)
	 {
		 System.out.println("area of square="+x.square(25));
	 }
	 else if(ch==4)
	 {
		 System.out.println("area of rectangle="+x.rectangle(12,14));
	 }
	 else
	 {
		 System.out.println("invalid input");
	 }
}

}

	





	

