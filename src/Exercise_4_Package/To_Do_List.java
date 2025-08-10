package Exercise_4_Package;

import java.util.ArrayList;

public class To_Do_List {
    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();

        toDoList.add("To rewatch Skillo lessons.");
        toDoList.add("To do Skillo homeworks.");
        toDoList.add("To push all new resolutions to github.");
        toDoList.add("To send the new homework to Vidko.");

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
        System.out.println("---------------------------");
        System.out.println();

        toDoList.remove("To rewatch Skillo lessons.");

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
        System.out.println("---------------------------");
        System.out.println();
    }
}
