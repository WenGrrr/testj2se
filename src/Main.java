import library.*;

public class Main {
    public static void main(String[] Args){
    //task 1
        JSONPars jp = new JSONPars();
        var obj = jp.getJSON();
        var iterator = jp.arrayJSONIteration(obj);
        var people = jp.mapper(iterator);
        System.out.println(jp.getAgesGuid(people,20,30));
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());
        }

    //task 2
       // TempFactory tempFactory = new CelsiusFactory();
       // System.out.println(tempFactory.convert(Kelvin,333));
        //task 3

//        Product g = new Book("История Тестов","Тестус Тест Тестович");
//        Library library = new Library(5);
//        LibraryInterface lit = new LibraryGenerics<Product>(1, g);
//        for (int i = 0; i < lit.getSize(); i++) {
//            System.out.println(lit.getProducts()[i].getName());
//        }




    }

}
