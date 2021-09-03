package com.mystudy.Dao;

import com.mystudy.entity.Num;
import com.mystudy.entity.User;
import com.mystudy.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDao {
    QueryRunner qr = JdbcUtil.getQueryRunner();

    public User login(String username, String pwd){
        User user = null;
        String sql = "select * from tb_user where username=? and pwd=?";
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), username, pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return user;
    }

    public int select(String username){
        int num = 0;
        User user = null;
        String sql = "select * from tb_user where username=?";
        try {
            user = qr.query(sql,new BeanHandler<>(User.class),username);
            if(user != null){
                num = user.getUid();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(user);
        System.out.println(num);
        return num;
    }

    public void add(String username, String pwd) {
        String sql = "insert into tb_user(username,pwd) values(?,?)";
        try {
            qr.update(sql,username,pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
