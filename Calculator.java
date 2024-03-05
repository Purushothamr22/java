class Calculator{

    public static void main (String calculate[]){
	
	      add(58,54);
		  sub(58,54);
		  multi(58,54);
		  div(58,54);
		  sqrt(58);
		  square(58);
		  inverse(20);
		  per(58,54);
	}


   public static void  add( int number1,int number2){
   
          int result = number1 + number2;
		  System.out.println(result);
   
   }

   public static void sub(int number1,int number2){
	   
	   int result = number1 - number2;
	   System.out.println(result);
   }
   
   
   public static void multi( int number1, int number2){
	   double result =  number1 * number2;
	   System.out.println(result);
   }
   
   public static void div( int number1, int number2 ){

	   double result = number1 / number2;
	   System.out.println(result);
   }
   
   public static void sqrt( int number1){
	   
	   double result = Math.sqrt (number1);
	   System.out.println(result);   
   }
   
   public static void square(int number1){
	   
	   double result = (number1 * number1);
	   System.out.println(result);
   }
   
   public static void inverse( double number1){
	   
	   double result = (1 / number1);
	   System.out.println(result);
   }
   
   public static void per(int number1, int number2){
	   
	 double result = (number1/number2)*100;
	 System.out.println(result);
   }
}

