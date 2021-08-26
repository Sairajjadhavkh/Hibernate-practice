package com.oneToOneMultiDirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name ="Question_Id")
	private int question_id;
	@Column(name ="Question")
	private String question;
	@OneToOne
	@JoinColumn(name="Answer")
	private Answer answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_id, String question, Answer answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}
	public int getId() {
		return question_id;
	}
	public void setId(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [id=" + question_id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
