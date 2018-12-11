package arithmetic;
/**
 등차수열: 연속하는 두 항의 차이가 모두 일정한 수열
 공차(common difference) : 공통적으로 나타나는 차이 
 * */
public class Sequence {
	public static void main(String[] args) {
		int d = 6;
		int sum = 0;
		for(int i=1;i<6;i++) {
			sum += 2+(i-1)*d;
		}
		System.out.println(sum);
	}
}
