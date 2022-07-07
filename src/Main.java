import factory.CelsiusFactory;
import factory.TempFactory;
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
        for (int i = 0; i < library.getProduct().length; i++) {
            System.out.println(library.getProduct()[i].getName());
            System.out.println(library.getProduct()[i].getType());
        }

        LibraryGenerics libraryGenerics = new LibraryGenerics(5);
        for (int i = 0; i < libraryGenerics.getProducts().size() ; i++) {
            System.out.println(libraryGenerics.getProducts().get(i).getName());
            System.out.println(libraryGenerics.getProducts().get(i).getType());
        }


    }

}
