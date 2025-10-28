//Remi-Laurent Guy | 10/27/25 | Loops Practice
public class Example2 {
    public static void main(String[] args) {
        
        System.out.println(primes(9));
    
    }
    
    public static int primes(int n){
        //Finds number of primes in the number
        int count2 = 0;
        int j = 2;
        while(j <= n){
        if(isPrime(j)){
        count2++;

        }
        j++;
        }

        return count2;


    }
    
    public static int countFactors(int num){
    //Return the number of factors in the number! :O
    
    int factors = 0;
    int count = 0;

    while(count <= num){
    count++;
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