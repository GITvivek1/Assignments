import java.util.Scanner;

public class checkprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,flag=1;
        System.out.println("Enter number for check wheather it is prime or not ");
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        for(int i = 2;i<num-1;i++){
            if(num%i==0){
                flag = 0;
            }
        }
        if(flag==1){
            System.out.println("prime numbe ");
        }
        else{
             System.out.println("not prime ");
        }

    }
}
