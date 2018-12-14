package math;
import java.util.Scanner;
/*
  합성수를 소수의 곱으로 나타내는 방법
  20 = 2 * 2 * 5
*/
public class Factorizaion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수분해 할 수를 입력하세요");
		int target = scanner.nextInt();
		int count = 3;
		int[] res = new int[count]; // 동적(다이나믹)으로 생성함  <-> 정적(스태틱)
		if(target < 2) {
			return; // 밸류데이션 = 유효성체크
		}
		
		for(int i=0 ; i < res.length ; i++) {
			 if(target % (i+2) == 0) {
				 res[i] = (i+2);
				 
			 }
			 System.out.println(res[i]+" ");
		}
	}
}
