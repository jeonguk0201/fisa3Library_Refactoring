package running;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import model.domain.entity.Book;
import model.domain.entity.Loan;
import model.domain.entity.User;
import util.DBUtil;


public class RunningTest {
	
//	step01 - table 생성, data	
	@Test
	public void step01() {
		
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		User u1 = em.find(User.class, 1);
		User u2 = em.find(User.class, 2);
		Book b1 = em.find(Book.class, 1);
		Book b2 = em.find(Book.class, 2);
		
		em.persist(new Loan(b1, u1));
		em.persist(new Loan(b2, u2));
		
		Loan l1 = em.find(Loan.class, 1);
		System.out.println(l1);
		
//		em.persist(new User("이유나", 20,"여"));
//		em.persist(new User("이연희", 22,"여"));
//		em.persist(new User("이정민", 23,"여"));
//		em.persist(new User("이정욱", 29,"남"));
		
		// unique라 한 번 이상 못 들어감
		// no가 1로 저장되어 있음
//		User u1 = em.find(User.class, 1);
//		System.out.println(u1);
//		
//		insert into book values(100, "어린 왕자", "생텍쥐페리", 1);
//		insert into book values(200, "노인과 바다", "헤밍웨이", 2);
//		insert into book values(300, "누가 내 머리에 똥 쌌어", "홀츠바르트", 2);
//		
//		em.persist(new User("이유나", 20,"여"));
//
//		insert into loan values(0, "누가 내 머리에 똥 쌌어", "이정욱");
//		insert into loan values(1, "노인과 바다", "이연희");
//		
		
		tx.commit(); 
	
		em.close();
	}
	
	
	
}


