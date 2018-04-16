package dao;

import java.util.HashMap;

/**
 * vertex对象
 * 包含五个属性：id,name,age,sex,salary
 */
public class Vertex {
    private int id ;
    private String name;
    private int age;
    private int sex;
    private double salary;
    private  HashMap<String,String> fieldMap= new HashMap<String, String>();
    public void setId(int id){
        this.id = id;
    }
    public  Vertex(){

    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){

        this.age = age;

    }
    public void setSex(int sex){

        this.sex = sex;


    }
    public void setSalary(double salary){

        this.salary = salary;

    }
    public void setFieldMap(){
        this.fieldMap.put("ID","Integer");
        this.fieldMap.put("NAME","String");
        this.fieldMap.put("AGE","Integer");
        this.fieldMap.put("SEX","Integer");
        this.fieldMap.put("SALARY","Double");
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
    public HashMap<String,String> getFieldMap(){
        return fieldMap;
    }
}
