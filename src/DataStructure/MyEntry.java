package DataStructure;

import java.io.Serializable;
import java.security.Key;

public class MyEntry<K, V> implements Serializable {
    private final K key;
    private V value;

    public MyEntry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public String toString(){
        return "Key = " + this.key + ", Value = " + this.value + " ";
    }



}
