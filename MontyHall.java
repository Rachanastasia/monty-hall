import java.util.Random;

public class MontyHall {
    public double[] simulate(){
      double[] result = {0, 0};
      Random random = new Random();
      
      for(int i=0; i<=1000;i=i+1){
        int[] choices = {0, 0, 0};
        int carPosition = random.nextInt(3);
        choices[carPosition] = 1;
        
        int userChoice = random.nextInt(3);
  
        if(choices[userChoice] == 1){
          result[1] = result[1] + 1;
        }
        else{
          result[0] = result[0] + 1;
        }
      }
      result[0] = result[0] / 10;
      result[1] = result[1] / 10;
      return result;
    }
}