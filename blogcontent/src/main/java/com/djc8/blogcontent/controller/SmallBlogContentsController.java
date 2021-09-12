package com.djc8.blogcontent.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.PreAuthorize;
import com.djc8.blogcontent.domain.SmallBlogContents;
import com.djc8.blogcontent.service.ISmallBlogContentsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * blog主体内容Controller
 *
 * @author djc8
 * @date 2021-09-12
 */
@RestController
@RequestMapping("/blogcontent")
public class SmallBlogContentsController extends BaseController
{
    @Autowired
    private ISmallBlogContentsService smallBlogContentsService;

    /**
     * 查询blog主体内容列表
     */
    @PreAuthorize(hasPermi = "blogcontent:blogcontent:list")
    @GetMapping("/list")
    public TableDataInfo list(SmallBlogContents smallBlogContents)
    {
        startPage();
        List<SmallBlogContents> list = smallBlogContentsService.selectSmallBlogContentsList(smallBlogContents);
        return getDataTable(list);
    }

    /**
     * 导出blog主体内容列表
     */
    @PreAuthorize(hasPermi = "blogcontent:blogcontent:export")
    @Log(title = "blog主体内容", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SmallBlogContents smallBlogContents) throws IOException
    {
        List<SmallBlogContents> list = smallBlogContentsService.selectSmallBlogContentsList(smallBlogContents);
        ExcelUtil<SmallBlogContents> util = new ExcelUtil<SmallBlogContents>(SmallBlogContents.class);
        util.exportExcel(response, list, "blog主体内容数据");
    }

    /**
     * 获取blog主体内容详细信息
     */
    @PreAuthorize(hasPermi = "blogcontent:blogcontent:query")
    @GetMapping(value = "/{blogCid}")
    public AjaxResult getInfo(@PathVariable("blogCid") Integer blogCid)
    {
        return AjaxResult.success(smallBlogContentsService.selectSmallBlogContentsByBlogCid(blogCid));
    }

    /**
     * 新增blog主体内容
     */
    @PreAuthorize(hasPermi = "blogcontent:blogcontent:add")
    @Log(title = "blog主体内容", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SmallBlogContents smallBlogContents)
    {
        return toAjax(smallBlogContentsService.insertSmallBlogContents(smallBlogContents));
    }

    /**
     * 修改blog主体内容
     */
    @PreAuthorize(hasPermi = "blogcontent:blogcontent:edit")
    @Log(title = "blog主体内容", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SmallBlogContents smallBlogContents)
    {
        return toAjax(smallBlogContentsService.updateSmallBlogContents(smallBlogContents));
    }

    /**
     * 删除blog主体内容
     */
    @PreAuthorize(hasPermi = "blogcontent:blogcontent:remove")
    @Log(title = "blog主体内容", businessType = BusinessType.DELETE)
    @DeleteMapping("/{blogCids}")
    public AjaxResult remove(@PathVariable Integer[] blogCids)
    {
        return toAjax(smallBlogContentsService.deleteSmallBlogContentsByBlogCids(blogCids));
    }
}