package Type_Casting;

public class typeCast {

		public static void main(String[] args) {
			//implicit type cast
			char a = 'A';
			System.out.println("Character value: "+a);
			int b = a;
			System.out.println("implicit: char to int, value = "+b);
			float c = a;
			System.out.println("implicit: char to float, value = "+c);
			long d = a;
			System.out.println("implicit: char to long, value = "+d);
			
//			explicit type casting
			double e = 334.212;
			System.out.println("Double value: "+e);
			int f = (int) e;
			System.out.println("explicit: double to int, value = "+f);

		}

	}

