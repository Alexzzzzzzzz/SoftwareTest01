package junit01;

public class junit01 {
	int a,b,c;
	String equilateral = "�ȱ�������";
	String isosceles = "����������";
	String scalene = "������������";
	String err = "���ܹ���������";
	public String triangle(int x,int y ,int z)
	{
		a=x;
		b=y;
		c=z;
		if(a<=0 || b<=0 || c<=0)
		{
			return err;
		}
		else if ((a+b<=c)||(b+c<=a)||(c+a<=b))
		{
			return err;
		}
		else if((a==b)&&(a==c))
		{
			return equilateral;
		}
		else if(((a==b)&&(a!=c))||((a==c)&&(a!=b))||(b==c)&&(a!=b))
		{
			return isosceles;
		}
		else
		{
			return scalene;
		}
	}
}
