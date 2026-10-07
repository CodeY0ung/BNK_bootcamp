package d1007_inner_class;

interface Flyable{
	void fly();
//	void move();
}

public class NoParamNoReturn {

	public static void main(String[] args) {

		
//		Flyable을 구현하는 class를 따로 만들지 않고 구현체를 만들 수 있다.
		Flyable f = new Flyable(){
			@Override
			public void fly(){
				System.out.println("fly");
			}
			
//			@Override
//			public void move() {
//				System.out.println("move");
//			}
		};
		
		f.fly();
		
//		---------------------------------------------------
//		lambda 표현식은 추상 메서드 1개를 가지고있는 인터페이스만 구현할 수 있다.
//		구현을 2줄로하는건 상관없긴해. 근데 {} 쳐야함.
		Flyable f1 = () -> {
			System.out.println("fly_lambda_before");
			System.out.println("fly_lambda_before2");
		};
		
		f1.fly();
		
//		---------------------------------------------------
//		이게 일반적으로 제대로된 lambda.
		Flyable f3 = () -> System.out.println("fly_lambda");
		f3.fly();
		
	}

}
