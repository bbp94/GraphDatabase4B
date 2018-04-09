package dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Map;

@Component("operationDao")
public interface OperationDao {

        @Select("Select max(ID) from vertex2")
        int maxIdOfVertex();

        @Insert("Insert into vertex2(ID,NAME,AGE,SEX,SALARY) VALUES (#{id},#{name},#{age},#{sex},#{salary})")
        void insertVertex(@Param("id") int id
                         ,@Param("name") String name
                         ,@Param("age") int age
                         ,@Param("sex") int sex
                         ,@Param("salary") double salary);



        @Delete("Delete from vertex2 where id=#{id}")
        void deleteVertexById(@Param("id") int id);

        @Update("Update vertex2 set ${field}=#{newValue} where id=#{id}")
        void updateVertexById(@Param("field") String field,
                              @Param("newValue") int newValue,
                              @Param("id") int id);
        void updateVertexById(@Param("field") String field,
                              @Param("newValue") String newValue,
                              @Param("id") int id);
        void updateVertexById(@Param("field") String field,
                              @Param("newValue") double newValue,
                              @Param("id") int id);


        @Select("Select * from vertex2 where id=#{id}")
//        @Results({@Result(property = "id",column = "ID"),
//        @Result(property = "name",column = "name"),
//        @Result(property = "age",column = "age"),
//        @Result(property = "sex",column = "sex"),
//        @Result(property = "salary",column = "salary")})
        LinkedHashMap selectVertexById(@Param("id") int id);
        //最开始用map接收返回值，打印出的字段是按照首字母降序排的，加入@Results无用，用LinkedHashMap解决




//对edge数据库操作，未完成
        @Insert("Insert into edge2(ID,ORIGIN_ID,TERMINUS_ID,RELATION_ID) VALUES (#{id},#{originId},#{terminusId},#{relationId}")
        void insertEdge(@Param("id") int id
                ,@Param("originId") int originId
                ,@Param("terminusId") int terminusId
                ,@Param("relationId") int relationId);


}
