package collection_task;

import java.util.*;

public class CharList {
    ArrayList<Character> myList;

    private CharList(ArrayList<Character> list) {
        myList = list;
    }

    public CharList() {
        myList = new ArrayList<Character>();
    }

    public CharList(String inputText) {
        char[] chars = inputText.toCharArray();
        myList = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            myList.add(chars[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(myList.size());
        for (Character ch : myList) {
            builder.append(ch);
        }
        return builder.toString();
    }

    public int length() {
        return myList.size();
    }

    public char charAt(int index) {
        return myList.get(index);

    }

    public int indexOf(char c) {
        return myList.indexOf(c);

    }

    CharList subString(int start, int end) {
        return new CharList(new ArrayList<Character>(myList.subList(start, end)));

    }

    CharList removeDuplicates() {
        HashSet<Character> a = new HashSet<Character>();
        a.addAll(myList);
        return new CharList(new ArrayList(a));
    }

    CharList removeFirst(Character c) {
        myList.remove(c);
        return new CharList(myList);
    }

    CharList removeAll(Character c) {
        myList.removeAll(Collections.singleton(c));
        return new CharList(myList);
    }

    boolean isEmpty() {
        return myList.isEmpty();
    }

    boolean contains(Character c) {
        return myList.contains(c);
    }

    CharList clearList() {
        myList.clear();
        return new CharList(myList);
    }

    CharList sortList() {
        Collections.sort(myList);
        return new CharList(myList);
    }

    CharList reverseList() {
        Collections.reverse(myList);
        return new CharList(myList);
    }

    CharList mixedList() {
        Collections.shuffle(myList);
        return new CharList(myList);
    }


}