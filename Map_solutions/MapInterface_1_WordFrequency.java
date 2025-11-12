import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
public class MapInterface_1_WordFrequency{
 public static void main(String[] args) throws Exception{
  String s="Hello world, hello Java!";
  String[] words=s.toLowerCase().replaceAll("[^a-z0-9 ]"," ").split("\\s+");
  Map<String,Integer> m=new HashMap<>();
  for(String w:words) if(w.length()>0) m.put(w,m.getOrDefault(w,0)+1);
  System.out.println(m);
 }
}
