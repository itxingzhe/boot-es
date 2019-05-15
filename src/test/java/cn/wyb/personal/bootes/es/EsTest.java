package cn.wyb.personal.bootes.es;

import cn.wyb.personal.bootes.BootEsApplicationTests;
import cn.wyb.personal.bootes.model.po.TbSpuManagePO;
import cn.wyb.personal.bootes.model.vo.ItemEsVO;
import cn.wyb.personal.bootes.service.ItemService;
import java.util.ArrayList;
import org.assertj.core.util.Lists;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

/**
 * EsTest : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/5/5 19:38
 */
public class EsTest extends BootEsApplicationTests {

  @Autowired
  private ElasticsearchTemplate elasticsearchTemplate;
  @Autowired
  private ItemService itemService;
  @Autowired
  private ItemRepository itemRepository;

  @Test
  public void testCreateIndex() {
    boolean index = elasticsearchTemplate.createIndex(ItemEsVO.class);
    System.out.println(index);
  }

  @Test
  public void testDeleteIndex() {
    boolean index = elasticsearchTemplate.deleteIndex(ItemEsVO.class);
    System.out.println(index);
  }

  @Test
  public void testAddItem() {
    TbSpuManagePO tbSpuManagePO = itemService.selectById(3607);
    ItemEsVO itemEsVO = new ItemEsVO();
    BeanUtils.copyProperties(tbSpuManagePO, itemEsVO);
    ItemEsVO save = itemRepository.save(itemEsVO);
    System.out.println(save.toString());
  }

  @Test
  public void testAddItemList() {
    Integer[] spuIds = new Integer[]{3607, 3619, 3663, 3668, 3678, 4140, 4272, 4277, 4611, 5561,
        5562, 8453, 8454, 8455, 8456, 8457, 8458, 9353, 9414};
    Integer[] y = new Integer[]{230, 292, 308, 384, 388, 389, 390, 391, 392, 393, 394, 395, 513,
        514, 515, 516, 517, 518, 519, 520, 521, 522, 523};
    spuIds = y;
    ArrayList<ItemEsVO> items = Lists.newArrayList();
    for (int i = 0; i < spuIds.length; i++) {
      TbSpuManagePO tbSpuManagePO = itemService.selectById(spuIds[i]);
      ItemEsVO itemEsVO = new ItemEsVO();
      BeanUtils.copyProperties(tbSpuManagePO, itemEsVO);
      items.add(itemEsVO);
    }
    itemRepository.saveAll(items);
    System.out.println(spuIds);
  }

  @Test
  public void testselectItem() {
    NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
    queryBuilder.withFilter(QueryBuilders.matchPhrasePrefixQuery("spuname", "大公鸡"));
    Page<ItemEsVO> search = itemRepository.search(queryBuilder.build());
    System.out.println(search);
  }

  @Test
  public void testDeleteItem() {
    Integer spuId = 33;
    itemRepository.deleteById(spuId);
    System.out.println("");
  }

}
