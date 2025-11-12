import java.util.*;
public class StudentAttendanceTracker{
 public static void main(String[] args){
  List<String> students=Arrays.asList("A","B","C","D","E");
  Map<String,Integer> m=new HashMap<>();
  for(String s:students) m.put(s,0);
  Random r=new Random(1);
  for(int day=0;day<15;day++){
   for(String s:students){
    if(r.nextBoolean()) m.put(s,m.get(s)+1);
   }
  }
  for(Map.Entry<String,Integer> e:m.entrySet()) if(e.getValue()<10) System.out.println(e.getKey()+" under-attending: "+e.getValue());
 }
}
