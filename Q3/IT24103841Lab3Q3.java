import java.util.Scanner;

public class IT24103841Lab3Q3 {
public static void main(String[] args)
Scanner input=new Scanner(System.in);
System.out.print("Enter the amount in rupees:");
int amount=input.nextInt();
int[] denominations = {5000,1000,500,200,100,50,20,10,5,2,1};
int[] notes=new int[denominations.length];
for (int i=0; i<denominations.length;i++) {
notes[i]=amount/denominations[i];
amount=amount % denominations[i];
      }
System.out.println("The breakdown of the amount is:");
        for (int i=0; i < denominations.length; i++) {
            System.out.println(denominations[i]+" Notes/Coin–"+notes[i]);
        }
    }
}
