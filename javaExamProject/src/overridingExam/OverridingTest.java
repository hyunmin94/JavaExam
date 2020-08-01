package overridingExam;

class Pet{
	protected String bark(String name, int sex) throws Exception{
		System.out.println("�θ�Ŭ������ �޼���");
		return null;
	}
}

class Dog extends Pet{

	@Override
	public String bark(String name, int sex) throws NullPointerException {
		System.out.println("�ڽ�Ŭ������ �޼���");
		return null;
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		
		// �ڽ�Ŭ���� ��ü ����
		Dog dog = new Dog();
		
		// �ڽ�Ŭ������ �������̵��� bark �޼��尡 ȣ��ȴ�.
		dog.bark("�̸�", 1);
	}
}
