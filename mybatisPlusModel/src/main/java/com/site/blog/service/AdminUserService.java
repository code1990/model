package com.site.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.site.blog.entity.AdminUser;

/**
 * <p>
 * 后台管理员信息表 服务类
 * </p>
 *
 * @author: 南街
 * @since 2019-08-25
 */
public interface AdminUserService extends IService<AdminUser> {
    

    boolean updateUserInfo(AdminUser adminUser);

}
