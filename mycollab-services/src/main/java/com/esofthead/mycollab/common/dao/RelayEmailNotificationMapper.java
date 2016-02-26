/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.common.dao;

import com.esofthead.mycollab.common.domain.RelayEmailNotificationExample;
import com.esofthead.mycollab.common.domain.RelayEmailNotificationWithBLOBs;
import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface RelayEmailNotificationMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int countByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int deleteByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int insert(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int insertSelective(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    List<RelayEmailNotificationWithBLOBs> selectByExampleWithBLOBs(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    RelayEmailNotificationWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByExampleSelective(@Param("record") RelayEmailNotificationWithBLOBs record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") RelayEmailNotificationWithBLOBs record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByPrimaryKeySelective(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(RelayEmailNotificationWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    Integer insertAndReturnKey(RelayEmailNotificationWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbggenerated Fri Feb 26 17:26:49 ICT 2016
     */
    void massUpdateWithSession(@Param("record") RelayEmailNotificationWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}