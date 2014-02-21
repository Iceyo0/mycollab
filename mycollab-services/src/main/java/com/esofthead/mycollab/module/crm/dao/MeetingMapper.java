package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.MeetingExample;
import com.esofthead.mycollab.module.crm.domain.MeetingWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int countByExample(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int deleteByExample(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int insert(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int insertSelective(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    List<MeetingWithBLOBs> selectByExampleWithBLOBs(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    MeetingWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int updateByExampleSelective(@Param("record") MeetingWithBLOBs record, @Param("example") MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int updateByExampleWithBLOBs(@Param("record") MeetingWithBLOBs record, @Param("example") MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int updateByPrimaryKeySelective(MeetingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    Integer insertAndReturnKey(MeetingWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_meeting
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    void massUpdateWithSession(@Param("record") MeetingWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}