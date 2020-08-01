package overloadingExam;

class OverloadingClass{
	private int sex;
	private String name;
	
	// ������ �����ε�
	public OverloadingClass() {
		System.out.println("�ŰԺ����� ���� ������");
	}
	
	public OverloadingClass(String name) {
		this.name = name;
		
		System.out.println("String�� �ŰԺ����� ���� ������");
	}
	
	public OverloadingClass(int sex) {
		this.sex = sex;
		
		System.out.println("int�� �ŰԺ����� ���� ������");
	}
	
	// �޼��� �����ε�
	public void overloadingMethod() {
		System.out.println("�ŰԺ����� ���� �޼���");
	}
	
	public void overloadingMethod(String name) {
		System.out.println("String�� �ŰԺ����� ���� �޼���");
	}
	
	public void overloadingMethod(int name) {
		System.out.println("int�� �ŰԺ����� ���� �޼���");
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		// �ŰԺ����� ���� ������ ȣ��
		OverloadingClass overLoadingClass1 = new OverloadingClass();
		// String�� �ŰԺ����� ���� ������ ȣ��
		OverloadingClass overLoadingClass2 = new OverloadingClass("HAN");
		// int�� �ŰԺ����� ���� ������ ȣ��
		OverloadingClass overLoadingClass3 = new OverloadingClass(1);
		
		// �ŰԺ����� ���� �޼��� ȣ��
		overLoadingClass1.overloadingMethod();
		// String�� �ŰԺ����� ���� �޼��� ȣ��
		overLoadingClass1.overloadingMethod("HAN");
		// int�� �ŰԺ����� ���� �޼��� ȣ��
		overLoadingClass1.overloadingMethod(3);
	}
}


