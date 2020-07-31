package interfaceExam;

// 다중 상속 예시를 위한 interface 
interface InterfaceA{}
interface InterfaceB{}

// 다중 구현 예시를 위한 interface
interface InterfaceC{}

interface Firstinterface extends InterfaceA, InterfaceB{
	
	// 상수
	public static final String TYPE = "상수";
	
	// 추상 메서드
	public abstract void abstractMethod();
	
	// abstract 키워드 생략 추상 메서드 
	public void abstractSecondMethod();
	
	// default 메서드
	public default void defaultMethod() {
		System.out.println("default 메서드 호출");
	}
	// static 메서드
	public static void staticMethod() {
		System.out.println("static 메서드 호출");
	}
}

class InterfaceClass implements Firstinterface, InterfaceC{

	@Override
	public void abstractMethod() {
		System.out.println("abstract 키워드 사용 추상 메서드 호출");
	}

	@Override
	public void abstractSecondMethod() {
		System.out.println("abstract 키워드 생략 추상 메서드 호출");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceClass interfaceClass = new InterfaceClass();
		
		// 추상 메서드 호출
		interfaceClass.abstractMethod();
		
		// 추상 메서드 호출
		interfaceClass.abstractSecondMethod();
		
		// interface의 default 메서드 호출
		interfaceClass.defaultMethod();
		
		// 클래스와 동일하게 객체를 생성하지 않고 static 메서드 호출
		Firstinterface.staticMethod();
		
		// 클래스와 동일하게 객체를 생성하지 않고 상수 호출
		System.out.println(Firstinterface.TYPE);
	}
}
