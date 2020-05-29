package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Books;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-05-26
 */
public interface IBooksService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Books selectBooksById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param books 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Books> selectBooksList(Books books);

    /**
     * 新增【请填写功能名称】
     *
     * @param books 【请填写功能名称】
     * @return 结果
     */
    public int insertBooks(Books books);

    /**
     * 修改【请填写功能名称】
     *
     * @param books 【请填写功能名称】
     * @return 结果
     */
    public int updateBooks(Books books);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBooksByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBooksById(String id);
}
