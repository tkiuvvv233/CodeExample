package cyou.luoyu.VueProvideAndInject.Component;

/**
 * ResponseBuilder
 *
 * @author 王一峰
 * @date 2022/06/18
 */
public class ResponseBuilder {

    public static BaseResponse makeSuccessResponse(Object object) {
        return new BaseResponse(ResponseModel.Success.getCode(), ResponseModel.Success.getMsg(), object);
    }

    public static BaseResponse makeSuccessAction() {
        return new BaseResponse(ResponseModel.Success.getCode(), ResponseModel.Success.getMsg(), null);
    }

    public static BaseResponse makeResponse(ResponseModel responseModel, Object o) {
        return new BaseResponse(responseModel.getCode(), responseModel.getMsg(), o);
    }

    public static BaseResponse makeResponse(Integer code, String msg, Object o) {
        return new BaseResponse(code, msg, o);
    }

    public static BaseResponse makeAction(ResponseModel responseModel) {
        return new BaseResponse(responseModel.getCode(), responseModel.getMsg(), null);
    }

    public static BaseResponse makeAction(Integer code, String msg) {
        return new BaseResponse(code, msg, null);
    }

    public static BaseResponse makeAction(ResponseModel responseModel, String msg) {
        return new BaseResponse(responseModel.getCode(), msg, null);
    }
}
