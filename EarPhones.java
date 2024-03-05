class EarPhones{
static boolean isConnected ;

   public static boolean onOrOff(){
   
   System.out.println("inside onOrOff methord");
    if(isConnected== false){
	  isConnected = true;
	  System.out.println("the EarPhone is connected : " + isConnected);
	}
   else if(isConnected== true){
   isConnected= false;
   System.out.println("the EarPhone is connected : " + isConnected);

   }
   return isConnected;
   }

}