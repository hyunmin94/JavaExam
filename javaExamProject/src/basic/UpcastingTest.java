package basic;

class Parent{
	public Parent() {
		System.out.println("�θ� Ŭ���� ������ ȣ��");
	}
	
	public void parentMethod() {
		System.out.println("�θ� Ŭ���� �Ϲ� �޼ҵ� ȣ��");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("�ڽ� Ŭ���� ������ ȣ��");
	}
	
	public void childMethod() {
		System.out.println("�θ� Ŭ���� �Ϲ� �޼ҵ� ȣ��");
	}
}

public class UpcastingTest {

	public static void main(String[] args) {
		Parent p = new Child();
		
		p.parentMethod();
//		p.childMethod(); Child(�ڽ�Ŭ����)�� �����ϰ� ������ �ڽ�Ŭ������ �ν��Ͻ� ������ �޼ҵ�� ȣ���� �� ����.
	}

}




