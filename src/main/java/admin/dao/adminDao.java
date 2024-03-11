package admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import admin.dto.Admin;
import student.dto.Student;

public class adminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ICSEMarks");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Student std) {
		entityTransaction.begin();
		entityManager.persist(std);
		entityTransaction.commit();
	}

	public Student fetchbyid(int id) {

		Student student = entityManager.find(Student.class, id);
		return student;
	}

	public List<Student> fetchAll() {
		Query query = entityManager.createQuery("Select data from Student data");
		List<Student> l1 = query.getResultList();
		return l1;
	}

	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return "Data Deleted";
		} else {
			return "Data not found";
		}
	}

	public String deleteAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("Select data from Student data");
		List<Student> l1 = query.getResultList();
		if (l1.isEmpty()) {
			return "No data found to delete";
		} else {
			entityTransaction.begin();
			entityManager.remove(l1);
			entityTransaction.commit();
			return "data delleted";
		}
	}

	public String update(Student std) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.merge(std);
		entityTransaction.commit();
		return "Data updated successfully";
	}

	public String admincreation(Admin admin) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return "Account Created Successfully!!!";
	}

	public Object adminlogin(String mailID, String password) {
		// TODO Auto-generated method stub
		Admin admin = entityManager.find(Admin.class, mailID);
		if (password.equals(admin.getPwd())) {
			return admin;
		} else {
			return false;
		}

	}
}
