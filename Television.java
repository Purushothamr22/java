class Television{

    static boolean isConnected;
	
	public static boolean onOrOff(String mi[]){
	 if(isConnected== false){
	  isConnected = true;
	  System.out.println("the speaker is connected : " + isConnected);
	}
   else if(isConnected== true){
   isConnected= false;
   System.out.println("the speaker is connected : " + isConnected);

   }
   return isConnected;

}
}