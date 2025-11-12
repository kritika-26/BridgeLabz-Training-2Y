import java.util.*;
public class CountryCapitalLookup{
 public static void main(String[] args){
  Map<String,String> m=new TreeMap<>();
  m.put("India","New Delhi");m.put("Japan","Tokyo");m.put("France","Paris");m.put("Brazil","Brasilia");
  m.put("Canada","Ottawa");m.put("Australia","Canberra");m.put("Egypt","Cairo");m.put("Kenya","Nairobi");
  System.out.println(m.getOrDefault("India","Unknown country"));
  for(Map.Entry<String,String> e:m.entrySet()) System.out.println(e.getKey()+": "+e.getValue());
 }
}
