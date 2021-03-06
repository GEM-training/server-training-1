package com.gem.nhom1.model.dto;

/**
 * Created by vanhop on 1/28/16.
 */
public class ResponseDTO {

    private String status;
    private String message;
    private Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
