import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Joe");
        names.add("Sally");
        names.add("John");
        names.add("Sue");
        names.add("Jane");
        names.add("Mike");
        names.add("James");

        System.out.println("How many names do we have? " + names.size());

        String tempName = names.get(0);
        System.out.println("The first name in the list is: " + tempName);

        names.remove(0);
        System.out.println("How many names do we have? " + names.size());
 // clears the whole array list
//        names.clear();
//        System.out.println(names.size());

//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }

//        for(String currentName: names){
//            System.out.println(currentName);
//        }

        // Another way to iterate
//        Iterator iter = names.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }

    }
}
