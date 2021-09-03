package com.mystudy.Dao;

import com.mystudy.entity.Student;
import com.mystudy.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDao {

    QueryRunner qr = JdbcUtil.getQueryRunner();

    public List<Student> getAllStudent(){
        String sql = "select * from student";
        List<Student> list = null;
        try {
            list = qr.query(sql, new BeanListHandler<>(Student.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}
