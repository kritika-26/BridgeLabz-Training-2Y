import java.util.*;
public class LibraryCatalog{
 public static void main(String[] args){
  Map<String,String> m=new TreeMap<>();
  m.put("978-111","Java Basics");m.put("978-222","Data Structures");m.put("978-333","Algorithms");
  System.out.println(m.getOrDefault("978-222","Book not found"));
  m.remove("978-111");
  for(Map.Entry<String,String> e:m.entrySet()) System.out.println(e.getKey()+" -> "+e.getValue());
  System.out.println(searchByTitle(m,"Algorithms"));
 }
 static String searchByTitle(Map<String,String> m,String title){
  for(Map.Entry<String,String> e:m.entrySet()) if(e.getValue().equalsIgnoreCase(title)) return e.getKey();
  return "Not found";
 }
}
