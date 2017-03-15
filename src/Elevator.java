
public class Elevator {
  static int cf,pf,df;
	public static void main (String args[])throws InterruptedException
	{
		cf = (int) (Math.random()*10+1);
		pf=Integer.parseInt(args[0]);
		df=Integer.parseInt(args[1]);
		System.out.println("Current elevator position : "+cf);
		System.out.println("Enter the current floor : "+pf);
		if(cf==pf){
			process();
		}
		if(cf > pf){
			elevDown(pf);
			process();
		}

		if(cf < pf){
			elevUp(pf);
			process();
		}
	}

	public static void elevDown(int pf) throws InterruptedException {
		System.out.println("Elevator Down");
		for(int i=cf ;i>=pf;i--){
			System.out.println(i);
			cf=i;
			Thread.sleep(1000);
		}
	}
	
	public static void elevUp(int pf) throws InterruptedException {
		System.out.println("Elevator Up");
		for(int i=cf ;i<=pf;i++){
			System.out.println(i);
			cf=i;
			Thread.sleep(1000);
		}
	}
	
	public static void process() throws InterruptedException{
		System.out.println("Get in");
		System.out.println("Enter the destination floor : " +df);
		if(cf > df){
			elevDown(df);
			System.out.println("Arrived");
		} else if(cf < df){
			elevUp(df);
			System.out.println("Arrived");
		}
	}
}
