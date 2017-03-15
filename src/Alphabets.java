public class Alphabets {
	int n,q,i=0;
	int r[]=new int[502];
	
	public void quo_rem(int value) {
		i++;
		q=value/26;
		r[i]=value%26;
		}
	public void calculate() {
		if(q>26 && r[i]!=0){
			if(q>26){
				quo_rem(q);
				calculate();	
				}
		}else if(q>26 && r[i]==0){
			r[i]=26;
			q=q-1;
			if(q>26){
				quo_rem(q);	
				calculate();	
				}
		}
	
	}
	public void result() {
		
			System.out.print((char)(q+64));	
		for (int rs = 501; rs > 0; rs--) {
			if(r[rs]!=0){	
			System.out.print((char)(r[rs]+64));
			}
		}
	}
	
	public void start(int n){
		i=0;
		System.out.print("\n"+n+"--");
		if(n<=26){
			System.out.print((char)(n+64));	
		}else {
			quo_rem(n);
			calculate();
			result();
		}
	}
	
public static void main (String args[]){
	
 Alphabets ap=new Alphabets();
for(int kk=53 ; kk<528252;kk=((kk*26)+26)){
ap.start(kk);
} 
 }
}
