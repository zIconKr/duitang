import java.util.Scanner;
public class MainProduct {
	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		Scanner i=new Scanner(System.in);
		int o=i.nextInt();			//����һ����������
		String a=String.valueOf(o);		//������ת�����ַ���
		char[] number=a.toCharArray();		//���ַ���ת���ַ�����
		String[] n=new String[number.length];	//����һ���ַ������飬�������ַ�����תΪ�ַ�������
		int[] m=new int[number.length];			//����һ���������飬�������ַ�������תΪ��������
		for(int k=0;k<number.length;k++){	
			n[k]=number[k]+"";
			m[k]=Integer.parseInt(n[k]);
		}
		Product myproduct=new Product();
		myproduct.z(m);
		

	}
}