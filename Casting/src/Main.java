
public class Main {

	//upcast=implicito
	//downcast-explicito
	public static void main(String[] args) {
		
		byte b1;
		short s1=1000;
		b1=(byte)s1;
		
		long l1;
		int i1=10;
		l1=i1;
		
		int i2;
		long l2=10000000000L;
		i2=(int) l2;
		
		int i3;
		long l3=10000L;
		i3=(int)l3;
		
		System.out.println("b1:" + b1);
		System.out.println("l1:" +l1);
		System.out.println("s1: "+ s1);
		
	}
}
