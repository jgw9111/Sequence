package array;
import java.util.Scanner;

public class Myclass {
	public static void main(String[] args) {
		
		String[] res = {}; /*int count = 0;
		String[] res = new String[count];*/
		String[] class1 = new String[20];
		String[] vivace = {"은지","창준","서우","지우","현일"};
		String[] javachung = {"창하","은영","정욱","수호"," "};
		String[] atlas= {"동준","이레","종협","지은"," "};
		String[] nm= {"정우","승아","태혁","기호"," "};
		System.out.println("팀명?");
		Scanner scanner = new Scanner(System.in);
		String team = scanner.next();
		
		switch(team) {
		case"vivace":res = vivace; break;
		case"javachung":res= javachung; break;
		case"atlas":res=atlas; break;
		case"nm":res=nm; break;
		}
		
		//System.out.print(vivace[0]+javachung[0]+atlas[0]+nm[0]);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"\t"); //답을 먼저 코딩하기
		}
		
	}
}