package package1;

public class Assignment2 
{
	public int multi(int x1,int x2)
	  {
		int x3;
		x3=x1*x2;
		System.out.println("multi result is "+x3);
		return x3;
	  }
	public int sub(int x,int y) 
	  {
		int z;
		z=x-y;
		System.out.println("sub result is "+z);
		return z;
	  }
	public int sum(int a,int b) 
      {
        int c;
        c=a+b;
        System.out.println("sum result is "+c);
        return c;
      }
    public void divide(int y1,int y2)
      {
	    int y3;
	    y3=y1/y2;
	    System.out.println("final result is "+y3);
      }
  public static void main(String[] args) 
  {
	  Assignment2 deep=new Assignment2();
	  int multiresult=deep.multi(10,2);
	  int subresult=deep.sub(multiresult,2);
	  int sumresult=deep.sum(subresult,2);
	  int subresult2=deep.sub(sumresult,2);
	  deep.divide(subresult2,2);
  }
}
	

