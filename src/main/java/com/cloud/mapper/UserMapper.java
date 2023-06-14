package com.cloud.mapper;

import com.cloud.entity.User;
import com.cloud.entity.UserToShow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @InterfaceName: MyFileMapper
 * @Description: 与用户相关的数据库操作
 * @author: xw
 * @date 2022/1/26 21:55
 * @Version: 1.0
 **/
@Mapper
public interface UserMapper {

    /**
     * @Description 添加User
     * @author Carol
     * @date 2022-02-25 17:19:31
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);
    
    /**
     * @Description 删除User
     * @author Carol
     * @date 2022-02-25 17:19:31
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

    /**
     * @Description 通过ID查询单条数据
     * @author Carol
     * @date 2022-02-25 17:19:31
     * @param userId 主键
     * @return 实例对象
     */
    User queryById(Integer userId);

    /**
     * @Description 通过邮箱和密码查询单条数据
     * @author Carol
     * @date 2022-02-25 17:19:31
     * @param email 邮箱
     * @param password 密码
     * @return 实例对象
     */
    User queryByEmailAndPwd(String email,String password);

    /**
     * @Description  通过openID查询单条数据
     * @Author xw
     * @Date 18:29 2022/2/25
     * @Param [userId]
     * @return com.moti.entity.User
     **/
    User getUserByOpenId(String openId);

    /**
     * @Description  通过邮箱查询单条数据
     * @Author xw
     * @Date 18:29 2022/2/25
     * @Param [email]
     * @return com.moti.entity.User
     **/
    User getUserByEmail(String email);

    /**
     * @Description 查询全部数据
     * @author Carol
     * @date 2022-02-25 17:19:31
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<User> queryAll();

    /**
     * @Description 实体作为筛选条件查询数据
     * @author Carol
     * @date 2022-02-25 17:19:31
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * @Description 修改User
     * @author Carol
     * @date 2022-02-25 17:19:31
     * @return 影响行数
     */
    int update(User user);

    /**
     * @Description 获取全部的用户
     * @Author xw
     * @Date 16:40 2022/3/10
     * @Param []
     * @return java.util.List<com.moti.entity.UserToShow>
     **/
    List<UserToShow> getUsers();
    
    /**
     * @Description 获得已注册用户的数量
     * @Author xw
     * @Date 10:50 2022/3/11
     * @Param []
     * @return java.lang.Integer
     **/
    Integer getUsersCount();
}