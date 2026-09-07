package d0902;

public class ObjectArray {
	
	private Object[] oa;
	private Object[] temp;
	private int idx;
	
	public ObjectArray() {
		oa = new ObjectArray[3];
	}
	
	public void add(Object o) {
		if(idx >= oa.length) {
			
		}
		
		oa[idx++] = o;
	}
}
