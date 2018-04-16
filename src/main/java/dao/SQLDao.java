package dao;

import org.apache.ibatis.annotations.*;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

/**
 * 数据库接口，用了Mybatis注解
 */

@Component("SQLDao")
public interface SQLDao {

        @Select("Select max(ID) from vertex2")
        int maxIdOfVertex();

        @Insert("Insert into vertex2(NAME,AGE,SEX,SALARY) VALUES (#{name},#{age},#{sex},#{salary})")
        @Options(useGeneratedKeys = true,keyColumn = "id")
        void insertVertex(Vertex vertex);

        @Delete("Delete from ${table} where id=#{id}")
        void deleteById(@Param("table") String table,
                              @Param("id") int id);

        @Update("Update ${table} set ${field}=#{newValue} where id=#{id}")
        void updateById(@Param("table") String table,
                              @Param("field") String field,
                              @Param("newValue") Integer newValue,
                              @Param("id") int id);
        void updateById(@Param("table") String table,
                              @Param("field") String field,
                              @Param("newValue") String newValue,
                              @Param("id") int id);
        void updateById(@Param("table") String table,
                              @Param("field") String field,
                              @Param("newValue") double newValue,
                              @Param("id") int id);


        @Select("Select * from ${table} where id=#{id}")
        ArrayList<Object> selectById(@Param("table") String table,
                                     @Param("id") int id);

        @Select("Select ID,NAME,AGE,SEX,SALARY from ${table}")
        ArrayList<Vertex> selectAllOfVertex(@Param("table") String table);

        @Select("Select ID,NAME,AGE,SEX,SALARY from ${table} where id=#{id}")
        Vertex selectAVertexById(@Param("table") String table,
                                     @Param("id") int id);

        @Select("Select ID,ORIGIN_ID,TERMINUS_ID,RELATION_ID from ${table}")
        ArrayList<Edge> selectAllOfEdge(@Param("table") String table);

        @Select("Select ID,NAME,AGE,SEX,SALARY from ${table} where ID=#{value}")
        ArrayList<Vertex> selectAllOfVertexByTer(@Param("table") String table,
                                                 @Param("value") int value);

        @Select("Select ID,ORIGIN_ID,TERMINUS_ID,RELATION_ID from ${table} where ORIGIN_ID=#{value}")
        ArrayList<Edge> selectAllOfEdgeByORINGIN(@Param("table") String table,
                                                 @Param("value") int value);

        @Select("Select max(ID) from edge2")
        Object maxIdOfEdge();

        @Insert("Insert into edge2(ORIGIN_ID,TERMINUS_ID,RELATION_ID) VALUES (#{originId},#{terminusId},#{relationId})")
        @Options(useGeneratedKeys = true,keyColumn = "id")
        void insertEdge(Edge edge);

        @Select("Select ID from ${table}")
        ArrayList<Integer> selectAllIdOf(@Param("table") String table);


}
