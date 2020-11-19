package com.example.okr.okrproject.util;

import com.example.okr.okrproject.model.Result;

public class ResultUtil {
    private ResultUtil resultUtil = null;
    private ResultUtil(){};

    /**
     * 返回成功案例
     * @param esg
     * @return
     */
    public static Result SuccessResult(String esg,Object resultEntity){
        Result result  = new Result();
        result.setCode(200);
        result.setEsg(esg);
        result.setResult("success");
        result.setResultEntity(resultEntity);
        return result;
    }

    /**
     * 返回失败案例
     * @param esg
     * @return
     */
    public static Result FailedResult(String esg){
        Result result  = new Result();
        result.setCode(400);
        result.setEsg(esg);

        result.setResult("failed");
        return result;
    }

    /**
     * 返回失败案例
     * @param esg
     * @return
     */
    public static Result ErrorResult(){
        Result result  = new Result();
        result.setCode(500);
        result.setEsg("服务器错误，请确认请求数据后，联系管理员");
        result.setResult("failed");
        return result;
    }

}
