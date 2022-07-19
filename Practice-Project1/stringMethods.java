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

	}

}
