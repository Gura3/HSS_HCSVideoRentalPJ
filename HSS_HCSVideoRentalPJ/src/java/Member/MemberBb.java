package Member;

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
//import javax.validation.constraints.NotNull;

@Named
@RequestScoped
public class MemberBb implements Serializable {

    //バリデーションまだ

    private String member_no; //会員No（FK　会員テーブル
    private String birthdate;//生年月日８桁（半角数字）
    private String name; //会員氏名
    private String kana; //会員氏名フリガナ
    private String sex; //性別
    private String postal; //郵便番号
    private String address; //住所
    private String phone; //電話番号
    private String occupation; //職業

    @EJB
    MemberDb db;
    @Inject
    transient Logger log;

    public String create() {
        Member member = new Member(member_no, birthdate, name, kana, sex, postal, address, phone, occupation);
        try {
            db.create(member);
            clear();
        } catch (Exception e) {
            log.fine("■" + member_no/*エラー？*/ + "|" + e.getMessage());
        }
        return null;
    }

    public String edit(Member member) {
        member_no = member.getMemberno();
        //その他
        return null;
    }

    public String update() {
        Member member = new Member(member_no, birthdate, name, kana, sex, postal, address, phone, occupation);
        try {
            db.update(member);
            clear();
        } catch (Exception e) {
            log.fine("■" + member_no/*エラー？*/ + "|" + e.getMessage());
        }
        return null;
    }

    public String find() {
        Member m = db.find(member_no);
        if (m != null) {
            this.member_no = m.getMemberno();
            this.birthdate = m.getBirthdate();
            this.name = m.getName();
            this.kana = m.getKana();
            this.sex = m.getSex();
            this.postal = m.getPostal();
            this.address = m.getAddress();
            this.phone = m.getPhone();
            this.occupation = m.getOccupation();
        }
        return null;
    }

    public String delete(Member member) {
        db.delete(member);
        return null;
    }

    public List<Member> getAll() {
        return db.getAll();
    }

    public void clear() {
        member_no = birthdate = name = kana = sex = postal = address = phone = occupation = null;
    }

    public String getMember_no() {
        return member_no;
    }

    public void setMember_no(String member_no) {
        this.member_no = member_no;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

}
