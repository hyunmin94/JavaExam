package genericExam;

class GenericTestClass <T>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

public class GenericTest {
	
	public static void main(String[] args) {
		GenericTestClass<Integer> genericObj = new GenericTestClass<>();
		genericObj.setObj(7);
		System.out.println(genericObj.getObj());
		
		// �����Ͻ� ���� �߻�
		// GenericTestClass<int> genericObj = new GenericTestClass<>();
	}
}

