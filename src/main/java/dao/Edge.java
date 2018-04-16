package dao;

import java.util.HashMap;
import java.util.Map;

/**
 * Edge对象
 * 包含四个属性:id，originId，terminusId，relationId
 */
public class Edge {
    private int id;
    private int originId;
    private int terminusId;
    private int relationId;
    private HashMap<Integer,String> relationList = new HashMap<Integer, String>();
    private HashMap<String,String> fieldMap = new HashMap<String, String>();

    public void setId(int id){
        this.id = id;

    }
    public Edge(){

    }
    public void setOrigin_Id(int originId){
        this.originId = originId;
    }
    public void setTerminus_Id(int terminusId){
        this.terminusId = terminusId;
    }
    public void setRelation_Id(int relationId){
        this.relationId =  relationId;
    }
    public void setFieldMap(){
        this.fieldMap.put("ID","Integer");
        this.fieldMap.put("ORIGIN_ID","Integer");
        this.fieldMap.put("TERMINUS_ID","Integer");
        this.fieldMap.put("RELATION_ID","Integer");
    }
    public int getId(){
        return id;
    }
    public int getOriginId(){
        return originId;
    }
    public int getTerminusId(){
        return terminusId;
    }
    public int getRelationId(){
        return relationId;
    }
    public HashMap<Integer,String> getRelationList(){
        this.relationList.put(1,"主管");
        this.relationList.put(2,"组长");
        this.relationList.put(3,"师傅");
        this.relationList.put(4,"师兄");
        this.relationList.put(5,"师姐");
        this.relationList.put(6,"同事");
        return relationList;
    }
    public HashMap<String,String > getFieldMap(){
        return fieldMap;
    }
}
