package top.ruoxijun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.ruoxijun.entity.User;
import top.ruoxijun.service.UserService;
import top.ruoxijun.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 14606
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-02-21 21:22:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




