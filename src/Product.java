
public class Product {
	void z(int m[]){
	for(int l=0;l<m.length;l++){
		int product=1;							//�˻���ʼ��Ϊ1
		for(int p=0;p<m.length;p++){
			if(l==p){							//������Ϊ�Լ�����ʱ���������γ˻�
				continue;
			}
			product=product*m[p];
		}
		System.out.println("��"+(l+1)+"�����ĳ˻�Ϊ"+product);
	}
	}
}
