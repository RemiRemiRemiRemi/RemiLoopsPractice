//Remi-Laurent Guy | 10/29/25 | Hailstone Part 2
import java.util.*;
public class Hailstone2 {
    public static void main(String[] args) {
        
for(int count = 200; count != 0; count--){
int num = count;
int numOfTimes = 0;
while(num != 1){
if(num % 2 == 0){

num /= 2;

}
else{

num = (num * 3) + 1;

}

numOfTimes++;
}
System.out.println(count + " iterates " + numOfTimes + " times");

}

    }
}
