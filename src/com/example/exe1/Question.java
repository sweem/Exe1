package com.example.exe1;

public class Question {
	String que;
	String ans1;
	String ans2;
	String ans3;
	String corrAns;
	
	public Question(String question, String answer1, String answer2, String answer3, String correctAnswer) {
		que = question;
		ans1  = answer1;
		ans2 = answer2;
		ans3 = answer3;
		corrAns = correctAnswer;
	}
	
	public String getQuestion() {
		return que;
	}
	
	public String getAnswer1() {
		return ans1;
	}
	
	public String getAnswer2() {
		return ans2;
	}
	
	public String getAnswer3() {
		return ans3;
	}
	
	public boolean getResultForQuestion(String answer) {
		if(answer == corrAns) {
			return true;
		}
		else {
			return false;
		}
	}
}
