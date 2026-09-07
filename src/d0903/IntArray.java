package d0903;

public class IntArray {
	
	private int[] arr;

	private int[] temp;
	
	private int idx;
	
	private int size;
	
	public IntArray() {
		size = 3;
		arr = new int[3];
		temp = new int[3];
	}
	
	public void add(int num) {
		if(idx == arr.length) {
			temp = new int[size];
			idx = 0;
			for(int n : arr) {
				temp[idx++] = n;
			}
			
			arr = new int[size*2];
			size *= 2;
			idx = 0;
			for(int n : temp) {
				arr[idx++] = n;
			}
		}
		arr[idx++] = num;
	}
	
	// 1개 추가되고 한칸씩 뒤로 밀려야됨.
	public void insert(int idx, int num) {
		
		// 1칸 늘린 temp 생성하고
		temp = new int[arr.length+1];
		//arr값들 idx-1까지 temp에 대입
		for(int i = 0; i < idx; i ++) {
			temp[i] = arr[i];
		}
		//idx에 num 대입
		temp[idx] = num;
		
		//idx+1부터 temp에 대입
		for(int i = idx+1; i < temp.length; i++) {
			temp[i] = arr[i-1];
		}
		arr = new int[temp.length];
		int i = 0;
		for(int n : temp) {
			arr[i++] = n;
		}
		
	}
	
	public void modify(int idx, int num) {
		try {
			arr[idx] = num;	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getStackTrace());
			
		}
	}
	
	public void remove(int idx) {
		try {
			arr[idx] = 0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void removeAll() {
		for(int i = 0; i < idx ; i ++) {
			arr[i] = 0;
		}
		idx = 0;
	}
	
	public int get(int idx) {
		try {
			return arr[idx];	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("잘못된 인덱스 값이므로 0 반환");
			return 0;
		}
	}
	
	public void printArray() {
		int i = 0;
		for(int n : arr) {
			System.out.println("IntArray["+i++ +"] : "+n);
		}
	}
}
