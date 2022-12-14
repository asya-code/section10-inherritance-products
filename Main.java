import models.Discountable;
import models.Pants;
import models.Product;
import models.Shirt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   1. Loads the data from products.txt
     */
    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scan = new Scanner(fis);

        Product[] products = new Product[18];

        for (int i = 0; scan.hasNextLine(); i++) {
            switch (scan.next()) {
                case "PANTS":
                    products[i] = new Pants(scan.nextInt(),
                            scan.nextDouble(), scan.next(), scan.next());
                case "SHIRT":
                    products[i] = new Shirt(Shirt.Size.valueOf(scan.next()),
                            scan.nextDouble(), scan.next(), scan.next());
            }
        }
        scan.close();
        return products;
    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//        Product[] products = new Product[] {
//                new Pants(32, 24.59, "Blue", "JAVA KLEIN"),
//                new Shirt(Shirt.Size.MEDIUM, 24.29, "Black", "CHANEL"),
//                new Pants(34, 24.53, "Red", "JANGLER"),
//                new Shirt(Shirt.Size.SMALL, 24.89, "Orange", "GEORGE"),
//                new Pants(30, 24.54, "Grey", "FENDI"),
//                new Shirt(Shirt.Size.LARGE, 24.49, "Blue", "ECKO"),
//                new Pants(30, 24.51, "Red", "VERSACE"),
//                new Shirt(Shirt.Size.SMALL, 24.49, "Beige", "ZARA"),
//                new Pants(29, 24.53, "Dark", "JANGLER"),
//                new Shirt(Shirt.Size.SMALL, 24.79, "Red", "NIKE"),
//                new Pants(26, 24.58, "Indigo", "BELSTAFF"),
//                new Shirt(Shirt.Size.LARGE, 24.54, "Blue", "ADIDAS"),
//                new Pants(34, 24.50, "Red", "JANGLER"),
//        };
//        printArray(products);
//        System.out.println("\n");
//        Arrays.sort(products);
//        printArray(products);

//        Product[] products = new Product[] {
//                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
//                new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
//                new Pants(34, 104.99, "Red", "JANGLER"),
//                new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
//                new Pants(30, 119.99, "Grey", "FENDI"),
//                new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
//                new Pants(30, 129.99, "Red", "VERSACE"),
//                new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
//                new Pants(29, 99.99, "Dark", "JANGLER"),
//                new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
//                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
//                new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
//                new Pants(34, 104.99, "Red", "JANGLER"),
//        };
//        printArray(products);
//        System.out.println("\n");
//        Arrays.sort(products);
//        printArray(products);


    /**
     * another part is commented out for the next exercise
     */
//    public static void main(String[] args) {
//
//        Product[] products = new Product[] {
//                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
//                new Pants(34, 104.99, "Red", "JANGLER"),
//                new Pants(30, 119.99, "Grey", "FENDI"),
//                new Pants(30, 129.99, "Red", "VERSACE"),
//                new Pants(29, 99.99, "Dark", "JANGLER"),
//                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
//                new Pants(34, 104.99, "Red", "JANGLER"),
//        };
//
//        printArray(products);
//
//    }
//
//    public static void printArray(Product[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }


/**
 * first part is commented out for next exercise
 */
//    public static void main(String[] args) {
//        /**
//         * since now Shirt and Pants are subclasses of the same parent,
//         * we can collect them in the same array - this is an advantage of polymorphism
//         */
////        Product[] products = new Product[] {
////            new Shirt("SMALL", 5.99, "blue", "Java Vuitton"),
////            new Pants(32, 24.99, "blue", "Java Klein")
////        };
//        /**
//         * test creation of subclass products using parent class constructor
//         */
//        Shirt shirt = new Shirt(Shirt.Size.SMALL, 5.99, "blue", "Java Vuitton");
//        Pants pants = new Pants(32, 24.99, "blue", "Java Klein");
//        Shirt shirt2 = new Shirt(shirt);
//        Pants pants2 = new Pants(pants);
////        Discountable pants3 = new Pants(pants);
//        Pants pants4 = new Pants(34, 104.99, "red", "Jangler");
////        System.out.println(pants.compareTo(pants2));
//
//        /**
//         * to compare pants3 to pants we need to change the pants3 object,
//         * since now it is type Discountable, not type Pants.
//         */
//        Pants pants3 = new Pants(pants);
//        System.out.println(pants.compareTo(pants3));
//
////        System.out.println(shirt.equals(shirt2));
////        System.out.println(shirt.hashCode());
////        System.out.println(shirt2.hashCode());
////
////        pants.equals(pants2);
//
////        shirt.fold();
////        pants.fold();
//
////        System.out.println(shirt);
////        System.out.println(pants2);
////        pants2.discount();
////        System.out.println(pants2);
////        System.out.println(pants3);
//    }
//
//
