package collection_task;

public class Main {
    public static void main(String[] args) {

        CharList charList = new CharList("acb123123");
        System.out.printf("CharList is:" + charList.toString());
        System.out.println("Index of '1' char is " + charList.indexOf('1'));
        System.out.println("Length of CharList is: " + charList.length());
        System.out.println("Char on the second place is " + charList.charAt(2));
        System.out.println("Substring(from 3 to 5) of CharList is: " + charList.subString(3,5));
        System.out.println("CharList without duplicate symbols is:" + charList.removeDuplicates());
        System.out.println("CharList without removed symbols('1', '2') is:" + charList.removeAll('1').removeAll('2'));
        System.out.println("CharList without removed first symbol('1') is:" + charList.removeFirst('1'));
        System.out.println("CharList contains symbol 'q':" + charList.contains('q'));
        System.out.println("CharList contains symbol 'a':" + charList.contains('a'));
        System.out.println("Sorted CharList: " + charList.sortList());
        System.out.println("Reversed CharList:" + charList.reverseList());
        System.out.println("Mixed CharList: " + charList.mixedList());
        System.out.println("Cleared CharList" + charList.clearList());
        System.out.println("CharList is empty: " + charList.isEmpty());


   }
}

