package com.ssm.cluster.dao;

import com.ssm.cluster.entity.Article;
import java.util.List;
import java.util.Map;

/**
 * @author 13
 * @date 2018-02-11 13:39:08
 */
public interface ArticleDao {
    /**
     * 返回相应的数据集合
     *
     * @param map
     * @return
     */
    List<Article> findArticles(Map<String, Object> map);

    /**
     * 数据数目
     *
     * @param map
     * @return
     */
    int getTotalArticles(Map<String, Object> map);

    /**
     * 添加文章
     *
     * @return
     */
    int insertArticle(Article article);

    /**
     * 修改文章
     *
     * @return
     */
    int updArticle(Article article);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delArticle(Integer id);

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    Article getArticleById(Integer id);

    /**
     * 批量删除
     * @param id
     * @return
     */
    int deleteBatch(Object[] id);
}
