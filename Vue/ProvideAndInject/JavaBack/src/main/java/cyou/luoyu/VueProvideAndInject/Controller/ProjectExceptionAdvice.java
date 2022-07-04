package cyou.luoyu.VueProvideAndInject.Controller;

import cyou.luoyu.VueProvideAndInject.Component.BaseResponse;
import cyou.luoyu.VueProvideAndInject.Component.ResponseBuilder;
import cyou.luoyu.VueProvideAndInject.Component.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ProjectExceptionAdvice
 *
 * @author 王一峰
 * @date 2022/06/23
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {


    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public BaseResponse doOtherException(Exception exception) {
        logger.error(exception.getMessage());
        return ResponseBuilder.makeAction(ResponseModel.UnException, exception.getMessage());
    }

    @ExceptionHandler(java.net.ConnectException.class)
    public BaseResponse doConnectException(java.net.ConnectException exception) {
        logger.error(exception.getMessage());
        return ResponseBuilder.makeAction(ResponseModel.UnException, "网络错误:连接数据库失败:" + exception.getMessage());
    }
}
