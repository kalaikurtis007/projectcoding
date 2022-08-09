package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userid;
    private String username;
    private String dept;
    private Integer usersalary;
    //private Date time;


    public User(Integer userid, String username, String dept, Integer usersalary) {
        this.userid = userid;
        this.username = username;
        this.dept = dept;
        this.usersalary = usersalary;
    }

    public User() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getUsersalary() {
        return usersalary;
    }

    public void setUsersalary(Integer usersalary) {
        this.usersalary = usersalary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(userid);
        sb.append(", name='").append(username).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(", salary=").append(usersalary);
        sb.append('}');
        return sb.toString();
    }

}
