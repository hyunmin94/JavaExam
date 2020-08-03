package genericExam;

class GenericTestClassSecond <T>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

class ObjectTestClass{
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}

public class GenericTestSecond {

	public static void main(String[] args) {
			
// 1 -- ���׸� Ŭ����(Generic) ���
		GenericTestClassSecond<String> genericObj = new GenericTestClassSecond<String>();
		genericObj.setObj("Hello");
		// �����Ͻ� ���׸� Ÿ���� String�̱� ������ Integer�� �����͸� �Է��Ϸ��� �ϸ� ������ �߻��Ѵ�.
		// genericObj.setObj(123);
		
		// ���� ����ȯ ���ʿ�
		String str = genericObj.getObj();
		System.out.println(str);
		
// 2 -- Object���� �ν��Ͻ������� ���� Ŭ���� ���
		ObjectTestClass objectObj = new ObjectTestClass();
		objectObj.setObj("World");
		// ���� ����ȯ �ʿ� (�ٿ�ĳ����)
		String str1 = (String) objectObj.getObj();
		System.out.println(str1);
		
	}
}
