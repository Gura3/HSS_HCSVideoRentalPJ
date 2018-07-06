/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Gura3
 */
/* 仮会員エンティティクラス */
@Entity

public class TemporaryMember {


public class TemporaryMember implements Serializable{

    @Id
    private String memberno;            //仮会員No
    private String birthday;            //生年月日
    private String name;                //氏名
    private String kana;                //会員名(フリガナ)
    private String sex;                 //性別
    private String postal;              //郵便番号
    private String address;             //住所
    private String phone;               //電話番号
    private String occupation;          //職業
    private String mail_address;        //メールアドレス
    private String mail_magazine;       //メールマガジン
    private String registararion_date;  //仮会員登録日

    /* コンストラクタ */
    public TemporaryMember(){}
    /* getter･setter */
    public String getMemberno() {
        return memberno;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getKana() {
        return kana;
    }

    public String getSex() {
        return sex;
    }

    public String getPostal() {
        return postal;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getMail_address() {
        return mail_address;
    }

    public String getMail_magazine() {
        return mail_magazine;
    }

    public String getRegistararion_date() {
        return registararion_date;
    }

    public void setMemberno(String memberno) {
        this.memberno = memberno;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    public void setMail_magazine(String mail_magazine) {
        this.mail_magazine = mail_magazine;
    }

    public void setRegistararion_date(String registararion_date) {
        this.registararion_date = registararion_date;
    }

}
