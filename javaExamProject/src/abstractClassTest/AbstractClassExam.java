package abstractClassTest;

abstract class AbstractClass{
	
	String str = "�ν��Ͻ� ����";
	
	public AbstractClass() {
		System.out.println("�߻�Ŭ������ ������ ȣ��");
	}
	
	public void basicMethod() {
		System.out.println("�Ϲ� �޼ҵ� ȣ��");
	}
	
	public abstract String AbstractMethod();
}

class BasicClass extends AbstractClass{
	
	public BasicClass() {
		System.out.println("�ڽ�Ŭ���� ������ ȣ��");
	}

	@Override
	public String AbstractMethod() {
		return "�������̵� �߻�޼ҵ� ȣ��";
	}
}

public class AbstractClassExam {

	public static void main(String[] args) {
		
		// �߻�Ŭ������ ������ ȣ��
		BasicClass basicClass = new BasicClass();
		
		// �߻�Ŭ���� �ν��Ͻ� ����
		System.out.println(basicClass.str);
		
		// �߻�Ŭ������ �Ϲ� �޼��� ȣ��
		basicClass.basicMethod();
		
		// �߻�޼ҵ� ȣ��
		System.out.println(basicClass.AbstractMethod());
	}
}