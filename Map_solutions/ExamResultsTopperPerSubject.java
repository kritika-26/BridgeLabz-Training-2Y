import java.util.*;
public class ExamResultsTopperPerSubject{
 public static void main(String[] args){
  Map<String,Map<String,Integer>> m=new HashMap<>();
  m.put("Math",new HashMap<>());m.put("Physics",new HashMap<>());
  m.get("Math").put("A",95);m.get("Math").put("B",88);m.get("Math").put("C",76);
  m.get("Physics").put("A",85);m.get("Physics").put("B",92);m.get("Physics").put("C",91);
  for(Map.Entry<String,Map<String,Integer>> e:m.entrySet()){
   String subject=e.getKey();
   int max=-1;String top=null;int sum=0;int cnt=0;boolean above90=false;
   for(Map.Entry<String,Integer> s:e.getValue().entrySet()){
    int val=s.getValue();sum+=val;cnt++; if(val>max){max=val;top=s.getKey();} if(val>90) above90=true;
   }
   System.out.println(subject+" topper: "+top+" avg: "+(sum/cnt)+" any>90: "+above90);
  }
 }
}
