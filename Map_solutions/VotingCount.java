import java.util.*;
public class VotingCount{
 public static void main(String[] args){
  String[] votes={"Alice","Bob","Charlie","Alice","Bob","Alice","Charlie","Bob","Alice","Charlie"};
  Map<String,Integer> m=new HashMap<>();
  for(String v:votes) m.put(v,m.getOrDefault(v,0)+1);
  String winner=null;int max=0;
  for(Map.Entry<String,Integer> e:m.entrySet()){if(e.getValue()>max){max=e.getValue();winner=e.getKey();}}
  for(Map.Entry<String,Integer> e:m.entrySet()) System.out.println(e.getKey()+": "+e.getValue());
  System.out.println("Winner: "+winner);
 }
}
