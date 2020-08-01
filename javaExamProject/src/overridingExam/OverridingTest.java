package overridingExam;

class Pet{
	protected String bark(String name, int sex) throws Exception{
		System.out.println("부모클래스의 메서드");
		return null;
	}
}

class Dog extends Pet{

	@Override
	public String bark(String name, int sex) throws NullPointerException {
		System.out.println("자식클래스의 메서드");
		return null;
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		
		// 자식클래스 객체 생성
		Dog dog = new Dog();
		
		// 자식클래스에 오버라이딩된 bark 메서드가 호출된다.
		dog.bark("이름", 1);
	}
}
