package d0909EnumTest;

public enum Operation {

	PLUS{
		@Override
		public int calculate(int a, int b) {
			return a + b;
		}
	},
	
	MINUS{
		@Override
		public int calculate(int a, int b) {
			return a - b;
		}
	};
	
	public abstract int calculate(int a, int b);
}
