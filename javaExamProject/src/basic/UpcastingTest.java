package basic;

class Parent{
	public Parent() {
		System.out.println("부모 클래스 생성자 호출");
	}
	
	public void parentMethod() {
		System.out.println("부모 클래스 일반 메소드 호출");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("자식 클래스 생성자 호출");
	}
	
	public void childMethod() {
		System.out.println("자식 클래스 일반 메소드 호출");
	}
}

public class UpcastingTest {

	public static void main(String[] args) {
		
//		※ 업캐스팅의 경우 형변환기호를 생략할 수 있다.
//		Parent p = (Parent) new Child(); 업캐스팅의 경우 형변환기호를 생략할 수 있다.
		
		Parent p = new Child();
		p.parentMethod();
		
//		※ Child(자식클래스)를 참조하고 있지만 자식클래스의 인스턴스 변수와 메소드는 호출할 수 없다.
//		p.childMethod();
	}
}




