import java.util.Scanner;
public class Hackathon1b {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter water consuption in liters");
    double consume = sc.nextDouble();
    if(consume <= 500.00){
        System.out.println("Water bill is Rs.100");
    } else if (consume>500.00){
        System.out.println("Water bill is Rs.200");
    }    
          sc.close();
    }
}