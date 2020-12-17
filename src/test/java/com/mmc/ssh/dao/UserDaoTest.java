package com.mmc.ssh.dao;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.ssh.entity.User;

public class UserDaoTest extends BaseTestCaseJunit44 {
    @Test
    public void testInit() {
        //不用写东西，启动hibernate时会自动检查数据库，如果缺少表，则自动建表；如果表里缺少列，则自动添加列
    }
}