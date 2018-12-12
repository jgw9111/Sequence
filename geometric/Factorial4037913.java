package geometric;
/*
 * 1
 * 2 = 2*1
 * 3 = 3*2*1 
 * 4 = 4*3*2*1
 * 10항까지의 시리즈는 ? 4037913 이다.
 * */
public class Factorial4037913 {
	public static void main(String[] args) {
		int S = 1;
		int F = 1; 
		int N = 1; // count
		
		while(true) {
			N++; //고정
			F *= N;
			S = S + F; // S += F;
			//System.out.println("N의 값 "+ N);
			
			if(N == 10) {
				break;
			}
		}
		System.out.printf("S is %d",S); 
	}
}
