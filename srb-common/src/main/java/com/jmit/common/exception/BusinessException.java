package com.jmit.common.exception;

import com.jmit.common.result.ResponseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BusinessException extends RuntimeException {

    //状态码
    private Integer code;

    //错误消息
    private String message;

    public BusinessException(ResponseEnum responseEnum) {
        this.code =ResponseEnum.BORROW_AMOUNT_NULL_ERROR.getCode();
        this.message = ResponseEnum.BORROW_AMOUNT_NULL_ERROR.getMessage();
    }
}