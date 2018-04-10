package dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.LinkedList;


@Component("SQLDao")
public interface SQLDao {

        @Select("Select max(ID) from vertex2")
        int maxIdOfVertex();

        @Insert("Insert into vertex2(ID,NAME,AGE,SEX,SALARY) VALUES (#{id},#{name},#{age},#{sex},#{salary})")
        void insertVertex(@Param("id") int id
                         ,@Param("name") String name
                         ,@Param("age") int age
                         ,@Param("sex") int sex
                         ,@Param("salary") double salary);



        @Delete("Delete from ${table} where id=#{id}")
        void deleteById(@Param("table") String table,
                              @Param("id") int id);

        @Update("Update ${table} set ${field}=#{newValue} where id=#{id}")
        void updateById(@Param("table") String table,
                              @Param("field") String field,
                              @Param("newValue") Object newValue,
                              @Param("id") int id);
//        void updateById(@Param("table") String table,
//                              @Param("field") String field,
//                              @Param("newValue") String newValue,
//                              @Param("id") int id);
//        void updateById(@Param("table") String table,
//                              @Param("field") String field,
//                              @Param("newValue") double newValue,
//                              @Param("id") int id);


        @Select("Select ID,NAME,AGE,SEX,SALARY from ${table} where id=#{id}")
        LinkedHashMap selectById(@Param("table") String table,
                                 @Param("id") int id);

        @Select("Select ID,NAME,AGE,SEX,SALARY from ${table}")
        LinkedList<Vertex> selectAllOfVertex(@Param("table") String table);

        @Select("Select ID,NAME,AGE,SEX,SALARY from ${table}")
        LinkedList<Edge> selectAllOfEdge(@Param("table") String table);


        @Select("Select max(ID) from edge2")
        int maxIdOfEdge();

        @Insert("Insert into edge2(ID,ORIGIN_ID,TERMINUS_ID,RELATION_ID) VALUES (#{id},#{originId},#{terminusId},#{relationId}")
        void insertEdge(@Param("id") int id
                ,@Param("originId") int originId
                ,@Param("terminusId") int terminusId
                ,@Param("relationId") int relationId);


}
