package cyou.luoyu.VueProvideAndInject.Component;

/**
 * ExceptionResponse
 *
 * @author 王一峰
 * @date 2022/06/18
 */
public enum ResponseModel {
    Success(200, "success"),
    Insert_Error(401, "插入数据失败"),
    Update_Error(402, "更新数据失败"),
    Delete_Error(402, "删除数据失败"),
    Mysql_Error(501, "数据库错误"),
    UnException(500, "其他系统错误");


    private Integer code;
    private String msg;


    ResponseModel(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
