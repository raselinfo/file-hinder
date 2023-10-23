import tools.AdvanceCalculator;
import   tools.NormalCalculator;
public class Main{
    public static void main(String[] args){
        AdvanceCalculator calculator=new AdvanceCalculator();
        int result=calculator.add(10,20);
        NormalCalculator  normal_calculator=new NormalCalculator();
        int result2=normal_calculator.add(10,20);
        System.out.println(result2);
    }
}