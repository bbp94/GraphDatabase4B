package dao;

import java.util.LinkedList;
import java.util.Scanner;

public class OperationDao {
    private String table;
    private SQLDao dao;
    private Vertex vertex;
    private Edge edge;
    public OperationDao(String table, SQLDao dao, Vertex vertex, Edge edge){
        this.table = table;
        this.dao = dao;
        this.vertex = vertex;
        this.edge = edge;
        opration();
    }

    public  void opration(){
        System.out.println("请输入操作代号：1.增加；2.修改；3.删除；4.查询；5.返回上一界面；");
        Scanner scanner = new Scanner(System.in);
        int operationCode = scanner.nextInt();
        while (true){
            if(operationCode==1 && table.equalsIgnoreCase("vertex2")){//插入vertex
                System.out.println("NAME:");
                vertex.setName(scanner.next());
                System.out.println("AGE:");
                vertex.setAge(scanner.nextInt());
                System.out.println("SEX(female 1;male 0):");
                vertex.setSex(scanner.nextInt());
                System.out.println("SALARY(yuan):");
                vertex.setSalary(scanner.nextDouble());
                vertex.setId(dao.maxIdOfVertex());
                dao.insertVertex(vertex.getId(),vertex.getName(),vertex.getAge(),vertex.getSex(),vertex.getSalary());

            }else if(operationCode==1 && table.equalsIgnoreCase("edge2")){//插入edge
//                需要增加对边起点和终点的检查
                System.out.println("ORIGIN_ID");
                edge.setOriginId(scanner.nextInt());
                System.out.println("TERMINUS_ID");
                edge.setTerminusId(scanner.nextInt());
                System.out.println("RELATION_ID:");
                System.out.println(edge.getRelationList());
                edge.setRelationId(scanner.nextInt());
                edge.setTerminusId(dao.maxIdOfEdge());
                dao.insertEdge(edge.getId(),edge.getOriginId(),edge.getTerminusId(),edge.getRelationId());

            }else if(operationCode==3){
                System.out.println("请输入需要删除的数据ID：");
                dao.deleteById(table,scanner.nextInt());
                System.out.println("删除成功...");

            }else if (operationCode==2){
                //!!!!有问题
                System.out.println("请输入需要修改的数据ID：");
                int id = scanner.nextInt();
                System.out.println("请输入需要修改的字段：");
                String fieldName = scanner.next();
                System.out.println("请输入字段新值：");
                dao.updateById(table,fieldName,scanner.next(),id);

            }else if (operationCode==4){
                System.out.println("输入需要查询的ID(查看所有输入*)：");
                String temp = scanner.next();
                if(temp.equals("*") && table.equals("vertex2")){//查询vertex表中所有
                    LinkedList<Vertex> tempList= dao.selectAllOfVertex(table);
                    for(Vertex v:tempList)
                        System.out.println("ID="+ v.getId()+" NAME="+v.getName()
                                +" AGE="+v.getAge()+" SEX="+v.getSex()+" SALARY=" +v.getSalary());

                }else if(table.equals("*") && table.equals("edge2")){//查询edge表中所有
                    LinkedList<Edge> tempList= dao.selectAllOfEdge(table);
                    for(Edge e:tempList)
                        System.out.println("ID="+ e.getId()+" ORIGIN_ID="+e.getOriginId()
                                +" TERMINUS_ID="+e.getTerminusId()+" RELATION="+e.getRelationList().get(e.getRelationId()));
                }else {//查询任意表的某条记录
                    dao.selectById(table,Integer.valueOf(temp));
                }


            }else if(operationCode==5){
                break;
            }
            System.out.println("请输入操作代号：1.增加；2.修改；3.删除；4.查询；5.返回上一界面；");
            operationCode = scanner.nextInt();
        }

    }

}
