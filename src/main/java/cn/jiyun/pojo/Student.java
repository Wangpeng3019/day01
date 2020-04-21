package cn.jiyun.pojo;

import java.util.Date;

public class Student {

    private String userName;
    private Integer id;
    private String address;
    private String hobby;
    private Integer age;
    private Date beginDate;
    private String git;

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                ", beginDate=" + beginDate +
                '}';
    }
}
