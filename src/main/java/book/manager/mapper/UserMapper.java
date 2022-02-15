package book.manager.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select password from users where username = #{username}")
    String getPasswordByUsername(String username);
}
