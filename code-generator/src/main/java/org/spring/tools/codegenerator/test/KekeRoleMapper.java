package org.spring.tools.codegenerator.test;

import java.util.List;
import org.spring.tools.codegenerator.test.KekeRole;
import org.spring.tools.codegenerator.vo.Page;

public interface KekeRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KekeRole record);

    int insertSelective(KekeRole record);

    KekeRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KekeRole record);

    int updateByPrimaryKeyWithBLOBs(KekeRole record);

    int updateByPrimaryKey(KekeRole record);

    List<KekeRole> selectByCondition(KekeRole record);

    List<KekeRole> selectAll();

    List<KekeRole> selectByPage(Page page);

    Integer count(KekeRole record);

    int deleteByCondition(KekeRole record);
}