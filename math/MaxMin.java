package math;
import java.util.Random;
/*<문제>
1개 반의 학생의 몸무게를 측정하였다
- 각 학생의 수는 30명이다.
- 각 반의 학생 몸무게의 최대, 최소 값을 구하여라 
- 단, 몸무게는 40 ~ 100 사이에서만 랜덤으로 생성시키시오
 * 
 * */
public class MaxMin {
	public static void main(String[] args) {
		int[] weight = new int[30];
		Random random = new Random();
		int max = 40 , min = 100;
		for(int i=0;i<30;i++) {
			weight[i] = random.nextInt(61)+40;
			System.out.println("weight의 값"+weight[i]);
		}
	
		for(int i=0;i<30;i++) {
			if(weight[i] >= max) {
				max = weight[i];
			}
			if(weight[i] <= min){
				min = weight[i];
			}
		}
		
		System.out.printf("최대값은 %d 이고, 최소값은 %d 이다.",max,min);
		
	}
}
