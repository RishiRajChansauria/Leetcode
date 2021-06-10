package com.rishi.medium;

public class rough {
	
	
	public String Expression(int number) {
		
		char [] symbols= {'*','/','+','-'};
		StringBuilder sb = new StringBuilder();
		int j=0;
		for(int i=number;i>0;i--) {
		    sb.append(i);
		    if(j>3)
		     j=0;
		    if(i==1)
		    	break;
		    sb.append(symbols[j]);
		     j++;
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	 public int clumsy(int N)  {
	    
		 String expression = Expression(N);
		 int result=0;
		 int j=0;
		 int count=0;
		 while (j<4) {
			 for(int i=0;i<expression.length();i++) {
				 if(count==0) {
					 if(expression.charAt(i)=='*') {
						 int a = Integer.parseInt(String.valueOf(expression.charAt(i-1)));
						 int b = Integer.parseInt(String.valueOf(expression.charAt(i+1)));
						 result = result+ (a*b);
						 continue;
					 }
					 continue;
				 }
				 if(count==1) {
					 if(expression.charAt(i)=='/') {
						 int a = Integer.parseInt(String.valueOf(expression.charAt(i-1)));
						 int b = Integer.parseInt(String.valueOf(expression.charAt(i+1)));
						 result = result+ (a/b);
						 continue;
					 }
					 continue;
				 }
				 if(count==2) {
					 if(expression.charAt(i)=='+') {
						 int a = Integer.parseInt(String.valueOf(expression.charAt(i-1)));
						 int b = Integer.parseInt(String.valueOf(expression.charAt(i+1)));
						 result = result+ (a+b);
						 continue;
					 }
					 continue;
				 }
				 if(count==3) {
					 if(expression.charAt(i)=='-') {
						 int a = Integer.parseInt(String.valueOf(expression.charAt(i-1)));
						 int b = Integer.parseInt(String.valueOf(expression.charAt(i+1)));
						 result = result+ (a-b);
						 continue;
					 }
					 continue;
				 }
			 }
			 count++;
			 j++;
		 }
		
		 
		 return result;
	 }
	
	
	public static void main(String[] args) {
		rough r = new rough();
		int clumsy = r.clumsy(4);
		System.out.println(clumsy);
		
	}


}


/*public int clumsy(int N)  {
    
	 String expression = Expression(N);
	 int round =0;
	 ScriptEngineManager mgr = new ScriptEngineManager();
	 ScriptEngine engine = mgr.getEngineByName("JavaScript");
	 try {
		 double ans= (double) engine.eval(expression);
		 round = (int) Math.round(ans);
	 }catch(ClassCastException e) {
		 int ans;
		try {
			ans = (int) engine.eval(expression);
			round = (int) Math.round(ans);
		} catch (ScriptException e1) {
			e1.printStackTrace();
		}
	 }
	 catch (ScriptException e) {
		 e.printStackTrace();
	 }
	 
	 return round;
}
*/