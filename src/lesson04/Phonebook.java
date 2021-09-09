package lesson04;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    String surname;
    String phone;

    public Phonebook(String surname, String phone) {
        this.surname = surname;
        this.phone = phone;
    }


    public static void main(String[] args) {




        ArrayList<Phonebook> phonebooks = new ArrayList<>();
        phonebooks .add(new Phonebook("Кузнецов","89295555555"));
        phonebooks .add(new Phonebook("Афанасьева", "89151234567"));
        phonebooks .add(new Phonebook("Соколова", "89034567898"));
        phonebooks .add(new Phonebook("Соколова", "89158972345"));




        for(Phonebook human: phonebooks)
            System.out.println(human.surname + " " + human.phone);


        System.out.println();


        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Кузнецов","89295555555");
        phoneBook.put("Афанасьева", "89151234567");
        phoneBook.put("Соколова", "89034567898");
        phoneBook.put("Соколова", "89158972345");

        phoneBook.get("Кузнецов");
        phoneBook.get("Афанасьева");
        phoneBook.get("Соколова");
        phoneBook.get("Соколова");

        for(String element: phoneBook.values())
            System.out.println(element);

        System.out.println();









    }


}

