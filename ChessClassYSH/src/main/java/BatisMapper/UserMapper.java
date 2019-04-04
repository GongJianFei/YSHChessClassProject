package BatisMapper;

import model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * Created by Jeff on 2019/4/3.
 */
    @Component
    public interface UserMapper {
        @Select("SELECT * FROM Users WHERE id = #{userId}")
        User getUser(@Param("userId") Integer userId);
    }

