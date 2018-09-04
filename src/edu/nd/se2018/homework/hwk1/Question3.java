package edu.nd.se2018.homework.hwk1;

public class Question3 {
	
	static int count, max = 0;

	public Question3(){}	
	
    public int getMirrorCount(int[] numbers){
        int max = 0; 
        for (int i = 0; i < numbers.length; ++i) { 
        	for (int j = max + 1; j < numbers.length - i + 1; ++j) { 
        			for (int k = i; k < numbers.length - j + 1; ++k){ 
				        { Boolean mir = true; 
					        for (int m = 0; mir && m < j; ++m) { 
						        mir = numbers[i + m] == numbers[k + j - m - 1]; 
						        if (mir) max = j; 
					        }
				        }
				   }
        	}
        }
        
        return max;
        
	}
    
    public int[] reversed(int[] numbers) {
    	for(int i = 0; i < numbers.length / 2; i++)
    	{
    	    int temp = numbers[i];
    	    numbers[i] = numbers[numbers.length - i - 1];
    	    numbers[numbers.length - i - 1] = temp;
    	}
    	return numbers;
    }
    
	public static void main(String[] args) {
		Question3 q = new Question3();
		int res = q.getMirrorCount(new int[] {1,2,3,9,3,2,1});
		System.out.println(res);
	}
}
