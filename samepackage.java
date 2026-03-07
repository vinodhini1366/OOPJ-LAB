package p1;
public class SamePackage
{
	public SamePackage(){
	protection p=new protection();
	System.out.println("same package constructor");
	System.out.println("n="+p.n);
	//System.out.println("n_pri"+n_pri);
	System.out.println("n_pro"+p.n_pro);
	System.out.println("a_pub"+p.a_pub);
	}
}