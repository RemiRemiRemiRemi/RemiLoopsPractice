//Remi-Laurent Guy | 10/28/25 | Guess the Number
import java.util.Scanner;

class Example3 {
    public static void main(String[] args) {

double randomNum = (int)(Math.random() * 101);

Scanner scanner = new Scanner(System.in);

int attempts = 0;
int userNum = 0;

while(userNum != randomNum){
System.out.println("Guess the secret number! (0-100)");
userNum = scanner.nextInt();
if(userNum < randomNum){
    System.out.println("Too lowwww -_-");
    attempts++;
}
if(userNum > randomNum){
    System.out.println("Too high... x_x");
    attempts++;
}
}

System.out.println("WOAHHHHH you guessed the number in " + attempts + " tries :O");
if(attempts <= 7){
System.out.println("You got it within seven tries too, nice job >.o");
}
else{
System.out.println("You got it over seven tries though... do better ._.");
}
    }
}