package cn.wyb.personal.bootes.service;

import static org.junit.Assert.*;

import cn.wyb.personal.bootes.BootEsApplicationTests;
import cn.wyb.personal.bootes.model.po.TbSpuManagePO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ItemServiceTest : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/5/8 9:08
 */
public class ItemServiceTest extends BootEsApplicationTests {

  @Autowired
  private ItemService itemService;

  @Test
  public void testinsert(){
    TbSpuManagePO spuManagePO = new TbSpuManagePO();
    spuManagePO.setSpucode("");
    spuManagePO.setWarehouseCode("QQSK");
    Integer spuId = itemService.addSpu(spuManagePO);
  }

}