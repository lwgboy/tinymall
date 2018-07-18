package com.menethil.tinymall.db.dao;

import com.menethil.tinymall.db.domain.TinymallCategory;
import com.menethil.tinymall.db.domain.TinymallCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    long countByExample(TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int insert(TinymallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int insertSelective(TinymallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallCategory selectOneByExample(TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallCategory selectOneByExampleSelective(@Param("example") TinymallCategoryExample example, @Param("selective") TinymallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TinymallCategory> selectByExampleSelective(@Param("example") TinymallCategoryExample example, @Param("selective") TinymallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    List<TinymallCategory> selectByExample(TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallCategory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    TinymallCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallCategory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallCategory record, @Param("example") TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallCategory record, @Param("example") TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TinymallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}