package org.javasql;

public class Utils {
    public static int max(int first, int sec){
        return first > sec ? first : sec;
    }

    // Generic Methods
    public static <T extends Comparable<T>> T maxfind (T first, T sec){
        return first.compareTo(sec) > 0 ? first : sec;
    }

    public  <K,V> void print(K key, V value ){
        System.out.println("Key: " + key + "Value: " + value);
    }


    public static void printUser( User user){
        System.out.println(user);
    }

    // Wilcard: pass any Object // cast a generic type
    // You can pass both User and Instructor objects
    // since the latter extends the former
    // get
    public static void printUsers( GenericList<? extends User> user){
        User x = user.get(0);
    }

    //add
    public static void addUsers( GenericList<? super User> user){
        user.add(new Instructor(6));
    };

}
