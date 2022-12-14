package com.example.journalstudents.table;

//import javax.persistence.*; старая библеотека

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
//    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column (name="id")
    private int id;

    @Column (name="surname")
    private  String surname;

    @Column (name="name")
    private  String name;

    @Column (name="group")
    private  String group;

    @Column (name="payment")
    private  String payment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
