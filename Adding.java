class Adding{

 public static void main (String three[]){
	 
	sum(); 
	 
 }
 
 
 public static void sum(){
 int number[] = {97,13,86,24,33,52,28,54,4,26,13,26};
 int target = 30;
 
 for (int i=0;i<number.length;i++){
  for (int j=i+1;j<number.length;j++){
	  System.out.println(i + j);
   for (int k=j+1;k<number.length;k++){
   
   if(number[i]+number[j]+number[k]== target){
   System.out.println("["+i + "," + j + "," + k+"]");
   }  
  }
 if (number[i]+number[j]== target){
	 System.out.println("[" + i + "," + j + "]");
 }
 }
 }
 }

}