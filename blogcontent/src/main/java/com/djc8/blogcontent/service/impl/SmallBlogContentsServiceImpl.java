package com.djc8.blogcontent.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.djc8.blogcontent.mapper.SmallBlogContentsMapper;
import com.djc8.blogcontent.domain.SmallBlogContents;
import com.djc8.blogcontent.service.ISmallBlogContentsService;

/**
 * blog主体内容Service业务层处理
 *
 * @author djc8
 * @date 2021-09-12
 */
@Service
public class SmallBlogContentsServiceImpl implements ISmallBlogContentsService
{
    @Autowired
    private SmallBlogContentsMapper smallBlogContentsMapper;

    /**
     * 查询blog主体内容
     *
     * @param blogCid blog主体内容主键
     * @return blog主体内容
     */
    @Override
    public SmallBlogContents selectSmallBlogContentsByBlogCid(Integer blogCid)
    {
        return smallBlogContentsMapper.selectSmallBlogContentsByBlogCid(blogCid);
    }

    /**
     * 查询blog主体内容列表
     *
     * @param smallBlogContents blog主体内容
     * @return blog主体内容
     */
    @Override
    public List<SmallBlogContents> selectSmallBlogContentsList(SmallBlogContents smallBlogContents)
    {
        return smallBlogContentsMapper.selectSmallBlogContentsList(smallBlogContents);
    }

    /**
     * 新增blog主体内容
     *
     * @param smallBlogContents blog主体内容
     * @return 结果
     */
    @Override
    public int insertSmallBlogContents(SmallBlogContents smallBlogContents)
    {
        return smallBlogContentsMapper.insertSmallBlogContents(smallBlogContents);
    }

    /**
     * 修改blog主体内容
     *
     * @param smallBlogContents blog主体内容
     * @return 结果
     */
    @Override
    public int updateSmallBlogContents(SmallBlogContents smallBlogContents)
    {
        return smallBlogContentsMapper.updateSmallBlogContents(smallBlogContents);
    }

    /**
     * 批量删除blog主体内容
     *
     * @param blogCids 需要删除的blog主体内容主键
     * @return 结果
     */
    @Override
    public int deleteSmallBlogContentsByBlogCids(Integer[] blogCids)
    {
        return smallBlogContentsMapper.deleteSmallBlogContentsByBlogCids(blogCids);
    }

    /**
     * 删除blog主体内容信息
     *
     * @param blogCid blog主体内容主键
     * @return 结果
     */
    @Override
    public int deleteSmallBlogContentsByBlogCid(Integer blogCid)
    {
        return smallBlogContentsMapper.deleteSmallBlogContentsByBlogCid(blogCid);
    }
}