package git;

import Lesson01_task.DBconnection;
import Lesson01_task.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LibraryDao {
//    TODO：罗宇欣
//    根据书名名查询
        List<Library> libraries=new ArrayList<>();
        Connection connection= DBconnection.getConnection();// 获取连接
        Statement statement=null;
        ResultSet set=null;
        try {
            statement =connection.createStatement(); //通过连接获取 statement 对象
            String selectStr="";
            if (bookname!=null&&!bookname.equals("")){
                selectStr="select * from library where bookname like '%"+bookname+"%'";
            }else {
                selectStr="select * from library ";
            }
    //删除
    //TODO：周帮华

    //添加
    //TODO：周帮华


}
