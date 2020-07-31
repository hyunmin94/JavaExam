package abstractClassTest;

abstract class AbstractClass{
	
	String str = "인스턴스 변수";
	
	public AbstractClass() {
		System.out.println("추상클래스의 생성자 호출");
	}
	
	public void basicMethod() {
		System.out.println("일반 메소드 호출");
	}
	
	public abstract String AbstractMethod();
}

class BasicClass extends AbstractClass{
	
	public BasicClass() {
		System.out.println("자식클래스 생성자 호출");
	}

	@Override
	public String AbstractMethod() {
		return "오버라이딩 추상메소드 호출";
	}
}

public class AbstractClassExam {

	public static void main(String[] args) {
		
		// 추상클래스의 생성자 호출
		BasicClass basicClass = new BasicClass();
		
		// 추상클래스 인스턴스 변수
		System.out.println(basicClass.str);
		
		// 추상클래스의 일반 메서드 호출
		basicClass.basicMethod();
		
		// 추상메소드 호출
		System.out.println(basicClass.AbstractMethod());
	}
}