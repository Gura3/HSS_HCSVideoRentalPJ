package Bean;

import java.io.Serializable;
//import java.util.Calendar;
import java.util.logging.Logger;
//import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    @PersistenceContext
    private EntityManager em;
    
    transient Logger log;
    
      public String next(){
        create();
        return null;
    }
       public void create(){
        //エンティティ生成
        try{
        //    db.create(emp);//emp→エンティティ名に変更
        //    clear();
        }catch(Exception e){
            log.severe(/*エラーメッセージ*/"");
      //  }
      // public void clear(){
         //   member_no = null;
         //   birthdate=name=kana=sex=postal=address=phone=occupation=null;
        
        
        }
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

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }
       
}
