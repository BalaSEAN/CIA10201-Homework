package hw1;

public class Calculator {
	public int powerXY(int x, int y) throws CalException {
		int result;
		if(x == 0 && y == 0) 
			throw new CalException("0的0次方沒有意義!");		
		else if(y<0)
			throw new CalException("次方為負值，結果回傳不為整數!");
		else	
		result = (int) Math.pow(x, y);
		return result;
		
	}
}
