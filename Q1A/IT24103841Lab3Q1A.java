import java.util.Scanner;
public class IT24103901Lab3Q1A 
{
       public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the price of 1Kg if rice: ");
double pricePerkg = scanner.nextDouble();
System.out.print("Enter the number of kilograms you want to buy: ");
double kilograms = scanner.nextDouble();
double totalAmount = pricePerkg * kilograms;
System.out.println("The total amount is:"+totalAmount);
scanner.close();
            }
}

            