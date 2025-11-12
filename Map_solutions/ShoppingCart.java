import java.util.*;
public class ShoppingCart{
 public static void main(String[] args){
  Map<String,Double> cart=new LinkedHashMap<>();
  cart.put("Shoes",2500.0);cart.put("Bag",1800.0);cart.put("Watch",4000.0);
  double total=0;
  for(Map.Entry<String,Double> e:cart.entrySet()) total+=e.getValue();
  if(total>5000) total*=0.9;
  cart.remove("Bag");
  for(Map.Entry<String,Double> e:cart.entrySet()) System.out.println(e.getKey()+": "+e.getValue());
  System.out.println("Total: "+total);
 }
}
