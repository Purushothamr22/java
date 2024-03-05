class Tv{

    static boolean isConnected;
	
	public static boolean onOff(String mi[]){
	 if(isConnected== false){
	  isConnected = true;
	  System.out.println("the Tv is connected : " + isConnected);
	}
   else if(isConnected== true){
   isConnected= false;
   System.out.println("the Tv is connected : " + isConnected);

   }
   return isConnected;

}
}