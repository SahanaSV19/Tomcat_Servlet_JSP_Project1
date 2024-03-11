package student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import student.dto.Student;

public class studentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ICSEMarks");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Student fetchbyid(int id) {
		// TODO Auto-generated method stub
		Student student = entityManager.find(Student.class, id);
		return student;
	}

}
