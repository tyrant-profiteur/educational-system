package com.tyrant.educational.enums;

/**
 * @author:profiteur
 * @create 2021-10-13 22:06
 * @description 业务错误枚举类
 **/
public enum BusinessErrorCodeEnum {

    /**
     * 要发放的优惠券不存在
     */
    COUPON_NOT_EXISTS(599, "优惠券id不存在，无法发放"),

    /**
     * 该订单已经评论
     */
    CANT_COMMENT(598, "该订单已经评论，无法再评论"),

    /**
     * 当前订单状态无法完成
     */
    ORDER_CANT_FINISHED(597, "当前订单状态无法完成"),

    /**
     * 当前订单状态无法取消
     */
    ORDER_CANT_CANCEL(596, "当前订单状态无法取消"),

    /**
     * 积分不足
     */
    CREDITS_NOT_ENOUGH(595, "下单失败，积分不足"),

    /**
     * 参数不能为空
     */
    PARAMETER_NOT_EMPTY(594, "参数不能为空"),

    /**
     * 未知时间格式
     */
    UNKNOWN_DATE_FORMAT(593, "未知时间格式"),

    /**
     * 当前订单状态无法支付
     */
    ORDER_CANT_PAID(592, "当前订单状态无法支付"),

    /**
     * 参数校验失败
     */
    PARAMETER_VALIDATED_FAILED(591, "参数校验失败"),

    ;

    private Integer code;

    private String msg;

    BusinessErrorCodeEnum(Integer code, String msg) {
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