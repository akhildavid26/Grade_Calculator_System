
public class GradeCalculator {
	
	public double[] scores_arr;
	public char[] grades_arr;

	public GradeCalculator(double[] scores_arr2) {
		/* Initialization */
		this.scores_arr = scores_arr2;
		grades_arr=new char[scores_arr.length];

	}
	public void setGrades() {
		/*setting up the grades value*/
		for (int i=0;i<scores_arr.length; i++) {
			
			if(scores_arr[i] <=100 && scores_arr[i]>90) {
				
				grades_arr[i]='A';
				
			}
			else if(scores_arr[i] <=90 && scores_arr[i]>80) {
				
				grades_arr[i]='B';

				
			}
			else if(scores_arr[i] <=80 && scores_arr[i]>70) {
				
				grades_arr[i]='C';

				
			}
			else if(scores_arr[i] <=70 && scores_arr[i]>60) {
				
				grades_arr[i]='D';

			}
			else {
				
				grades_arr[i]='E';	
				
			}	
		}
	}

	public void displayGrade(){
		
		for(int i=0;i<grades_arr.length;i++) {
			
			System.out.printf("Student %d grade is "+"%c\n",i+1,grades_arr[i]);
		}
	}
	
	public char getGrade(int index) {
		// TODO Auto-generated method stub
	
		return grades_arr[index];

	}
	public double calAverage(double[] scores_arr2) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<scores_arr2.length;i++) {
			
			sum=sum+scores_arr2[i];
		}
		double avg= (sum/scores_arr2.length);
		return avg;
	
		
	}
	public void displayScores() {
		// TODO Auto-generated method stub
		for (int i=0;i<scores_arr.length;i++) {
			System.out.printf("Student %d scored "+"%f"+" marks\n",i+1,scores_arr[i]);
	
		}
		
	}
	
}
