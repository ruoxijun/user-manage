package top.ruoxijun.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

    public Result(ResultEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Result<T> code(Integer c){
        this.code = c;
        return this;
    }
    public Result<T> msg(String m){
        this.msg = m;
        return this;
    }
    public Result<T> data(T d){
        this.data = d;
        return this;
    }
    public Result<T> setCodeAndMsg(ResultEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        return this;
    }
    public Result<T> setCodeAndMsg(Integer code, String msg){
        this.code = code;
        this.msg = msg;
        return this;
    }

    public static Result success(){
        return new Result<>(ResultEnum.SUCCESS);
    }
    public static Result success(Object data){
        Result result = new Result<>(ResultEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result fail(){
        return new Result<>(ResultEnum.FAIL);
    }
    public static Result fail(Object data){
        Result result = new Result<>(ResultEnum.FAIL);
        result.setData(data);
        return result;
    }

    public static Result result(){
        return new Result<>();
    }
    public static Result result(Integer code){
        Result result = new Result<>();
        result.setCode(code);
        return result;
    }
    public static Result result(String msg){
        Result result = new Result<>();
        result.setMsg(msg);
        return result;
    }
    public static Result result(Integer code, String msg){
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    public static Result result(Integer code, String msg, Object data){
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result enumResult(ResultEnum resultEnum){
        return new Result<>(resultEnum);
    }
    public static Result enumResult(ResultEnum resultEnum, Object data){
        Result result = new Result<>(resultEnum);
        result.setData(data);
        return result;
    }

}
