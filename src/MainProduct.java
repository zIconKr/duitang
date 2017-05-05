import java.util.Scanner;
public class MainProduct {
	public static void main(String[] args) {
		System.out.println("请输入一串数字：");
		Scanner i=new Scanner(System.in);
		int o=i.nextInt();			//输入一串整型数字
		String a=String.valueOf(o);		//将整型转换成字符串
		char[] number=a.toCharArray();		//将字符串转成字符数组
		String[] n=new String[number.length];	//创建一个字符串数组，将上述字符数组转为字符串数组
		int[] m=new int[number.length];			//创建一个整型数组，将上述字符串数组转为整型数组
		for(int k=0;k<number.length;k++){	
			n[k]=number[k]+"";
			m[k]=Integer.parseInt(n[k]);
		}
		Product myproduct=new Product();
		myproduct.z(m);
		

	}
}