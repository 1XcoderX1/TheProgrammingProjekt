   public class CalculatorTest{
    public static void main (String[] args){
		   
		   Calculator calculator = new Calculator(args[0], args[1], args[2]);
		   
		   calculator.getSum();
		   calculator.getMultiply();
		   calculator.getDivide();
		   calculator.getSubtract();
		   
		  }
		}