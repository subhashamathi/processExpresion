
public class processExpresion
{
	  public static void main(String[] args)
	    {
	    	processExpresion.processExpresion("127+7");
	    }
	  
	    	static void printExpression(String exp)
	    	{
	    		 String currNum="";
	    		 for(int i=0;i<exp.length();i++)
	    		 {
	    			   currNum = currNum + exp.charAt(i);
	    			   {
	    				   System.out.println(currNum);
	    			   }
	    	     }
	    	}
	    static void processExpresion(String s)
	    {
	    	for(int i=0;i<s.length();i++)
	    	{
	    		if(s.indexOf(s.charAt(i))!=-1)
	    		{
	    			System.out.println(s.charAt(i));;
	    		}
	    	}
	    }
static void printVowels(String s)
{
	 String vowels="aeiouAEIOU";
	 for(int i=0;i<s.length();i++)
	 {
		   if(vowels.indexOf(s.charAt(i))!=-1)
		   {
			   System.out.println(s.charAt(i));
		   }
     }
}
	 static void printConsonants(String s)
     {
    	 String consonants = "bcdfghjlmnpqrstvwxyzBCDFGHJLMNPQRSTVWYZ";
    	 for(int i=0;i<s.length();i++)
    	 {
    		 if(consonants.indexOf(s.charAt(i))!=-1)
    		 {
    			 System.out.println(s.charAt(i));
    		 }
    		 
    	 }
     }
  static void printDigits(String s)
    	    {
    	    	String digits="0123456789";
    	    	for(int i=0;i<s.length();i++)
    	    	{
    	    		if(digits.indexOf(s.charAt(i))!=-1)
    	    		{
    	    			System.out.println(s.charAt(i));}
    	    	    }
    	        }
    	}    
