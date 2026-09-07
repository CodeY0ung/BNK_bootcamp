package d0901;

public interface TransportationInterface {
	
	public void take();
	
	default void stop() {
		System.out.println("운송수단이 멈춥니다");
	}
}
