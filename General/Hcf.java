class Hcf{
	static int HcfTwo(int a,int b){
		if(a==b)
			return a;
		else
	{		if(a<b)
				return HcfTwo(a,b-a);
			else
				return HcfTwo(a-b,b);
	}
	}
	static int HcfThree(int a,int b,int c){
		if(a==0 || b==0 || c==0)
			return 0;
		else 
			{
				int gcd = HcfTwo(a,b);
				return HcfTwo(gcd,c);
			}
	}
	public static void main(String args[]){
		int num1 = 20,num2 = 28, num3 = 84;
		int hcf = HcfThree(num1, num2, num3);
		System.out.println("HCF of these no.s is "+ hcf);
	}
}