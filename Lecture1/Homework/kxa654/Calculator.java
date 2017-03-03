public class Calculator{
	   
    private String operation;
    private double op;
    private double op1;
    private double sum;
    private double multiply;
    private double divide;
    private double subtract;
	    
    
	   public Calculator(String operation, String operand, String operand1){
	       this.operation = operation;
	       op = Double.parseDouble(operand);
           op1 = Double.parseDouble(operand1);
	    }
	    
	  
	   
	  public void  getSum() { 
	    if(operation.equals("Sum"))
	     sum = op + op1;
	     System.out.println("Sum = " + sum);
	  }
	      
	   
	   
	  public void getMultiply() {
	   if(operation.equals("Multiply"))
	     multiply = op * op1;
	     System.out.println("Multiplication = " + multiply);
	}
	      
	   
	    
	  public void getDivide() {
	    if(operation.equals("Divide"))
	     divide = op / op1;
	     System.out.println("Division = " + divide);
	  }
	  
	  
	  public void getSubtract() {
	    if(operation.equals("Subtract"))
	      subtract = op - op1;
	       System.out.println("Subtraction = " + subtract);{
	   }
      }
          
     public static void main (String[] args) {
		   
		   Calculator calculator = new Calculator(args[0], args[1], args[2]);
		   
         if(args[0].equals("Sum"))
		   calculator.getSum();
         
        else if(args[0].equals("Multiply"))
		   calculator.getMultiply();
		   
        else if(args[0].equals("Divide"))
         calculator.getDivide();
         
         else
		   calculator.getSubtract();
		   
		  }
		
	    
 }	 

	
	