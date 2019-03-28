package top.catalinali.seckill.validator;

import org.apache.commons.lang3.StringUtils;
import top.catalinali.seckill.util.ValidatorUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:29 2019/3/21
 * @Modefied by:
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;

    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(required) {
            return ValidatorUtil.isMobile(value);
        }else {
            if(StringUtils.isEmpty(value)) {
                return true;
            }else {
                return ValidatorUtil.isMobile(value);
            }
        }
    }

}
