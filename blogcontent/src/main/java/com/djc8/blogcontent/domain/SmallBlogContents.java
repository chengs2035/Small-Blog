package com.djc8.blogcontent.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * blog主体内容对象 small_blog_contents
 *
 * @author djc8
 * @date 2021-09-12
 */
public class SmallBlogContents extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer blogCid;

    /** 标题 */
    @Excel(name = "标题")
    private String blogTitle;

    /** 访问名 */
    @Excel(name = "访问名")
    private String blogSlug;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private Integer blogCreated;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private Integer blogModified;

    /** 主体内容 */
    @Excel(name = "主体内容")
    private String blogText;

    /** 排序编号 */
    @Excel(name = "排序编号")
    private Integer blogOrder;

    /** 模板id */
    @Excel(name = "模板id")
    private String blogTemplate;

    /** 主体类型 */
    @Excel(name = "主体类型")
    private String blogType;

    /** 主体状态 */
    @Excel(name = "主体状态")
    private String blogStatus;

    /** 密码 */
    @Excel(name = "密码")
    private String blogPassword;

    /** 评论数量 */
    @Excel(name = "评论数量")
    private Integer blogCommentsnum;

    /** 是否允许评论 */
    @Excel(name = "是否允许评论")
    private String blogAllowcomment;

    /** 是否允许feed */
    @Excel(name = "是否允许feed")
    private String blogAllowfeed;

    /** 所属分类 */
    @Excel(name = "所属分类")
    private Integer blogParent;

    /** 操作用户 */
    @Excel(name = "操作用户")
    private Long userId;

    public void setBlogCid(Integer blogCid)
    {
        this.blogCid = blogCid;
    }

    public Integer getBlogCid()
    {
        return blogCid;
    }
    public void setBlogTitle(String blogTitle)
    {
        this.blogTitle = blogTitle;
    }

    public String getBlogTitle()
    {
        return blogTitle;
    }
    public void setBlogSlug(String blogSlug)
    {
        this.blogSlug = blogSlug;
    }

    public String getBlogSlug()
    {
        return blogSlug;
    }
    public void setBlogCreated(Integer blogCreated)
    {
        this.blogCreated = blogCreated;
    }

    public Integer getBlogCreated()
    {
        return blogCreated;
    }
    public void setBlogModified(Integer blogModified)
    {
        this.blogModified = blogModified;
    }

    public Integer getBlogModified()
    {
        return blogModified;
    }
    public void setBlogText(String blogText)
    {
        this.blogText = blogText;
    }

    public String getBlogText()
    {
        return blogText;
    }
    public void setBlogOrder(Integer blogOrder)
    {
        this.blogOrder = blogOrder;
    }

    public Integer getBlogOrder()
    {
        return blogOrder;
    }
    public void setBlogTemplate(String blogTemplate)
    {
        this.blogTemplate = blogTemplate;
    }

    public String getBlogTemplate()
    {
        return blogTemplate;
    }
    public void setBlogType(String blogType)
    {
        this.blogType = blogType;
    }

    public String getBlogType()
    {
        return blogType;
    }
    public void setBlogStatus(String blogStatus)
    {
        this.blogStatus = blogStatus;
    }

    public String getBlogStatus()
    {
        return blogStatus;
    }
    public void setBlogPassword(String blogPassword)
    {
        this.blogPassword = blogPassword;
    }

    public String getBlogPassword()
    {
        return blogPassword;
    }
    public void setBlogCommentsnum(Integer blogCommentsnum)
    {
        this.blogCommentsnum = blogCommentsnum;
    }

    public Integer getBlogCommentsnum()
    {
        return blogCommentsnum;
    }
    public void setBlogAllowcomment(String blogAllowcomment)
    {
        this.blogAllowcomment = blogAllowcomment;
    }

    public String getBlogAllowcomment()
    {
        return blogAllowcomment;
    }
    public void setBlogAllowfeed(String blogAllowfeed)
    {
        this.blogAllowfeed = blogAllowfeed;
    }

    public String getBlogAllowfeed()
    {
        return blogAllowfeed;
    }
    public void setBlogParent(Integer blogParent)
    {
        this.blogParent = blogParent;
    }

    public Integer getBlogParent()
    {
        return blogParent;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("blogCid", getBlogCid())
                .append("blogTitle", getBlogTitle())
                .append("blogSlug", getBlogSlug())
                .append("blogCreated", getBlogCreated())
                .append("blogModified", getBlogModified())
                .append("blogText", getBlogText())
                .append("blogOrder", getBlogOrder())
                .append("blogTemplate", getBlogTemplate())
                .append("blogType", getBlogType())
                .append("blogStatus", getBlogStatus())
                .append("blogPassword", getBlogPassword())
                .append("blogCommentsnum", getBlogCommentsnum())
                .append("blogAllowcomment", getBlogAllowcomment())
                .append("blogAllowfeed", getBlogAllowfeed())
                .append("blogParent", getBlogParent())
                .append("userId", getUserId())
                .toString();
    }
}