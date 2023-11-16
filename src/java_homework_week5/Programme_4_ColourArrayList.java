package java_homework_week5;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours(string) and printout
 * the collection using for each loop
 */
public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Orange");
        colorList.add("Purple");
        colorList.add("Cyan");

        for(String colourList : colorList){
            System.out.println(colourList + " ");
        }
    }
}
