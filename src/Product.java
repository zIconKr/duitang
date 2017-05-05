
public class Product {
	void z(int m[]){
	for(int l=0;l<m.length;l++){
		int product=1;							//乘积初始化为1
		for(int p=0;p<m.length;p++){
			if(l==p){							//当乘数为自己本身时，跳过本次乘积
				continue;
			}
			product=product*m[p];
		}
		System.out.println("第"+(l+1)+"个数的乘积为"+product);
	}
	}
}
