package org.spring.tools.codegenerator.util;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.CaseFormat;
import org.spring.tools.codegenerator.service.CodeGeneratorConfig;
import org.spring.tools.codegenerator.vo.Page;
import org.spring.tools.codegenerator.vo.Result;

import static javafx.css.StyleOrigin.AUTHOR;

/** 
 * ClassName:DataUtil <br/> 
 * Date:     2018年10月22日 下午6:05:05 <br/> 
 * @author   fenglibin1982@163.com
 * @Blog     http://blog.csdn.net/fenglibing
 * @version  
 * @see       
 */
public class DataUtil extends CodeGeneratorConfig {
    /**
     * 预置页面所需数据
     * 
     * @param tableName 表名
     * @param modelName 自定义实体类名, 为null则默认将表名下划线转成大驼峰形式
     * @param modelNameUpperCamel 首字为大写的实体类名
     * @return
     */
    public static Map<String, Object> getDataMapInit(String tableName, String modelName, String modelNameUpperCamel) {
        Map<String, Object> data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        data.put("tableName", tableName);
        data.put("baseRequestMapping", StringUtils.toLowerCaseFirstOne(modelNameUpperCamel));
        data.put("modelNameUpperCamel", modelNameUpperCamel);
        data.put("modelNameLowerCamel", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, modelNameUpperCamel));
        data.put("servicePackage", SERVICE_PACKAGE);
        data.put("modelPackage", MODEL_PACKAGE);
        data.put("controllerPackage", CONTROLLER_PACKAGE);
        data.put("mapperPackage", MAPPER_PACKAGE);
        data.put("pageClassPath", Page.class.getName());
        data.put("resultClassPath", Result.class.getName());
        return data;
    }
}