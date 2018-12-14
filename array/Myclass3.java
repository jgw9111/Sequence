package array;
import java.util.Scanner;

public class Myclass3 {
	public static void main(String[] args) {
		String[] vivace = {"은지","창준","서우","지우","현일"};
		String[] javachung = {"창하","은영","정욱","수호"," "};
		String[] atlas= {"동준","이레","종협","지은"," "};
		String[] nm= {"정우","승아","태혁","기호"," "};
		String[] res = new String[4];
		String[][] class1 = {vivace,javachung,atlas,nm};

		for(int i=0;i<1;i++) {
			for(int j=0;j<4;j++) {
				res[j]=class1[j][i];
			}
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"\t"); //답을 먼저 코딩하기
		}
	}
}