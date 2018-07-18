package com.menethil.tinymall.db.dao;

import com.menethil.tinymall.db.domain.TinymallOrder;
import com.menethil.tinymall.db.domain.TinymallOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    long countByExample(TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int insert(TinymallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int insertSelective(TinymallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallOrder selectOneByExample(TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallOrder selectOneByExampleSelective(@Param("example") TinymallOrderExample example, @Param("selective") TinymallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TinymallOrder> selectByExampleSelective(@Param("example") TinymallOrderExample example, @Param("selective") TinymallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    List<TinymallOrder> selectByExample(TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    TinymallOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallOrder selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallOrder record, @Param("example") TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallOrder record, @Param("example") TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TinymallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}