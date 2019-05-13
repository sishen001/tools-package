package org.spring.tools.codegenerator.service;

/**
 * 主要逻辑接口
 */
public interface CodeGenerator {
	
	/**
	 * 代码生成主要逻辑
	 * @param tableName 表名
	 */
	void genCode(String tableName);
}