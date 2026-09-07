package d0903;

public class ObjectArray {
	
	Object[] arr;
	Object[] temp;
	int idx;
	int size;
	
	public ObjectArray() {
		arr = new Object[3];
		size = 3;
	}
	
	public void add(Object o) {
		if(idx == arr.length) {
			temp = new Object[size];
			idx = 0;
			for(Object n : arr) {
				temp[idx++] = n;
			}
			
			arr = new Object[size*2];
			size *= 2;
			idx = 0;
			for(Object n : temp) {
				arr[idx++] = n;
			}
		}
		arr[idx++] = o;
	}
	
	// 1개 추가되고 한칸씩 뒤로 밀려야됨.
	public void insert(int idx, Object o) {
		// 1칸 늘린 temp 생성하고
		temp = new Object[arr.length+1];
		//arr값들 idx-1까지 temp에 대입
		for(int i = 0; i < idx; i ++) {
			temp[i] = arr[i];
		}
		//idx에 num 대입
		temp[idx] = o;
		
		//idx+1부터 temp에 대입
		for(int i = idx+1; i < temp.length; i++) {
			temp[i] = arr[i-1];
		}
		arr = new Object[temp.length];
		int i = 0;
		for(Object n : temp) {
			arr[i++] = n;
		}
	}
	
	public void modify(int idx, Object o) {
		try {
			arr[idx] = o;	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public void remove(int idx) {
		try {
			arr[idx] = null;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void removeAll() {
		for(int i = 0; i < idx ; i ++) {
			arr[i] = null;
		}
		idx = 0;
	}
	
	public Object get(int idx) {
		try {
			return arr[idx];	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "잘못된 인덱스 값";
		}
	}
	
	public void printArray() {
		int i = 0;
		for(Object n : arr) {
			System.out.println("ObjectArray["+i++ +"] : "+n);
		}
	}

}
