package dao;

import java.util.HashMap;
import java.util.Map;

public class Edge {
    private int id;
    private int originId;
    private int terminusId;
    private int relationId;
    private HashMap<Integer,String> relationList;

    public void setEdge(int maxId){
        this.id = maxId+1;

    }
    public Edge(){

    }
    public void setOriginId(int originId){
        this.originId = originId;
    }
    public void setTerminusId(int terminusId){
        this.terminusId = terminusId;
    }
    public void setRelationId(int relationId){
        this.relationId =  relationId;
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
    public Map<Integer,String> getRelationList(){
        this.relationList.put(1,"主管");
        this.relationList.put(2,"组长");
        this.relationList.put(3,"师傅");
        this.relationList.put(4,"师兄");
        this.relationList.put(5,"师姐");
        this.relationList.put(6,"同事");
        return relationList;
    }
}
