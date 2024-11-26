package InterviewPrograams;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumber {
	public static void main(String[] args)
	{
		
		//Approach-1
		Random rand=new Random();
		int rand_int=rand.nextInt(1000);
		System.out.println(rand_int);
		
				
			
//		//Approach-2
//		System.out.println(Math.random());
//		
//		//Approach-3 Apache commons-long api
//		
//		String randNum=RandomStringUtils.randomNumeric(5);
//		System.out.println(randNum);
//		
//		String randStr=RandomStringUtils.randomAlphabetic(5);
//		System.out.println(randStr);
//		
	}

}
