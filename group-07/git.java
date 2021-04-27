package git;

import Lesson01_task.DBconnection;

import java.sql.Connection;
import java.util.List;

public class git {
    //TODO：罗宇欣
public static void main(String[] args) {
        Connection connection= DBconnection.getConnection();
        LibraryDao libraryDao=new LibraryDao();
        libraryDao.query("C Primer Plus 第6版 中文版(异步图书出品)");
//        libraryDao.deleteByBookname("rjgc");
//        libraryDao.insert("rjgc");
    }
}
