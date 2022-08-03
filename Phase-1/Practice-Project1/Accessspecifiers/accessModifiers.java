package Accessspecifiers;

class accessModifiers {
	
	public static void main(String[] args) {
		defaccessCheck ac = new defaccessCheck(); //default
		ac.name();
		pubaccess pu = new pubaccess();//public
		pu.f1();
	//	priaccess p1 = new priaccess();-------constructor is private so can't create object
		proaccess pro = new  proaccess();
		pro.method1();
	}
	
}
