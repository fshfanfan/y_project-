package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BooksMapper;
import com.ruoyi.system.domain.Books;
import com.ruoyi.system.service.IBooksService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-05-26
 */
@Service
public class BooksServiceImpl implements IBooksService 
{
    @Autowired
    private BooksMapper booksMapper;

    public void selectBooksCategory(){

    }

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Books selectBooksById(String id)
    {
        return booksMapper.selectBooksById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param books 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Books> selectBooksList(Books books)
    {
        return booksMapper.selectBooksList(books);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param books 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBooks(Books books)
    {
        return booksMapper.insertBooks(books);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param books 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBooks(Books books)
    {
        return booksMapper.updateBooks(books);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBooksByIds(String ids)
    {
        return booksMapper.deleteBooksByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBooksById(String id)
    {
        return booksMapper.deleteBooksById(id);
    }
}
