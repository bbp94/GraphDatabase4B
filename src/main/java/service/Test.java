package service;

import dao.Edge;
import dao.OperationDao;
import dao.SQLDao;
import dao.Vertex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        SQLDao dao = ctx.getBean("SQLDao", SQLDao.class);
        Vertex vertex = new Vertex();
        Edge edge = new Edge();
        ArrayList<String> tableList= new ArrayList<String >();//存放所有表名，应改为用Mybatis获取
        tableList.add("vertex2");
        tableList.add("edge2");
        while (true){
            System.out.println("当前数据库所有表：");
            for(int i=1;i<=tableList.size();i++){
                System.out.println(i+". "+tableList.get(i-1));
            }
            System.out.println("请输入表代号(退出请按0):");
            try {
                Scanner scanner = new Scanner(System.in);
                int op = scanner.nextInt();
                if (op!=1&&op!=2){
                    System.out.println("请输入所列数据库代号...");
                    continue;
                }
                if(op==0){
                    System.out.println("欢迎再次使用！");
                    break;
                }
                OperationDao operationDao = new OperationDao(tableList.get(op-1),dao,vertex,edge);
            }catch (Exception E){
                System.out.println("请按要求输入..."+"\n");
                continue;
            }



        }

    }
}
