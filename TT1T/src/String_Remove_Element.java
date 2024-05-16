package arrayList_String_Remove;

import java.util.ArrayList;

public class String_Remove_Element {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> str = new ArrayList<String>();
        str.add("Sun");
        str.add("Moon");
        str.add("Earth");
        str.add("Galaxy");

        System.out.println("Before Elements Remove :" +str);
        //One Method we can remove all elements in collections
        str.removeAll(str);
        System.out.println("After Elements Removed By using removeAll Method :" +str);
        //Another Method we can remove all elements in collections
        str.clear();
        System.out.println("After Elements Removed By using Clear Method :" +str);
        /*
         * boolean Answer = str.isEmpty();
         * System.out.println("Verify the Element is Removed :" + Answer + " The element is Removed");
         */
    }
}