package cyou.luoyu.VueProvideAndInject.Entity;

/**
 * 学生信息表(user)
 *
 * @author Wang
 * @version 1.0.0 2022-07-04
 */
public class UserEntity implements java.io.Serializable {

    /**
     * 版本号
     */
    private static final long serialVersionUID = -6341667337322327421L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /**
     * 学号
     */
    private String id;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 是否离校
     */
    private Boolean ifOut;

    /**
     * 性别
     */
    private String sex;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取学号
     *
     * @return 学号
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置学号
     *
     * @param id 学号
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getIfOut() {
        return ifOut;
    }

    public void setIfOut(Boolean ifOut) {
        this.ifOut = ifOut;
    }

    /**
     * 获取性别
     *
     * @return 性别
     */
    public String getSex() {
        return this.sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}