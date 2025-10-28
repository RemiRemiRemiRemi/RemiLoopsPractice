//Remi-Laurent Guy | 10/27/25 | Loops Practice
public class Example1 {
    public static void main(String[] args) {
        
    System.out.println(countFactors(24));
    
    System.out.println(isPrime(47));
    
    }
    
    
    public static int countFactors(int num){
    //Return the number of factors in the number! :O
    
    int factors = 0;
    
    for(int count = 1; count <= num; count++){
    
    if(num % count == 0){
        
    factors++;
        
    }
    
    
    }
    
    return factors;
    
    }
    
    public static boolean isPrime(int num){
    //Determine if it's prime or not (I bet you couldn't tell from the method signature)
    //Use the other method (countFactors)
    
    if(countFactors(num) == 2){
    
    return true;
    
    }
    else{
        
    return false;
    
    }
    }
    }