package com.kq.dao;

import com.kq.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    /**
     * 插入数据
     * @param blog
     * @return
     */
    int addBlog(Blog blog);

    /**
     * 通过传入Map完成拼接查询
     * @param map
     * @return
     */
    List<Blog> queryBlogByIF(Map map);

    /**
     * 通过传入Map完成拼接Choose查询
     * @param map
     * @return
     */
    List<Blog> queryBlogByChoose(Map map);

    int updateBlog(Map map);

    List<Blog> query123(Map map);
}
