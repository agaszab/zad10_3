import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Produkty {

    public static void main(String[] args) {
        File file = new File("produkty.csv");
        Product[] products = new Product[5];
        Product product = new Product();
        int sumaCen = 0;
        int cenaMax = 0;
        int zliczProducenta=0;
        try {
            Scanner scan = new Scanner(file);

            for (int i = 0; i < products.length; i++) {

                String text = scan.nextLine();
                String[] temp = text.split(";");
                int cena = Integer.valueOf(temp[2]);
                products[i] = new Product(temp[0], temp[1], cena);
                if (cena > cenaMax) cenaMax = cena;
                sumaCen += cena;
                System.out.println(products[i].toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Suma wszystkich cen: " + sumaCen);
        System.out.println("Najwyższa cena: " + cenaMax);
        Product product1 = new Product();
        System.out.println();
        System.out.println("Najczęściej występujący producent: " + product.NajczestrzyProducent(products));
    }
}
