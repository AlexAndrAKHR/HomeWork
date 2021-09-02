package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        String[][] myArray = new String[4][4];

        try {
            checkArraySize(myArray);
        } catch (MyArraySizeException e) {
            System.out.println("Неверный разер");;
    }

    }

    public static void checkArraySize(String[][] myArray) throws MyArraySizeException {
        if (myArray.length != 4)
            throw new MyArraySizeException();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = "String" + j;
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println("");
        }


        }

    public static class MyArraySizeException extends Exception { }
}




