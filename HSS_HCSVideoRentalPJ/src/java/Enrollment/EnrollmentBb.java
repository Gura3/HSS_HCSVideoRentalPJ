package Enrollment;

import java.io.Serializable;
import java.util.List;
//import java.util.Calendar;
import java.util.logging.Logger;
//import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import static org.jboss.logging.NDC.clear;
//import javax.validation.constraints.NotNull;

@Named
@RequestScoped
public class EnrollmentBb implements Serializable {

    private String member_no; //会員No（FK　会員テーブル
    private String regist_date; //登録日
    private String iden_no; //身分証番号
    private String iden_class; //身分証区分
    private String staff_id; //店員ID（店員テーブル
    private String store_cd; //店舗コード

    @EJB
    EnrollmentDb db;//名前決めてない
    @Inject
    transient Logger log;

    public String create() {
        Enrollment enrollment = new Enrollment(member_no, regist_date, iden_no, iden_class, staff_id, store_cd);
        try {
            db.create(enrollment);
            clear();
        } catch (Exception e) {
            log.fine("■" + member_no/*会員番号エラー？*/ + "|" + e.getMessage());
        }
        return null;
    }

    public String edit(Enrollment enrollment) {
        member_no = enrollment.getMember_no();
        //ほかにもデータを設定
        return null;
    }

    public String update() {
        Enrollment enrollment = new Enrollment(member_no, regist_date, iden_no, iden_class, staff_id, store_cd);
        try {
            db.update(enrollment);
            clear();
        } catch (Exception e) {
            log.fine("■" + member_no/*会員番号？*/ + "|" + e.getMessage());
        }
        return null;
    }

    public String find() {
        Enrollment e = db.find(member_no);
        if (e != null) {
            this.member_no = e.getMember_no();
            this.regist_date = e.getRegist_date();
            this.iden_no = e.getIden_class();
            this.iden_class = e.getIden_class();
            this.staff_id = e.getStaff_id();
            this.store_cd = e.getStore_cd();

            /*getなんちゃら*/
        }
        return null;
    }

    public String delete(Enrollment enrollment) {
        db.delete(enrollment);
        return null;
    }

    public List<Enrollment> getAll() {
        return db.getAll();
    }

    public void clear() {
        member_no = regist_date = iden_no = iden_class = staff_id = store_cd = null;
    }

    public String getMember_no() {
        return member_no;
    }

    public void setMember_no(String member_no) {
        this.member_no = member_no;
    }

    public String getRegist_date() {
        return regist_date;
    }

    public void setRegist_date(String regist_date) {
        this.regist_date = regist_date;
    }

    public String getIden_no() {
        return iden_no;
    }

    public void setIden_no(String iden_no) {
        this.iden_no = iden_no;
    }

    public String getIden_class() {
        return iden_class;
    }

    public void setIden_class(String iden_class) {
        this.iden_class = iden_class;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStore_cd() {
        return store_cd;
    }

    public void setStore_cd(String store_cd) {
        this.store_cd = store_cd;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

}
