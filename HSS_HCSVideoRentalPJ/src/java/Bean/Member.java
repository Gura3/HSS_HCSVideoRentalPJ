/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


import javax.persistence.*;
import javax.validation.constraints.*;

/**
 *
 * @author s20163014
 */
@Entity
public class Member {
    @Id
    private String memberno;
    private String birthdate;
    private String name;
    private String kana;
    private String sex;
    private String postal;
    private String address;
    private String phone;
    private String occupation;
    private String last_visits;
    private String mail_address;
    private String mail_magazine;
    private String unpaid;
    private String borrowingcount;
    private String withdrawal;

    public String getMemberno() {
        return memberno;
    }

    public void setMemberno(String memberno) {
        this.memberno = memberno;
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

    public String getLast_visits() {
        return last_visits;
    }

    public void setLast_visits(String last_visits) {
        this.last_visits = last_visits;
    }

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    public String getMail_magazine() {
        return mail_magazine;
    }

    public void setMail_magazine(String mail_magazine) {
        this.mail_magazine = mail_magazine;
    }

    public String getUnpaid() {
        return unpaid;
    }

    public void setUnpaid(String unpaid) {
        this.unpaid = unpaid;
    }

    public String getBorrowingcount() {
        return borrowingcount;
    }

    public void setBorrowingcount(String borrowingcount) {
        this.borrowingcount = borrowingcount;
    }

    public String getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(String withdrawal) {
        this.withdrawal = withdrawal;
    }
    
    
    
    
}
