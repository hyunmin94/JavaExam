package casting;

public class DownCastingTest {

	public static void main(String[] args) {
		
//		�� ��Ÿ�� ���� �߻�(ClassCastException)
//		Child child = (Child) new Parent();
		
//		�� ��ĳ����
		Parent parent = new Child();
//		�� ��ĳ���õ� ���������� �̿��Ͽ� �ٿ�ĳ����
		Child child = (Child) parent;
		
		child.parentMethod();
		child.childMethod();
	}
}




