package com.djc8.blogcontent.mapper;

import java.util.List;
import com.djc8.blogcontent.domain.SmallBlogContents;

/**
 * blog主体内容Mapper接口
 *
 * @author djc8
 * @date 2021-09-12
 */
public interface SmallBlogContentsMapper
{
    /**
     * 查询blog主体内容
     *
     * @param blogCid blog主体内容主键
     * @return blog主体内容
     */
    public SmallBlogContents selectSmallBlogContentsByBlogCid(Integer blogCid);

    /**
     * 查询blog主体内容列表
     *
     * @param smallBlogContents blog主体内容
     * @return blog主体内容集合
     */
    public List<SmallBlogContents> selectSmallBlogContentsList(SmallBlogContents smallBlogContents);

    /**
     * 新增blog主体内容
     *
     * @param smallBlogContents blog主体内容
     * @return 结果
     */
    public int insertSmallBlogContents(SmallBlogContents smallBlogContents);

    /**
     * 修改blog主体内容
     *
     * @param smallBlogContents blog主体内容
     * @return 结果
     */
    public int updateSmallBlogContents(SmallBlogContents smallBlogContents);

    /**
     * 删除blog主体内容
     *
     * @param blogCid blog主体内容主键
     * @return 结果
     */
    public int deleteSmallBlogContentsByBlogCid(Integer blogCid);

    /**
     * 批量删除blog主体内容
     *
     * @param blogCids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSmallBlogContentsByBlogCids(Integer[] blogCids);
}