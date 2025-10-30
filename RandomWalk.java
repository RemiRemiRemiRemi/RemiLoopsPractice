//Remi-Laurent Guy | 10/30/25 | Random Walk
class RandomWalk {
    public static void main(String[] args) {
        
        int average = 0;
        int greatestNumTrials = 0;

        for(int trials = 0; trials <= 50; trials++){
        int personPosition = 4;
        int stepsToFall = 0;
        while(personPosition != 0 && personPosition != 8){
            
         if((int)(Math.random() * 2) == 0){
         personPosition++;
         }
         else{
         personPosition--;  
         }
        
         stepsToFall++;
        }
        
        trials++;
        average += stepsToFall;
        if(stepsToFall > greatestNumTrials){
        greatestNumTrials = stepsToFall;
        }
        }
        
        System.out.println((average /= 50) + " trials average to fall");
        System.out.println(greatestNumTrials + " was the greatest amount of trials it took to fall");
}
}