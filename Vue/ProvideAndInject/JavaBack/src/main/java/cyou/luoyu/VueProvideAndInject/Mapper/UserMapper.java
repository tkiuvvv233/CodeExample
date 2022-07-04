package cyou.luoyu.VueProvideAndInject.Mapper;

import cyou.luoyu.VueProvideAndInject.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UserMapper {
    List<UserEntity> findUserAll();

    List<LinkedHashMap<String, Object>> findUserByCondition(Map<String, Object> map);

    UserEntity findUserById(String Id);

    List<UserEntity> findUserByIds(String[] list);

    Boolean addUser(UserEntity user);

    Boolean addUsers(List<UserEntity> users);

    Boolean updateUser(UserEntity user);

    Boolean updateUsers(List<UserEntity> users);

    Boolean deleteUserById(String id);

    Boolean deleteUserByIds(String[] list);
}

