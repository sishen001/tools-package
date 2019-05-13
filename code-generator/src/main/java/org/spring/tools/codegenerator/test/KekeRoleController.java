package org.spring.tools.codegenerator.test;
import org.spring.tools.codegenerator.test.KekeRole;
import org.spring.tools.codegenerator.test.KekeRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.spring.tools.codegenerator.vo.Result;
import org.spring.tools.codegenerator.vo.Page;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 *
 * Created by fenglibin on 2019/05/13.
 */
@Controller
@RequestMapping("/kekeRole/")
public class KekeRoleController {

    @Autowired
KekeRoleService kekeRoleService;

        @RequestMapping("selectAll")
    @ResponseBody
    public Result<List<KekeRole>> selectAll(){
        return Result.success(kekeRoleService.selectAll());
    }

        @RequestMapping("select")
    @ResponseBody
    public Result<KekeRole> selectByPrimaryKey(Integer id){
        return Result.success(kekeRoleService.selectByPrimaryKey(id));
    }

        @RequestMapping("selectByCondition")
    @ResponseBody
    public Result<List<KekeRole>> selectByCondition(KekeRole record){
        return Result.success(kekeRoleService.selectByCondition(record));
    }

        @RequestMapping("count")
    @ResponseBody
    public Result<Integer> count(KekeRole record){
        return Result.success(kekeRoleService.count(record));
    }

        @RequestMapping("insert")
    @ResponseBody
    public Result<Integer> insertSelective(KekeRole record){
        return Result.success(kekeRoleService.insertSelective(record));
    }

        @RequestMapping("update")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeySelective(KekeRole record){
        return Result.success(kekeRoleService.updateByPrimaryKeySelective(record));
    }

        @RequestMapping("selectByPage")
    @ResponseBody
    public Result<Page<List<KekeRole>>> selectByPage(Page<KekeRole> page){
        List<KekeRole> list = null;
        page = page.sequentialDisplayCalculate(kekeRoleService.count(page.getObj()));
        if (page.getTotalCount() > 0) {
            list = kekeRoleService.selectByPage(page);
        }
        Page<List<KekeRole>> result = new Page<List<KekeRole>>(page, list);
        return Result.success(result);
    }

        @RequestMapping("deleteByCondition")
    @ResponseBody
    public Result<Integer> deleteByCondition(KekeRole record){
        return Result.success(kekeRoleService.deleteByCondition(record));
    }

        @RequestMapping("delete")
    @ResponseBody
    public Result<Integer> deleteByPrimaryKey(Integer id){
        return Result.success(kekeRoleService.deleteByPrimaryKey(id));
    }

        @RequestMapping("updateByPrimaryKeyWithBLOBs")
    @ResponseBody
    public Result<Integer> updateByPrimaryKeyWithBLOBs(KekeRole record){
        return Result.success(kekeRoleService.updateByPrimaryKeyWithBLOBs(record));
    }

}