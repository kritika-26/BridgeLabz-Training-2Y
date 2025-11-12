import java.util.*;
public class BankingSystem{
 public static void main(String[] args){
  Map<String,Double> m=new HashMap<>();
  m.put("ACC1",5000.0);m.put("ACC2",15000.0);m.put("ACC3",25000.0);m.put("ACC4",8000.0);
  deposit(m,"ACC1",2000);withdraw(m,"ACC2",5000);withdraw(m,"ACC1",10000);
  List<Map.Entry<String,Double>> list=new ArrayList<>(m.entrySet());
  list.sort((a,b)->Double.compare(b.getValue(),a.getValue()));
  for(Map.Entry<String,Double> e:list) System.out.println(e.getKey()+": "+e.getValue());
  for(int i=0;i<Math.min(3,list.size());i++) System.out.println("Top: "+list.get(i).getKey());
 }
 static void deposit(Map<String,Double> m,String acc,double amt){m.put(acc,m.getOrDefault(acc,0.0)+amt);}
 static void withdraw(Map<String,Double> m,String acc,double amt){double bal=m.getOrDefault(acc,0.0); if(bal>=amt) m.put(acc,bal-amt); else System.out.println("Insufficient for "+acc);}
}
