package casting;

public class Child extends Parent{
	public Child() {
		System.out.println("자식 클래스 생성자 호출");
	}
	
	public void childMethod() {
		System.out.println("자식 클래스 일반 메소드 호출");
	}
}

