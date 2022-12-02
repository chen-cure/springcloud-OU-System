package cn.scnj.mapper;

import cn.scnj.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Select("select * from t_user where user_id=#{userId};")
    User selectByUserId(String userId);

    @Update("update t_user set points=points+#{point} where user_id=#{userId};")
    void updateUserPoint(@Param("userId") String userId,@Param("point") int point);
}
