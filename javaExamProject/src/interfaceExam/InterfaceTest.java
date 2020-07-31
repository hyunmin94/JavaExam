package interfaceExam;

// ���� ��� ���ø� ���� interface 
interface InterfaceA{}
interface InterfaceB{}

// ���� ���� ���ø� ���� interface
interface InterfaceC{}

interface Firstinterface extends InterfaceA, InterfaceB{
	
	// ���
	public static final String TYPE = "���";
	
	// �߻� �޼���
	public abstract void abstractMethod();
	
	// abstract Ű���� ���� �߻� �޼��� 
	public void abstractSecondMethod();
	
	// default �޼���
	public default void defaultMethod() {
		System.out.println("default �޼��� ȣ��");
	}
	// static �޼���
	public static void staticMethod() {
		System.out.println("static �޼��� ȣ��");
	}
}

class InterfaceClass implements Firstinterface, InterfaceC{

	@Override
	public void abstractMethod() {
		System.out.println("abstract Ű���� ��� �߻� �޼��� ȣ��");
	}

	@Override
	public void abstractSecondMethod() {
		System.out.println("abstract Ű���� ���� �߻� �޼��� ȣ��");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceClass interfaceClass = new InterfaceClass();
		
		// �߻� �޼��� ȣ��
		interfaceClass.abstractMethod();
		
		// �߻� �޼��� ȣ��
		interfaceClass.abstractSecondMethod();
		
		// interface�� default �޼��� ȣ��
		interfaceClass.defaultMethod();
		
		// Ŭ������ �����ϰ� ��ü�� �������� �ʰ� static �޼��� ȣ��
		Firstinterface.staticMethod();
		
		// Ŭ������ �����ϰ� ��ü�� �������� �ʰ� ��� ȣ��
		System.out.println(Firstinterface.TYPE);
	}
}
