package cn.wyb.personal.bootes.es;

import cn.wyb.personal.bootes.model.vo.ItemEsVO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * ItemRepository : (请描述该类).
 *
 * @author : wangyibin
 * @date : 2019/5/5 19:46
 */
public interface ItemRepository extends ElasticsearchRepository<ItemEsVO,Integer> {

}
