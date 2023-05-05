package doWork.dto;

import java.io.Serializable;

public class TeemoResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;
    private boolean success;



    public static <T> TeemoResponse<T> ofSuccess(T data) {
        return (new TeemoResponse()).setSuccess(true).setMessage("success").setData(data);
    }

    public static <T> TeemoResponse<T> ofSuccess() {
        return (new TeemoResponse()).setSuccess(true).setMessage("success");
    }

    public static <T> TeemoResponse<T> ofSuccessMsg(String msg) {
        return (new TeemoResponse()).setSuccess(true).setMessage(msg);
    }

    public static <T> TeemoResponse<T> ofFail(int code, String msg) {
        TeemoResponse<T> result = new TeemoResponse();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static <T> TeemoResponse<T> ofFail(String msg) {
        TeemoResponse<T> result = new TeemoResponse();
        result.setSuccess(false);
        result.setCode(1);
        result.setMessage(msg);
        return result;
    }

    public static <T> TeemoResponse<T> ofFail() {
        TeemoResponse<T> result = new TeemoResponse();
        result.setSuccess(false);
        result.setCode(1);
        result.setMessage("fail");
        return result;
    }

    public Integer getCode() {
        return this.code;
    }

    public TeemoResponse<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public TeemoResponse<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public TeemoResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public TeemoResponse<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }
}
