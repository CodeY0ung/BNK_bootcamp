package d0903;

public class GenericInfinityArray<T> {
	
	private Object[] arr;
	private int currentIdx;
	
	
	public GenericInfinityArray() {
		arr = new Object[3];
	}
	
	public void add(T o) {
		if(currentIdx >= arr.length) {
			Object[] temp = new Object[arr.length + 3];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			
			arr = temp;
		}
		
		arr[currentIdx++] = o;
	}
	
	public int size() {
		return currentIdx;
	}
	
	public void printArray() {
		if(currentIdx == 0) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		for(int i = 0; i < currentIdx; i++) {
			System.out.println((i+1) + ")" + arr[i]);
		}
	}
	
	public void remove(int idx) {
		if(idx < 0 || idx >= currentIdx) {
			System.out.println("삭제할 위치가 아닙니다.");
			return;
		}
		currentIdx--;
		for(int i = (idx+1); i <= currentIdx; i++) {
			System.out.println("moving....");
			arr[i-1] = arr[i];
		}
	}
	
	public void insert(int idx, T o) {
		if(idx < 0 || idx > currentIdx) {
			System.out.println("삽입할 수 있는 위치가 아닙니다.");
			return;
		}
		
		if(currentIdx >= arr.length) {
			Object[] temp = new Object[arr.length + 3];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			
			arr = temp;
		}
		
		
		for(int i = currentIdx; i > idx; i--) {
			arr[i] = arr[i-1];
			System.out.println("moving....");
		}
		
		arr[idx] = o;
		currentIdx++;
	}
	
	public void removeAll() {
		currentIdx = 0;
	}
	
	public Object get(int idx) {
		if(idx > currentIdx) {
			System.out.println("추출 할 수 있는 위치가 아닙니다.");
			return 0;
		}
		return arr[idx]; 
	}
	
	public void modify(int idx, T o) {
		if(idx < 0 || idx >= currentIdx) {
			System.out.println("수정할 수 있는 위치가 아닙니다.");
			return;
		}
		
		arr[idx] = o;
	}

}
