import java.util.Arrays;

public class ArraysExercises {

    public static String[] addPerson(String[] oldArray, String newString) {
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = newString;
        return newArray;
    }

    public static void main(String[] args) {

        String[] persons = {"Mark", "2Pac", "Biggie Smalls"};
        String[] pCopy = addPerson(persons, "Jimmy");
        System.out.println(Arrays.toString(pCopy));

        String[] pCopy2 = addPerson(pCopy, "Todd Margaret");
        System.out.println(Arrays.toString(pCopy2));


//Arrays.toString needed to look inside "peak" in the array.
//                int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//Print each person in the Array, the index of method.
//        System.out.println(persons[0]);
//        System.out.println(persons[1]);
//        System.out.println(persons[2]);

//for Enhanced loop through Array objects persons.
//        for (String p : persons) {
//            System.out.println(p);
//        }

//Creates a copy of persons array named pCopy.
//        String[] pCopy = Arrays.copyOf(persons, persons.length);
//        System.out.println(Arrays.toString(pCopy));

    }
}
