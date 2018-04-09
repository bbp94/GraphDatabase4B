package service;

import dao.Edge;
import dao.OperationDao;
import dao.Vertex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        OperationDao dao = ctx.getBean("operationDao",OperationDao.class);//返回OperationDao类型

//        System.out.println("");
//        Scanner scanner = new Scanner(System.in);
//        int tabelChoose = scanner.nextInt();
        //1.显示当前数据库和数据库中的所有表，让用户选择所要操作的表
        //2.显示所有可操作方法，让用户选择操作，提示用户按照格式输入数据
        //3.输入exit代表所有操作结束，程序结束||返回选择表界面


//       增加
        Vertex vertex = new Vertex(dao.maxIdOfVertex());
        vertex.setName("Tom");
        vertex.setAge(18);
        vertex.setSex(1);
        vertex.setSalary(1500);
        dao.insertVertex(vertex.getId(),vertex.getName(),vertex.getAge(),vertex.getSex(),vertex.getSalary());

//        修改
        dao.updateVertexById("sex","1",1);

//        查找
        System.out.println(dao.selectVertexById(0));

//        删除
        dao.deleteVertexById(1);


    }
}
