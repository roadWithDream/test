//: holding/E17_GerbilMap.java
/****************** Exercise 17 ******************
 * Move the Gerbil class from Exercise 1
 * into a Map, and associate each Gerbil (the value) 
 * with it's name as a String (the key).
 * Use an Iterator for the keySet() to move
 * through the Map, look up the Gerbil for each key,
 * print out the key, and tell the Gerbil to hop().
 ***********************************************/ 
package holding;
import java.util.*;
import java.util.Map.Entry;

public class E17_GerbilMap {
  @SuppressWarnings("unchecked")
public static void main(String args[]) {
    Map<String,Gerbil> map = new HashMap<String,Gerbil>();
    map.put("Fuzzy", new Gerbil(1));
    map.put("Spot", new Gerbil(2));
    map.put("Joe", new Gerbil(3));
    map.put("Ted", new Gerbil(4));
    map.put("Heather", new Gerbil(5));
    Iterator<Entry<String, Gerbil>> it = 
      map.entrySet().iterator();
    while(it.hasNext()) {
      Entry<String, Gerbil> entry = it.next();
      System.out.print(entry.getKey() + ": ");
      entry.getValue().hop();
    }
    System.out.println("*******************************************************");
    /**
     * 方式一 这是最常见的并且在大多数情况下也是最可取的遍历方式。在键值都需要时使用。
     */
    for(Map.Entry<String, Gerbil> entry : map.entrySet()){
    	System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue().toString());
        entry.getValue().hop();
    }
    
    System.out.println("*******************************************************");   
    /**
     * 方法二 在for-each循环中遍历keys或values。
     * 如果只需要map中的键或者值，你可以通过keySet或values来实现遍历，而不是用entrySet。
     */
    //遍历map中的键 
    for (String key : map.keySet()) { 
    	System.out.println("Key = " + key); 
    } 
    //遍历map中的值 
    for (Gerbil value : map.values()) {
    	System.out.println("Value = " + value); 
    }
    
    System.out.println("*******************************************************");  
    /**
     *方法三使用Iterator遍历
     */
    //使用泛型：

    Iterator<Entry<String, Gerbil>> entries = map.entrySet().iterator(); 
    while (entries.hasNext()) { 
      Entry<String, Gerbil> entry = entries.next(); 
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
    }
    //不使用泛型：
    Map map1 = new HashMap(); 
    Iterator entries1 = map1.entrySet().iterator(); 
    while (entries1.hasNext()) { 
      Map.Entry entry = (Map.Entry) entries1.next(); 
      Integer key = (Integer)entry.getKey(); 
      Integer value = (Integer)entry.getValue(); 
      System.out.println("Key = " + key + ", Value = " + value); 
    }
    System.out.println("*******************************************************");  
  }
} /* Output:
Ted: gerbil 4 is hopping
Heather: gerbil 5 is hopping
Spot: gerbil 2 is hopping
Joe: gerbil 3 is hopping
Fuzzy: gerbil 1 is hopping
*///:~
