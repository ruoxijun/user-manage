package top.ruoxijun.utils.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultEnum {

    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    ;

    private final Integer code;
    private final String msg;

}
