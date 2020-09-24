import java.util.Scanner;
public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        double lumberCost = 8.0;
        double windowCost = 11.0;
        int boardAmt, windowAmt;
        double taxRate, total, grandTotal;
        boardAmt = windowAmt = 0;
        taxRate = total = grandTotal = 0;
        
        //prompt user
        System.out.printf("Enter the sales tax rate:\n");
        taxRate = userIn.nextFloat();

        System.out.printf("How many boards do you need?\n");
        boardAmt = userIn.nextInt();

        System.out.printf("How many windows do you need? \n");
        windowAmt = userIn.nextInt();

        Construction myC = new Construction(lumberCost, windowCost, taxRate);
        
        total = (myC.lumberCost(boardAmt) + myC.windowCost(windowAmt));
        grandTotal = myC.grandTotal(total);
        
        System.out.println("Total: " + total);
        System.out.printf("Grand Total: %.1f\n", grandTotal);
        
        userIn.close();
    }
}
