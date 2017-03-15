import java.text.DecimalFormat;

public class MagicSquare {

	public static void main(String []args){
	
		int n=5,mid,x=1;
		int i,j;
		int a[][]=new int[n][n];
		if(n%2!=0){
			System.out.println("Square : "+n+"x"+n);
			mid=n/2;
			System.out.println("Middle="+mid);
			i=0;j=mid;
			a[i][j]=x++;
			System.out.println(i+"-"+j+"="+a[i][j]);

			--i;++j;
		
			while(x<=n*n){
				
				if(i<0){
					i=n-1;
					a[i][j]=x++;
					System.out.println(i+"-"+j+"="+a[i][j]);
			
				}else if (j>=n){
					j=0;
					a[i][j]=x++;
					System.out.println(i+"-"+j+"="+a[i][j]);
				}
				
				else{
					--i;++j;
					if(i>=0 && j<n && a[i][j]==0 ){
					a[i][j]=x++;
					System.out.println(i+"-"+j+"="+a[i][j]);
					}
					else if (i>=0 && j<n && a[i][j]!=0){
						i=i+2;--j;
						a[i][j]=x++;
						System.out.println(i+"-"+j+"="+a[i][j]);
					}else if(i<0 && j>=n){
						i=i+2;--j;
						a[i][j]=x++;
						System.out.println(i+"-"+j+"="+a[i][j]);
						
					}
			
				}
	}
			
			for(int k=0;k<n;k++){
				for(int l=0;l<n;l++){
					System.out.print(new DecimalFormat("00").format(a[k][l])+" | ");
				}	
				System.out.println("");
			}	
			
		}else
		{
			System.out.println("Not an odd number");
		}
		
		
	}
	
}
