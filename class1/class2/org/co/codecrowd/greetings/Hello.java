

package org.co.codecrowd.greetings; 

import org.co.codecrowd.exams.Exams; 

public class Hello {
    
    public static void main(String []args){
	Exams exam = new Exams();
	System.out.println("Hello World!" + "exam is on :" );
	exam.printExamDate();
	

    }
}