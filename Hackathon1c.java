import java.util.Scanner;
public class  Hackathon1c {
    
    int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter morning water usage in liters: ");
        int morningUsage = scanner.nextInt();
        System.out.print("Enter evening water usage in liters: ");
        int eveningUsage = scanner.nextInt();
        
        Hackathon1c houseWater = new  Hackathon1c();
        int totalUsage = houseWater.calculateTotal(morningUsage, eveningUsage);
        
        System.out.println("Total water usage for the day: " + totalUsage + " liters");
      scanner.close();
    } 
}