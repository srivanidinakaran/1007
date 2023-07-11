package FIS.Activity;

import java.util.ArrayList;

public class ColorArrayList 
{
    public static void main(String[] args) 
    {
      
        ArrayList<String> colorList = new ArrayList<>();    
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");
        System.out.println("Colors in the List:");
        for (String color : colorList) 
        {
            System.out.println(color);
        }
        colorList.remove(2);
        System.out.println("\nColors  after removing the third element:");
        for (String color : colorList) 
        {
            System.out.println(color);
        }
    }
}
