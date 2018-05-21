import java .util.*;
public class GradeBookTest {

		 public static void main(String[] args) {

		        int students=0;
		        Scanner input=new Scanner(System.in);
		        boolean isNumber;
		       
		        do {
		        	System.out.println("How many students's scores do you want to enter?");
					if (input.hasNextInt()) {
						
						students = input.nextInt();
						isNumber=true;	
						
					} 
					else {
						
						System.out.println("Please enter an integer value");
						isNumber=false;
						input.next();
						
					}
				} while (!isNumber);
		        
		        
				double scores_arr[]=new double[students];
		        for(int i=0;i<students;i++) {
		        	System.out.println("Enter the marks of student "+(i+1)+" (Range : 0-100)");
		        	
		        	do {
						if (input.hasNextDouble() || input.hasNextInt()) {
							
							do {
						
								double temp = input.nextDouble();
								if (temp <= 100) {
									
									scores_arr[i] = temp;
									isNumber=true;
								} 
								else {
									
									System.out.println("Enter score between 0 and 100");
									isNumber=false;
									
								} 
							} while (!isNumber);
							
						}
						else {
							System.out.println("Invalid input. Please enter a number value of score for student "+(i+1));
							isNumber=false;
							input.next();
						}
					} while (!isNumber);
		        }
		        
		        boolean c=true;
		     
		        while(c) {
		        	
		        	System.out.println("\nWhat do you want to do next?");
			        System.out.println("Choose from the following options");
			        System.out.println("1)Choose 1 to Display Students Scores");
			        System.out.println("2)Choose 2 to Display Students Grades");
			        System.out.println("3)Choose 3 to Display Average");
			        System.out.println("4)Choose 4 to Exit\n");
			        
			        int choice = 0;
					do {
						if (input.hasNextInt()) {
							
							choice = input.nextInt();
							isNumber=true;
						}
						else {
							
							System.out.println("Please choose and interger value from the above options");
							isNumber=false;
							input.next();
							
						}
					} while (!isNumber);
					
					GradeCalculator myGradeBook = new GradeCalculator(scores_arr);
			        
			        
			        switch (choice) {
					case 1:
						
						myGradeBook.displayScores();
							
						break;
					case 2:
						
						myGradeBook.setGrades();
				        myGradeBook.displayGrade();
						
						break;
					case 3:
						
						double avg=myGradeBook.calAverage(scores_arr);
				        System.out.println("Average of class is "+avg);
				        
				        break;
					case 4:
						
						System.exit(0);
						break;
						
					default:
						
						System.out.println("Wrong choice input. Please choose from the folllowing options");
						break;
					}
			   
		        }
		        
		
		    }
		}

	


