package numalphabet;

import java.util.Scanner;

public class NumAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[]alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        while(true){
            System.out.print("Enter number 1-26 for show,"+"\n"
                        +"number 0 for Exit : ");
            int num = sc.nextInt();
            
            if(num==0){
                break;
            }
            else if(num>26||num<1){
                System.out.println("Please enter number again."+"\n");
                continue;
            }
            else if(num<=26&&num>=1){
                for(int i = 0;i<num;i++){
                    System.out.print(alphabet[i]+" ");
                }
                System.out.println("\n");
            }
        }
        System.out.println("End Program");
    }
}
