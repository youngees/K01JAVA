package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain
{

	public static void main(String[] args)
	{
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		/*
		-동일한 패키지에 선언되었으므로 import없이 객체를 생성할 수 있다.
		-private으로 선언된 멤버는 동일한 패키지라 할지라도 접근할 수 없다.
		*/
		E01AccessModifier1 one = new E01AccessModifier1();
		
		//System.out.println("one.privateVar=" +one.privateVar); //에러발생
		System.out.println("one.dafaultVar=" +one.defaultVar);
		System.out.println("one.publicVar=" +one.publicVar);
		
		//one.privateMethod(); //에러발생
		one.defaultMethod();
		one.publicMethod();
		/*
		private으로 선언된 멤버에 외부클래스에서 접근하려면 public으로
		선언된 멤버메서드를 통해 간접적으로 접근해야한다.
		publicMethod()를 통해 privateMethod()에 접근할 수 있다.
		*/
		
		/*
		동일한 패키지에 선언된 클래스이므로 import없이 객체생성이 가능하다.
		또한 default클래스느 동일한 패키지에서는 접근할 수 있다.
		*/
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		///////////////////////////////////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		/*
		다른 패키지에 선언된 클래스이므로 객체생성을 위해 import선언을
		해야한다. 또한 패키지가 다르면 private, default 멤버에
		접근할 수 없다. 
		 */
		E01AccessModifier2 two = new E01AccessModifier2();
		
		//System.out.println("two.privateVar=" +two.privateVar); //에러발생
		//System.out.println("two.dafaultVar=" +two.defaultVar); //에러발생
		System.out.println("two.publicVar=" +two.publicVar);
		
		//two.privateMethod(); //에러발생
		//two.defaultMethod(); //에러발생
		two.publicMethod();
		
		/*
		다른 패키지에 선언된 디폴트 클래스이므로 객체생성이 불가능하다.
		import도 불가능하므로 아예 사용할 수 없는 클래스가 된다.
		*/
		System.out.println("DefaultClass 객체 생성 및 접근");
		//new DefaultClass2().myFunc(); //에러발생
	}
}
