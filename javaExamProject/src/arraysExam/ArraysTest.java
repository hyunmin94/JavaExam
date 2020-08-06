package arraysExam;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		
// 1 -- �迭 ���� : ù��° �ε������� �ι�° ���ڰ��� ������ ������ŭ ����		
		int[] copyOfArr = Arrays.copyOf(nums, 3);
		System.out.println("copyOf : " + Arrays.toString(copyOfArr));
		
// 2 -- �迭 ���ϴ� ��ġ ���� : �ι�° ���� ��ġ���� ����° ���� ��ġ-1 ������ �迭 ����
		int[] copyOfRangeArr = Arrays.copyOfRange(nums, 1, 4);
		System.out.println("copyOfRange : " + Arrays.toString(copyOfRangeArr));
		
// 3 -- �迭�� ���� : �ι�° ���� ��ġ���� ����° ���� ��ġ-1 ������ �迭�� �������� ����
		int[] sortNums = {5,4,3,2,1};
		Arrays.sort(sortNums, 1, 4);
		
		// �迭�� ��ü ���Ҹ� �������� ����
		// Arrays.sort(sortNums); 
		// ���  : [1,2,3,4,5]
		System.out.println("sort : " + Arrays.toString(sortNums));
		
// 4 -- ���ϴ� ������ �ε��� ã�� 
		System.out.println("binarySearch : " + Arrays.binarySearch(nums, 4));
		
		// �������� ������ �Ǿ����� ���� �迭�� ���� �ε����� ����� ã�ƿ��� ���Ѵ�.
		System.out.println("binarySearchErr : " + Arrays.binarySearch(new int[] {5,4,3,2,1}, 4));
		
// 5 -- �迭�� ���Ұ� ��ȯ : �ι�° ���� ��ġ���� ����° ���� ��ġ-1 ������ �迭�� ���Ұ� ����
		Arrays.fill(nums, 1, 4, 6);
		
		// �迭�� ��ü ���Ҹ� ����
		// Arrays.fill(nums, 6); 
		// ���  : [6,6,6,6,6]
		System.out.println("fill : " + Arrays.toString(nums));
		
	}
}
