package Member;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MemberDb {

    @PersistenceContext
    private EntityManager em;

    public void create(Member member) {
        em.persist(member);
    }

    public void update(Member member) {
        em.merge(member);
    }

    public Member find(String member_no) {
        return em.find(Member.class, member_no);
    }

    public void delete(Member member) {
        em.remove(em.merge(member));
    }

    public List<Member> getAll() {
        return em.createQuery("SELECT m FROM Member m").getResultList();
    }
}
