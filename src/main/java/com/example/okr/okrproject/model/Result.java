package com.example.okr.okrproject.model;


public class Result {

    private int code;//返回code
    private String Esg;//返回信息
    private String result;//成功 失败
    private Object resultEntity;//成功 失败
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEsg() {
        return Esg;
    }

    public void setEsg(String esg) {
        Esg = esg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getResultEntity() {
        return resultEntity;
    }

    public void setResultEntity(Object resultEntity) {
        this.resultEntity = resultEntity;
    }
}
