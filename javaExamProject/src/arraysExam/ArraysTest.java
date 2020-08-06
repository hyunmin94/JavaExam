package arraysExam;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		
// 1 -- 배열 복사 : 첫번째 인덱스부터 두번째 인자값에 지정한 갯수만큼 복사		
		int[] copyOfArr = Arrays.copyOf(nums, 3);
		System.out.println("copyOf : " + Arrays.toString(copyOfArr));
		
// 2 -- 배열 원하는 위치 복사 : 두번째 인자 위치부터 세번째 인자 위치-1 까지의 배열 복사
		int[] copyOfRangeArr = Arrays.copyOfRange(nums, 1, 4);
		System.out.println("copyOfRange : " + Arrays.toString(copyOfRangeArr));
		
// 3 -- 배열의 정렬 : 두번째 인자 위치부터 세번째 인자 위치-1 까지의 배열을 오름차순 정렬
		int[] sortNums = {5,4,3,2,1};
		Arrays.sort(sortNums, 1, 4);
		
		// 배열의 전체 원소를 오른차순 정렬
		// Arrays.sort(sortNums); 
		// 결과  : [1,2,3,4,5]
		System.out.println("sort : " + Arrays.toString(sortNums));
		
// 4 -- 원하는 원소의 인덱스 찾기 
		System.out.println("binarySearch : " + Arrays.binarySearch(nums, 4));
		
		// 오름차순 정렬이 되어있지 않은 배열의 원소 인덱스를 제대로 찾아오지 못한다.
		System.out.println("binarySearchErr : " + Arrays.binarySearch(new int[] {5,4,3,2,1}, 4));
		
// 5 -- 배열의 원소값 변환 : 두번째 인자 위치부터 세번째 인자 위치-1 까지의 배열을 원소값 수정
		Arrays.fill(nums, 1, 4, 6);
		
		// 배열의 전체 원소를 수정
		// Arrays.fill(nums, 6); 
		// 결과  : [6,6,6,6,6]
		System.out.println("fill : " + Arrays.toString(nums));
		
	}
}
