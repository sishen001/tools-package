package org.spring.tools.codegenerator.main;


import org.spring.tools.codegenerator.service.CodeGeneratorManager;

/**
 * 代码生成器启动项 <br>
 * Created by zhh at 2017/09/20.
 * Modified by fenglibin@gmail.com at 2018/10/24
 */
public class CodeGeneratorMain {

    /**
     * table name support singer string table name with or without underline such "table","my_table" etc.<br>
     * other style not tested
     */
    private static final String TABLE = "sites";

    public static void main(String[] args) {
        CodeGeneratorManager cgm = new CodeGeneratorManager();
        cgm.genCode(TABLE);
        // cgm.genCode(TABLE,TABLE);
    }
}
