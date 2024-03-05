class Factorial{

  public static void main(String factioral[]){
  
   int ncr = fact(9)/(fact(9-7)*fact(7));
   System.out.println("NCR for 9 and 7 is " + ncr);
  
  }

   public static int fact(int factNumber){
	   
	  int fact = 1;
	 for (int f=1; f <= factNumber;f++){
		 fact = fact * f;
	 }
	   return fact;  
   }

}