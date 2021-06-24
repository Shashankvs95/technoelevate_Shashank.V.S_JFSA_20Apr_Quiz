package com.te.quizapp;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.quizapp.bean.Category;
import com.te.quizapp.bean.Questions;

public class OneToMany 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Category c1 = new Category();
		c1.setCid(10);
		c1.setCname("Questions");
		
		Questions q1 = new Questions();
		q1.setQid(1);
		q1.setQuestions("Who is father of our country?");
		q1.setOption1("Gandhi");
		q1.setOption2("Nehru");
		q1.setOption3("Modi");
		q1.setOption4("Siddhu");
		q1.setCorrectAns("Gandhi");
		q1.setCategory(c1);
		
		Questions q2 = new Questions();
		q2.setQid(2);
		q2.setQuestions("What is Modi's fav food");
		q2.setOption1("Pizza");
		q2.setOption2("pani puri");
		q2.setOption3("samosa");
		q2.setOption4("sandwich");
		q2.setCorrectAns("pani puri");
		q2.setCategory(c1);
		
		Questions q3 = new Questions();
		q3.setQid(3);
		q3.setQuestions("Who played Arya Stark in GOT");
		q3.setOption1("Maisie Williams");
		q3.setOption2("Leana Heady");
		q3.setOption3("Elizabeth Olsen");
		q3.setOption4("Kate Winslet");
		q3.setCorrectAns("Maisie Williams");
		q3.setCategory(c1);
		
		Questions q4 = new Questions();
		q4.setQid(4);
		q4.setQuestions("What did WW say to his fello men");
		q4.setOption1("Heisenberg");
		q4.setOption2("Newton");
		q4.setOption3("Ramanujan");
		q4.setOption4("Vishveshwaraya");
		q4.setCorrectAns("Heisenberg");
		q4.setCategory(c1);
		
		
		
		
		
		
		ArrayList<Questions> al = new ArrayList<Questions>();
		al.add(q1);
		al.add(q2);
		al.add(q3);
		al.add(q4);
		
		c1.setQuestions(al);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuizApp");
		EntityManager entitymanager = emf.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		
		transaction.begin();
		
		entitymanager.persist(c1);
		
		
		transaction.commit();
	}
}
