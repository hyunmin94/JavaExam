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
		
		// 컴파일시 에러 발생
		// GenericTestClass<int> genericObj = new GenericTestClass<>();
	}
}

