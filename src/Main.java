import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Yıl giriniz: ");
        year = inp.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " artık yıldır !");
        else
            System.out.println(year + " artık yıl değildir ! ");

    }
}
