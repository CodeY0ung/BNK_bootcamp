package d0831;

public class IntArray {

	private int arrSize = 3;
	// 현재 공간
	private int[] arr;
	// 임시 저장 배열 
	private int[] tempArr;
	
	private int i = 0;
	
	public IntArray() {
		arr = new int[3];
	}
	
	// setter
	public void setArr(int num1, int num2, int num3) {
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
	}
	
	// getter
	public int[] getArr() {
		return arr;
	}
	
	// print
	public void printArr() {
		int i = 0;
		for(int num : arr) {
			System.out.println("index["+i++ +"] : "+num);
		}
	}
	
	// add one value
	public void add(int num) {
		// 공간이 모자라면
		if(i == arr.length) {
			i = 0;
			// 현재 배열에 있던 숫자 저장
			tempArr = new int[arr.length];
			for(int n : arr) {
				tempArr[i++] = n;
			}
			
			i = 0;
			// 2배 공간의 새로운 배열 생성
			arr = new int[arrSize*2];
			for(int n : tempArr) {
				arr[i++] = n;
			}
			arrSize *= 2;
		}
		
		arr[i++] = num;
	}
	
	// size of number in array 현재 배열에 직접 할당한 값의 개수
	public int size() {
		return i;
	}
	
	// delete value all
	public void delete(int num) {
		int idx = 0;
		int deleteCnt = 0;
		for(int n : arr) {
			if(n==num) {
				arr[idx] = 0;
				deleteCnt++;
			}
			idx++;
		}
		i -= deleteCnt;
		System.out.println(num+" 전체 삭제 완료");
	}
	
	// 교체
	
	
	
}
