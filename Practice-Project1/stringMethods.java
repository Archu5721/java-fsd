package javademo;

public class stringMethods {
	public static void main(String[] args) {
		String name = "Vecna";
		String s1 = new String("Maxine Lucas");
		System.out.println(name);
		System.out.println(s1);
		char[] greet= {'h','e','l','l','o'};
		String s2 =  new String(greet);
		System.out.println(s2.length());
		
		System.out.println(name.indexOf('c'));
		System.out.println(s1.charAt(3));
		
		System.out.println(name.substring(2,3));
		String[] st=s1.split("x");
		System.out.println(st[0]);
		System.out.println(name.replace('c', 'i'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		//StringEqual
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
		//Buffer
		System.out.println("");
		System.out.println("StringBuffer");
		StringBuffer sb =  new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" Maria");
		System.out.println(sb);
		sb.replace(0,5,"Good Morning");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		
		//StringBuilder
		StringBuilder sb1 = new StringBuilder("Welcome");
		System.out.println(sb1);
		sb1.append("John");
		System.out.println(sb1);
		sb1.delete(0, 2);
		sb1.reverse();
		System.out.println(sb1);
		
		
		 //Conversion
		String greeting ="Welcome";
		StringBuffer sb11 = new StringBuffer(greeting);
		sb11.append(" Home");
		System.out.println("String to Buffer");
		System.out.println(sb11);
		
		
		StringBuilder sb21 = new StringBuilder(greeting);
		sb21.reverse();
		System.out.println("string to Builder");
		System.out.println(sb21);
		
	}

}
