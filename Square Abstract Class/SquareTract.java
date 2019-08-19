package practise;

public abstract class SquareTract implements SquareFace {
	public abstract int volume(int s);
	public void print(int s) {
		System.out.println(s);
	}
	
	@Override
	public int area(int s) {
		return s * s;
	}
}
  
