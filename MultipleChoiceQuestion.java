import javax.swing.JOptionPane;

public class MultipleChoiceQuestion{
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;
    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query+"\n";
        question += "A. "+a+"\n";
        question += "B. "+b+"\n";
        question += "C. "+c+"\n";
        question += "D. "+d+"\n";
        question += "E. "+e+"\n";
        correctAnswer = answer;
        correctAnswer= correctAnswer.toUpperCase();
        }
    public static void main(String[] args) {    	
    	MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("In which country is the worlds highest waterfall?",
    	"Germany",
    	"Brazil",
    	"South Africa",
    	"Venezuela","Turkey",
    	"d");
    	question1.check(); 
    	question1.showResults();
    	MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("Which city would you visit to see Gaudi's fantastical architecture?",    	
    	"New York",
    	"Barcelona",
    	"Abuja",
    	"London",
    	"Cairo","b");
    	question2.check();
    	question2.showResults();
    	MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("What is the unit of currency of Poland?",    	
    	"Euro",
    	"Dollars",
    	"Pounds",
    	"Naira",
    	" Zloty",
    	"e");
    	JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    	question3.check();
    	question3.showResults();
    	MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("In which continent is the world’s longest river? ",
    	"Europe",
        "Asia",
    	"South America",
    	"Africa",
    	"Middle East",
    	"d");
    	question4.check(); 
    	question4.showResults();
    	MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("Which country’s name could be part of a Christmas dinner? ",
    	"Turkey",
    	"Australia",
    	"Canada",
    	"Iran",
    	"India",
    	 "a");
    	question5.check(); 
    	question5.showResults();
    	}
    String ask() {
    	while(true) {
        	String answer = JOptionPane.showInputDialog(question);
        	answer = answer.toUpperCase();
        	if(!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"))){
        		JOptionPane.showMessageDialog(null,"Invalid Answer");
        		
            }
        	return answer; 
        }
        }
        void check() { 
        	nQuestions++;
        	String answer = ask();
        	if(answer.equals(correctAnswer)) {
        		JOptionPane.showMessageDialog(null,"Correct!");
                nCorrect++;
        }
        else {
        	JOptionPane.showMessageDialog(null,"Incorrect. Please try Again");
        }
        }
        static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect+ " correct out of "+nQuestions+" questions");
        }


}