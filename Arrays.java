import java.util.Scanner;
public class Arrays{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int arrays[] = new int[5];
            for(int i = 0; i < 5; i++){
                System.out.println("Enter the number "+(i+1)+" is: ");
                arrays[i] = sc.nextInt();
                System.out.print(" "+arrays[i]);
            }
        }
    }
}
