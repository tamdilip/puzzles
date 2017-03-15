
public class DoorTog {

	public static void main(String []args){
	  int gate[]=new int[100];

	int i,j;

	for(i=0;i<100;i++){

	gate[i]=0;

	}

	for(i=0;i<100;i++){

	for(j=i;j<100;j=j+i+1){
System.out.println("j-"+j);
	if(gate[j]==0)

	gate[j]=1;

	else

	gate[j]=0;

	}

	}

	for(i=0;i<100;i++){
	if(gate[i]==1)
	System.out.println(i+1);

	}
  }

}
