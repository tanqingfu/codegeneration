package com.test.gen;

import com.baomidou.mybatisplus.annotation.DbType;

/**
 * Created by zzq on 2018/5/11.
 */
public class Generator {

    // 数据库连接
 /*   private DbType dbType = DbType.ORACLE;
    private String driverName = "oracle.jdbc.driver.OracleDriver";
    private String dbUrl = "jdbc:oracle:thin:@192.168.1.132:1521:ORCL";
    private String dbName = "TEXT";
    private String dbPwd = "123456";*/
    
    private DbType dbType = DbType.MYSQL;
    private String driverName = "com.mysql.cj.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost:3306/xinjue?serverTimezone=Asia/Shanghai&useSSL=false&useUnicode=true&characterEncoding=UTF-8";
    private String dbName = "root";
    private String dbPwd = "root";
    
    // 作者
    private String author = "tqf";
    // 包信息
    private String projectName = "Test";
    private String packageName = "com.xinjue";
    private String vuePath = "./static-vue";
    private Boolean restStyle = true;
    private String ide = "idea"; // idea eclipse

    public static void main(String[] args) {
        new Generator().generateCode("users");
    }
    
    public void generateCode(String... tables) {
        new S().generateByTables(
                new GenConfig()
                        .setDbType(dbType)
                        .setDriverName(driverName)
                        .setAuthor(author)
                        .setDbName(dbName)
                        .setDbPwd(dbPwd)
                        .setDbUrl(dbUrl)
                        .setPackageName(packageName)
                        .setProjectName(projectName)
                        .setVuePath(vuePath)
                        .setRestStyle(restStyle)
                        .setIde(ide),
                tables);
    }

}
