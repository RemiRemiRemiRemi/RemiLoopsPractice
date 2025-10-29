//Remi-Laurent Guy | 10/29/25 | Hailstone
import java.util.*;
public class Hailstone {
    public static void main(String[] args) {
        

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number from 1-200!!");

int userNum = scanner.nextInt();


while(userNum != 1){

if(userNum % 2 == 0){

userNum /= 2;

}
else{

userNum = (userNum * 3) + 1;

}

System.out.println(userNum);


}

    }
}
