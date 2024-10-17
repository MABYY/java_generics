package org.javasql;

// When creating an instance of a generic type we can only
// use a reference type as a generic type
// Every primitive class has a wrapper class
// exmaple int: Integer - float : Float


public class GenericList<T>  { // constrain to Number: int/float/short
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add ( T item){
        items[count++] = item;
    };
    public T get(int index){
        return items[index];
    }

}
