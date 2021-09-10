package com.kq.dao.test;

import com.kq.dao.BlogMapper;
import com.kq.pojo.Blog;
import com.kq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class Test {


    @org.junit.Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//       new java.util.Date(System.currentTimeMillis() 获取时间
        int i = mapper.addBlog(new Blog(1, "你好", "kq",new Date(), 666));
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }


    @org.junit.Test
    public void queryBlogByIF(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
//        hashMap.put("title","简单");//添加title属性
        hashMap.put("author","zkq");//添加作者属性
        List<Blog> blogs = mapper.queryBlogByIF(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();

    }

    @org.junit.Test
    public void queryBlogByChoose(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("views","666");
        List<Blog> blogs = mapper.queryBlogByChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("author","zk");
        map.put("id",3);
        int i = mapper.updateBlog(map);
//        int i = mapper.updateBlog(new Blog(3, null, "zkq", new Date(), null));
        sqlSession.commit();
        sqlSession.close();
/*        Blog blog = new Blog();
        blog.setAuthor("zkq");
        blog.setId(3);*/
    }


    @org.junit.Test
    public void query123(){
        SqlSession sqlSession = MybatisUtils.sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(3);
        integers.add(1);
        hashMap.put("ids",integers);
        hashMap.put("id",1);
        List<Blog> blogs = mapper.query123(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
