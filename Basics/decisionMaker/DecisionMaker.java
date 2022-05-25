package decisionMaker;

import java.util.Random;
enum Answers
{
	NO, YES, MAYBE, LATER, SOON, NEVER;
}

public class DecisionMaker {

	
	
	public static void main(String[] args) {
	
		Question q=new Question();
		System.out.println(q.Ask());
		System.out.println(q.Ask());
		System.out.println(q.Ask());
		System.out.println(q.Ask());
		System.out.println(q.Ask());
		System.out.println(q.Ask());
	}

}

class Question
{
	Random ran=new Random();
	
	public Answers Ask()
	{
		int prob=ran.nextInt(100);
		
		if(prob<15)
		{
			System.out.print(prob+" : ");
			return Answers.MAYBE;
		}
		else if(prob<30)
		{
			System.out.print(prob+" : ");
			return Answers.NO;
		}
		else if(prob<60)
		{
			System.out.print(prob+" : ");
			return Answers.YES;
		}
		else if(prob<75)
		{
			System.out.print(prob+" : ");
			return Answers.LATER;
		}
		else if(prob<98)
		{
			System.out.print(prob+" : ");
			return Answers.SOON;
		}
		else
		{
			System.out.print(prob+" : ");
			return Answers.NEVER;
		}
		
	}
}
