package dao;

public class Edge {
    private int id;
    private int originId;
    private int terminusId;
    private int relationId;
    private static int count = 0;
    public Edge(){
        this.id = count++;
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
    public int getRelationId(){
        return relationId;
    }
}
