package casting;

public class UpcastingTest {

	public static void main(String[] args) {
		
//		�� ��ĳ������ ��� ����ȯ��ȣ�� ������ �� �ִ�.
//		Parent p = (Parent) new Child(); 
		
		Parent p = new Child();
		p.parentMethod();
		
//		�� Child(�ڽ�Ŭ����)�� �����ϰ� ������ �ڽ�Ŭ������ �ν��Ͻ� ������ �޼ҵ�� ȣ���� �� ����.
//		p.childMethod();
	}
}




