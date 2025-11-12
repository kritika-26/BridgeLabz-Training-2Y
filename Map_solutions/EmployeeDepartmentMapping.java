import java.util.*;
public class EmployeeDepartmentMapping{
 public static void main(String[] args){
  Map<Integer,String> m=new HashMap<>();
  m.put(1,"HR");m.put(2,"IT");m.put(3,"IT");m.put(4,"Sales");m.put(5,"HR");
  m.put(3,"Sales");
  String dept="IT";
  List<Integer> res=new ArrayList<>();
  for(Map.Entry<Integer,String> e:m.entrySet()) if(e.getValue().equals(dept)) res.add(e.getKey());
  Map<String,Integer> counts=new HashMap<>();
  for(String v:m.values()) counts.put(v,counts.getOrDefault(v,0)+1);
  System.out.println(res);
  System.out.println(counts);
 }
}
