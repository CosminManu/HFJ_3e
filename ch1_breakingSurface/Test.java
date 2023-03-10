class Test {
	public static void main(String[] a){
		int x = 0;
		int y = 0;
		while(x<5){
			//y = x - y;  	   // 00 11 21 32 42
			//y = y + x;	   // 00 11 23 36 410
			y = y + 2;
			if(y > 4){
			y = y-1;		// 02 14 25 36 47
			}
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}
}