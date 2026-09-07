package d0903;

public class ArrayPrinter {
	
	// genericMethod 표시 <T>
	public static <T> T getLast(T[] arr) {
		return arr[arr.length - 1];
	}
	
	//배열을 넣어주면 배열의 자료를 순서대로 출력하는 제네릭 함수 (향상된 for 문을 써보자)
	public static <T> void printArr(T[] arr) {
		for(T value : arr) {
			System.out.println(value);
		}
	}

}
