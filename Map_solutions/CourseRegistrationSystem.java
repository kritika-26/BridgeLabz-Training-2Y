import java.util.*;
public class CourseRegistrationSystem{
 public static void main(String[] args){
  Map<String,Integer> m=new HashMap<>();
  m.put("CS101",45);m.put("CS102",3);m.put("MA101",52);m.put("HS101",4);m.put("CS103",60);
  m.put("CS102",m.get("CS102")+2);
  m.put("HS101",Math.max(0,m.get("HS101")-1));
  System.out.println("Near full:");
  for(Map.Entry<String,Integer> e:m.entrySet()) if(e.getValue()>=50) System.out.println(e.getKey());
  System.out.println("Under subscribed:");
  for(Map.Entry<String,Integer> e:m.entrySet()) if(e.getValue()<5) System.out.println(e.getKey());
 }
}
