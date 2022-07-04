package cyou.luoyu.VueProvideAndInject.Controller;

import cyou.luoyu.VueProvideAndInject.Component.BaseResponse;
import cyou.luoyu.VueProvideAndInject.Component.ResponseBuilder;
import cyou.luoyu.VueProvideAndInject.Component.ResponseModel;
import cyou.luoyu.VueProvideAndInject.Entity.UserEntity;
import cyou.luoyu.VueProvideAndInject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findUserAll")
    BaseResponse findUserAll() {
        return ResponseBuilder.makeSuccessResponse(userService.findUserAll());
    }

    @PostMapping("/findUserByCondition")
    BaseResponse findUserByCondition(@RequestBody Map<String, Object> map) {
        return ResponseBuilder.makeSuccessResponse(userService.findUserByCondition(map));
    }

    @GetMapping("/findUserById")
    BaseResponse findUserById(@RequestParam("Id") String Id) {
        return ResponseBuilder.makeSuccessResponse(userService.findUserById(Id));
    }

    @GetMapping("/findUserByIds")
    BaseResponse findUserByIds(@RequestParam("list") String[] list) {
        return ResponseBuilder.makeSuccessResponse(userService.findUserByIds(list));
    }

    @PostMapping("/addUser")
    BaseResponse addUser(@RequestBody UserEntity user) {
        if (userService.addUser(user)) {
            return ResponseBuilder.makeSuccessAction();
        } else {
            return ResponseBuilder.makeAction(ResponseModel.Insert_Error);
        }
    }

    @PostMapping("/addUsers")
    BaseResponse addUsers(@RequestBody List<UserEntity> users) {
        if (userService.addUsers(users)) {
            return ResponseBuilder.makeSuccessAction();
        } else {
            return ResponseBuilder.makeAction(ResponseModel.Insert_Error);
        }
    }

    @PostMapping("/updateUser")
    BaseResponse updateUser(@RequestBody UserEntity user) {
        if (userService.updateUser(user)) {
            return ResponseBuilder.makeSuccessAction();
        } else {
            return ResponseBuilder.makeAction(ResponseModel.Update_Error);
        }
    }

//    @PostMapping("/updateUsers")
//    BaseResponse updateUsers(@RequestBody List<UserEntity> users) {
//        if (userService.updateUsers(users)) {
//            return ResponseBuilder.makeSuccessAction();
//        } else {
//            return ResponseBuilder.makeAction(ResponseModel.Update_Error);
//        }
//    }

    @PostMapping("/deleteUserById")
    BaseResponse deleteUserById(@RequestParam("Id") String Id) {
        if (userService.deleteUserById(Id)) {
            return ResponseBuilder.makeSuccessAction();
        } else {
            return ResponseBuilder.makeAction(ResponseModel.Delete_Error);
        }
    }

    @PostMapping("/deleteUserByIds")
    BaseResponse deleteUserByIds(@RequestParam("list") String[] list) {
        if (userService.deleteUserByIds(list)) {
            return ResponseBuilder.makeSuccessAction();
        } else {
            return ResponseBuilder.makeAction(ResponseModel.Delete_Error);
        }
    }
}
