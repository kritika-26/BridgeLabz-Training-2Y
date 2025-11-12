import java.util.*;
public class WordFrequencySentence{
 public static void main(String[] args){
  String s="Java is fun and Java is powerful";
  String[] w=s.toLowerCase().replaceAll("[^a-z0-9 ]"," ").split("\\s+");
  Map<String,Integer> m=new HashMap<>();
  for(String x:w) if(x.length()>0) m.put(x,m.getOrDefault(x,0)+1);
  for(Map.Entry<String,Integer> e:m.entrySet()) System.out.println(e.getKey()+": "+e.getValue());
 }
}
