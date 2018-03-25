package junit01;

public class junit01 {
	int a,b,c;
	String equilateral = "等边三角形";
	String isosceles = "等腰三角形";
	String scalene = "不规则三角形";
	String err = "不能构成三角形";
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
