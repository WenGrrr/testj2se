import factory.CelsiusFactory;
import factory.TempFactory;
import library.InfoType;
import library.Library;
import library.LibraryGenerics;
import library.Product;

import static temptypes.TempType.Kelvin;

public class Main {
    public static void main(String[] Args){
    //task 1
        //JSONPars jp = new JSONPars();
        //jp.getYoungGuid();

    //task 2
       // TempFactory tempFactory = new CelsiusFactory();
       // System.out.println(tempFactory.convert(Kelvin,333));

    //task 3
        Library library = new Library(5);
        for (int i = 0; i < library.getProducts().length; i++) {
            System.out.println(library.getProducts()[i].getName());
            System.out.println(library.getProducts()[i].getType());
        }
        Product product = new Product("Stalker", InfoType.newspapers);
        Library libraryTwo = new Library(product);
        LibraryGenerics libraryGenericsTwo = new LibraryGenerics(product);
        System.out.println(libraryTwo.getProducts()[0].getName());
        System.out.println(libraryGenericsTwo.getProducts().get(0).getType());

        LibraryGenerics libraryGenerics = new LibraryGenerics(5);
        for (int i = 0; i < libraryGenerics.getProducts().size() ; i++) {
            System.out.println(libraryGenerics.getProducts().get(i).getName());
            System.out.println(libraryGenerics.getProducts().get(i).getType());
        }


    }

}
