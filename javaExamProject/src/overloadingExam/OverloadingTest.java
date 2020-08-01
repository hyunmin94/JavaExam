package overloadingExam;

class OverloadingClass{
	private int sex;
	private String name;
	
	// 생성자 오버로딩
	public OverloadingClass() {
		System.out.println("매게변수가 없는 생성자");
	}
	
	public OverloadingClass(String name) {
		this.name = name;
		
		System.out.println("String형 매게변수를 갖는 생성자");
	}
	
	public OverloadingClass(int sex) {
		this.sex = sex;
		
		System.out.println("int형 매게변수를 갖는 생성자");
	}
	
	// 메서드 오버로딩
	public void overloadingMethod() {
		System.out.println("매게변수가 없는 메서드");
	}
	
	public void overloadingMethod(String name) {
		System.out.println("String형 매게변수를 갖는 메서드");
	}
	
	public void overloadingMethod(int name) {
		System.out.println("int형 매게변수를 갖는 메서드");
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		// 매게변수가 없는 생성자 호출
		OverloadingClass overLoadingClass1 = new OverloadingClass();
		// String형 매게변수를 갖는 생성자 호출
		OverloadingClass overLoadingClass2 = new OverloadingClass("HAN");
		// int형 매게변수를 갖는 생성자 호출
		OverloadingClass overLoadingClass3 = new OverloadingClass(1);
		
		// 매게변수가 없는 메서드 호출
		overLoadingClass1.overloadingMethod();
		// String형 매게변수를 갖는 메서드 호출
		overLoadingClass1.overloadingMethod("HAN");
		// int형 매게변수를 갖는 메서드 호출
		overLoadingClass1.overloadingMethod(3);
	}
}


