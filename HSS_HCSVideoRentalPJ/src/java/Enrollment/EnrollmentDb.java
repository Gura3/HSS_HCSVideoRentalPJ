package Enrollment;

import java.util.List;
import javax.persistence.*;

public class EnrollmentDb {

    @PersistenceContext
    private EntityManager em;

    public void create(Enrollment enrollment) {
        em.persist(enrollment);
    }

    public void update(Enrollment enrollment) {
        em.merge(enrollment);
    }

    public Enrollment find(String member_no) {
        return em.find(Enrollment.class, member_no);
    }

    public void delete(Enrollment enrollment) {
        em.remove(em.merge(enrollment));
    }

    public List<Enrollment> getAll() {
        return em.createQuery("SELECT e FROM Enrollment e").getResultList();
    }

}
