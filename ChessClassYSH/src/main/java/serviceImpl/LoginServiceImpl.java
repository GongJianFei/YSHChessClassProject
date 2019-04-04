package serviceImpl;

import BatisMapper.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.LoginService;

/**
 * Created by Jeff on 2018/11/13.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login() {
        return  userMapper.getUser(1);
    }
}
