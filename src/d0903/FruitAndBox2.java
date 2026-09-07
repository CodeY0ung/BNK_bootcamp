package d0903;

public class FruitAndBox2 {

	public static void main(String[] args) {
		
		//박스 생성하기(사과용)
		Box2<Apple> appleBox = new Box2<>();
				
		//박스 생성하기(오렌지용)
		Box2<Orange> orangeBox = new Box2<>(); 
				
		//사과박스에 사과 담기
		appleBox.setOb(new Apple());
				
		//오렌지박스에 오렌지 담기
		orangeBox.setOb(new Orange());
				
		//사과 박스에서 사과 꺼내서 전용 변수에 담기
		Apple appleVariable = appleBox.getOb();
		
		//오렌지 박스에서 오렌지 꺼내서 전용 변수에 담기
		Orange orangeVariable = orangeBox.getOb();
		
		//사과 변수 출력하기
		System.out.println(appleVariable);
		
		//오렌지 변수 출력하기
		System.out.println(orangeVariable);
	}

}
