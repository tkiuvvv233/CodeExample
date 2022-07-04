package cyou.luoyu.VueProvideAndInject.Service.impl;

import cyou.luoyu.VueProvideAndInject.Entity.UserEntity;
import cyou.luoyu.VueProvideAndInject.Mapper.UserMapper;
import cyou.luoyu.VueProvideAndInject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> findUserAll() {
        return userMapper.findUserAll();
    }

    @Override
    public List<LinkedHashMap<String, Object>> findUserByCondition(Map<String, Object> map) {
        return userMapper.findUserByCondition(map);
    }

    @Override
    public UserEntity findUserById(String Id) {
        return userMapper.findUserById(Id);
    }

    @Override
    public List<UserEntity> findUserByIds(String[] list) {
        return userMapper.findUserByIds(list);
    }

    @Override
    public Boolean addUser(UserEntity user) {
        return userMapper.addUser(user);
    }

    @Override
    public Boolean addUsers(List<UserEntity> users) {
        return userMapper.addUsers(users);
    }

    @Override
    public Boolean updateUser(UserEntity user) {
        return userMapper.updateUser(user);
    }

//    @Override
//    public Boolean updateUsers(List<UserEntity> users) {
//        return userMapper.updateUsers(users);
//    }

    @Override
    public Boolean deleteUserById(String Id) {
        return userMapper.deleteUserById(Id);
    }

    @Override
    public Boolean deleteUserByIds(String[] list) {
        return userMapper.deleteUserByIds(list);
    }
}
