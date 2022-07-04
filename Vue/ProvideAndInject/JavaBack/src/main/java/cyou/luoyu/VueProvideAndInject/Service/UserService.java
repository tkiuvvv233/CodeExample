package cyou.luoyu.VueProvideAndInject.Service;

import cyou.luoyu.VueProvideAndInject.Entity.UserEntity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> findUserAll();

    List<LinkedHashMap<String, Object>> findUserByCondition(Map<String, Object> map);

    UserEntity findUserById(String Id);

    List<UserEntity> findUserByIds(String[] list);

    Boolean addUser(UserEntity user);

    Boolean addUsers(List<UserEntity> users);

    Boolean updateUser(UserEntity user);

//    Boolean updateUsers(List<UserEntity> users);

    Boolean deleteUserById(String Id);

    Boolean deleteUserByIds(String[] list);
}
