package dao;

public class Vertex {
    private int id ;
    private String name;
    private int age;
    private int sex;
    private double salary;

//    public void setnewId(int maxId){
////        设置自增产生ID,关于并发之后再考虑
//
//        this.id = maxId+1;
//    }
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
