import java.util.*;
public class InventoryManagement{
 public static void main(String[] args){
  Map<String,Integer> stock=new HashMap<>();
  stock.put("Soap",10);stock.put("Pen",5);stock.put("Milk",2);
  purchase(stock,"Pen",3);
  purchase(stock,"Milk",2);
  purchase(stock,"Milk",1);
  restock(stock,"Milk",10);
  System.out.println("Out of stock:");
  for(Map.Entry<String,Integer> e:stock.entrySet()) if(e.getValue()<=0) System.out.println(e.getKey());
  System.out.println(query(stock,"Soap"));
  System.out.println(query(stock,"Bread"));
 }
 static void purchase(Map<String,Integer> s,String item,int q){
  int cur=s.getOrDefault(item,0)-q;
  if(cur<=0) s.put(item,0);
  else s.put(item,cur);
 }
 static void restock(Map<String,Integer> s,String item,int q){s.put(item,s.getOrDefault(item,0)+q);}
 static String query(Map<String,Integer> s,String item){return s.containsKey(item)?String.valueOf(s.get(item)):"not stocked";}
}
