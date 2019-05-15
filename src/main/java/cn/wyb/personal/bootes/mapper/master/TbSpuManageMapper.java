package cn.wyb.personal.bootes.mapper.master;

import cn.wyb.personal.bootes.model.po.TbSpuManagePO;
import org.springframework.stereotype.Component;

@Component
public interface TbSpuManageMapper {

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