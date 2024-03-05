class MixerTester{
public static void main(String lg[]){
	
  boolean isConnected = Mixer.onOrOff();
   System.out.println("finally is Mixer  connected : " + isConnected);
   
   
   
  boolean isConnected1 = Mixer.onOrOff();
   System.out.println("finally is Mixer  connected : " +  isConnected1);
   
}

} 