import java.util.*;
public class StudentGradeTracker{
 public static void main(String[] args){
  Map<String,Double> m=new TreeMap<>();
  m.put("Riya",85.0);m.put("Aman",72.5);m.put("Kritika",91.0);
  m.put("Aman",78.0);
  m.remove("Riya");
  for(Map.Entry<String,Double> e:m.entrySet()) System.out.println(e.getKey()+": "+e.getValue());
 }
}
