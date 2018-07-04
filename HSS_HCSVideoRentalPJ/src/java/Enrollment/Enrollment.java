/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enrollment;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author s20163014
 */
@Entity
public class Enrollment {
    @Id
    private String member_no; //会員No（FK　会員テーブル
    private String regist_date; //登録日
    private String iden_no; //身分証番号
    private String iden_class; //身分証区分
    private String staff_id; //店員ID（店員テーブル
    private String store_cd; //店舗コード

    Enrollment(String member_no, String regist_date, String iden_no, String iden_class, String staff_id, String store_cd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
    
}
