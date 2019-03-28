package top.catalinali.seckill.exception;

import top.catalinali.seckill.result.CodeMsg;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:10 2019/3/27
 * @Modefied by:
 */
public class GlobalException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }

}
