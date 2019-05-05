package cn.wyb.personal.bootes.dao;

import cn.wyb.personal.bootes.model.po.TbSpuManagePO;

public interface TbSpuManagePOMapper {
    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer spuId);

    /**
     * @mbg.generated insert
     */
    int insert(TbSpuManagePO record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbSpuManagePO record);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbSpuManagePO selectByPrimaryKey(Integer spuId);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbSpuManagePO record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbSpuManagePO record);
}