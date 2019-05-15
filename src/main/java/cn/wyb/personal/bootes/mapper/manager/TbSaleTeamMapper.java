package cn.wyb.personal.bootes.mapper.manager;

import cn.wyb.personal.bootes.model.po.TbSaleTeamPO;

public interface TbSaleTeamMapper {
    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(String userUuid);

    /**
     * @mbg.generated insert
     */
    int insert(TbSaleTeamPO record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbSaleTeamPO record);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbSaleTeamPO selectByPrimaryKey(String userUuid);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbSaleTeamPO record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbSaleTeamPO record);
}