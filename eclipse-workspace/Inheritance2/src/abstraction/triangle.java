package abstraction;

public class triangle extends shapes{

	@Override
	public int sides() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	
	public static void main(String[] args) {
		triangle triang = new triangle();
		System.out.println("sides of triangle:" +triang.sides());
		triang.print();
	}

}
