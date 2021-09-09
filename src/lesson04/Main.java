package lesson04;


import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    /**1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     Посчитать, сколько раз встречается каждое слово */

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("YELLOW");  //встречается один раз
        set.add("RED");     //встречается один раз
        set.add("BLACK");   //встречается один раз
        set.add("GREEN");   //встречается два раза
        set.add("BLUE");    //встречается один раз
        set.add("WHITE");   //встречается один раз
        set.add("ORANGE");  //встречается два раза
        set.add("PINK");    //встречается один раз
        set.add("BROWN");   //встречается два раза
        set.add("PURPLE");  //встречается один раз
        set.add("GREEN");   //встречается два раза, при выводе не отображается, т.к. повторный элемент массива
        set.add("BROWN");   //встречается два раза, при выводе не отображается, т.к. повторный элемент массива
        set.add("ORANGE");  //встречается два раза, при выводе не отображается, т.к. повторный элемент массива

        String[] myArray = new String[set.size()];
        set.toArray(myArray);

        for(String element: set)
            System.out.println(element);
    }

}
