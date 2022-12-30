import java.util.Scanner;
import java.util.SortedMap;

public class flight {
    public static void main(String[] args) {
        double distance;
        int age;
        int tripType;
        double total = 0;
        double sale = 0;
        double lastTotal;
        double tripSale;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km : ");
        distance = input.nextInt();

        System.out.print("Please select the type of trip (1 => One Direction, 2 => Round Trip): ");
        tripType = input.nextInt();

        System.out.print("Please enter your age : ");
        age = input.nextInt();

        //Önce hangi durumlarda hata olduğunu yazıyoruz.
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("You entered wrong data!");
            return;

        } else {
            total = distance * 0.10;
        }

        //Sonra yaşa göre indirim tanımlaması yapıyoruz.
        if (age < 12) {
            sale = total * 0.50;

        } else if (age >= 12 && age <= 24) {
            sale = total * 0.10;

        } else if (age > 65) {
            sale = total * 0.30;
        }

//Son olarak yolculuk tipini de belirleyip, son indirimi uyguluyoruz.
        if (tripType == 2) {
            tripSale = total * 0.20;
            lastTotal = (total - sale) - tripSale ;
            System.out.println("Total Price = " + lastTotal + "TL");

        } else {
            System.out.println("Total Price = " + (total - sale) + "Tl");
        }





    }
}
