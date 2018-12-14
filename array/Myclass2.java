package array;
import java.util.Scanner;

public class Myclass2 {
	public static void main(String[] args) {
		String[] class1 = new String[20];
		String[] vivace = {"은지","창준","서우","지우","현일"};
		String[] javachung = {"창하","은영","정욱","수호"," "};
		String[] atlas= {"동준","이레","종협","지은"," "};
		String[] nm= {"정우","승아","태혁","기호"," "};
		
		String[] res = {"","","",""};

		for(int i=0;i<1;i++) {
			res[i] = vivace[0];
			res[i+1] = javachung[0];
			res[i+2] = atlas[0];
			res[i+3] = nm[0];
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"\t"); //답을 먼저 코딩하기
		}
	}
}