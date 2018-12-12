package geometric;
/*
 * 1-2+3-4+5-6... = -10
 * */
public class Switch10 {
	public static void main(String[] args) {
		String res = "";
		int a = 0;
		for(int i=0;i<21;i++) {
			/*if(i%2 == 0) {
				a -= i ;
			}else {
				a += i ;
			}*/
			a += (i%2==0) ? - i : i;
		}
		System.out.println(a);
		
	}
}



