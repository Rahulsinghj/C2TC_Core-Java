package com.cg.operatorsandvariables;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i =  + i");
		System.out.println("j =  + j");
		System.out.println(i  j is  + (i  j));
		System.out.println("i  j is " + (i< j));
		System.out.println("i = j is " + (i <= j));
		System.out.println("i = j is " + (i &lt;= j));
		System.out.println(&quot;i == j is &quot; + (i == j));
		System.out.println(&quot;i != j is &quot; + (i != j));
		System.out.println(&quot;(i &lt; 10) &amp;&amp; (j &lt; 10) is &quot; + ((i &lt; 10)
		&amp;&amp; (j &lt; 10)));
		System.out.println(&quot;(i &lt; 10) || (j &lt; 10) is &quot; + ((i &lt; 10)
		|| (j &lt; 10)));
		}
		}

		public class TernaryOperator {