package dao;

import org.apache.ibatis.annotations.Select;

public class Vertex {
    private int id = 0;
    private String name;
    private int age;
    private int sex;
    private double salary;

    public Vertex(int maxId){
//        设置自增产生ID,关于并发之后再考虑

        this.id = maxId+1;
    }

    public  Vertex(){

    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0)
            this.age = age;
        else
            System.out.println("无效年龄，请核对后重新输入...");
    }
    public void setSex(int sex){
        if(sex==0||sex==1)
            this.sex = sex;
        else
            System.out.println("无效性别，请核对后重新输入...");
    }
    public void setSalary(double salary){
        if(salary>0)
            this.salary = salary;
        else
            System.out.println("无效薪资，请核对后重新输入...");
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSex(){
        return sex;
    }
    public double getSalary(){
        return salary;
    }
}
