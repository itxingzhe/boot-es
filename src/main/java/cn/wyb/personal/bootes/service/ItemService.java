package cn.wyb.personal.bootes.service;

import cn.wyb.personal.bootes.model.po.TbSpuManagePO;

/**
 * ItemService : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/5/5 19:50
 */
public interface ItemService {

  TbSpuManagePO selectById(Integer id);

  Integer addSpu(TbSpuManagePO spuManagePO);
}
