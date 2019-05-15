package cn.wyb.personal.bootes.service.impl;

import cn.wyb.personal.bootes.mapper.master.TbSpuManageMapper;
import cn.wyb.personal.bootes.model.po.TbSpuManagePO;
import cn.wyb.personal.bootes.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ItemServiceImpl : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/5/5 19:50
 */
@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  private TbSpuManageMapper tbSpuManageMapper;

  @Override
  public TbSpuManagePO selectById(Integer id) {
    return tbSpuManageMapper.selectByPrimaryKey(id);
  }

  @Override
  public Integer addSpu(TbSpuManagePO spuManagePO) {
    return tbSpuManageMapper.insertSelective(spuManagePO);
  }
}
