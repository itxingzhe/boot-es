package cn.wyb.personal.bootes.model.vo;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * ItemEsVO : 商品ES对应实体类.
 *
 * @author : wangyibin
 * @date : 2019/5/5 19:18
 */
@Document(indexName = "goods", type = "json")
public class ItemEsVO implements Serializable {

  /**
   * 主键
   */
  @Id
  private Integer spuId;

  /**
   * spucode编码 (唯一)
   */
  @Field(type = FieldType.Text,analyzer = "ik_max_word")
  private String spucode;

  /**
   * 商品名称
   */
  @Field(type = FieldType.Text,analyzer = "ik_max_word")
  private String spuname;

  /**
   * map<属性名,属性值> 的json串
   */
  @Field(type = FieldType.Keyword)
  private String propertys;

  /**
   * 产品标题(适用于全局搜索)
   */
  @Field(type = FieldType.Text,analyzer = "ik_max_word")
  private String spuTitle;

  /**
   * 5张商品图
   */
  @Field(type = FieldType.Keyword)
  private String imagesUrls;

  /**
   * 产品简介/亮点
   */
  @Field(type = FieldType.Keyword)
  private String spuSimpleDesc;


  /**
   * 最大原价
   */
  @Field(type = FieldType.Long)
  private Long originalPriceMax;

  /**
   * 原价
   */
  @Field(type = FieldType.Long)
  private Long originalPriceMin;

  public Integer getSpuId() {
    return spuId;
  }

  public void setSpuId(Integer spuId) {
    this.spuId = spuId;
  }

  public String getSpucode() {
    return spucode;
  }

  public void setSpucode(String spucode) {
    this.spucode = spucode;
  }

  public String getSpuname() {
    return spuname;
  }

  public void setSpuname(String spuname) {
    this.spuname = spuname;
  }

  public String getPropertys() {
    return propertys;
  }

  public void setPropertys(String propertys) {
    this.propertys = propertys;
  }

  public String getSpuTitle() {
    return spuTitle;
  }

  public void setSpuTitle(String spuTitle) {
    this.spuTitle = spuTitle;
  }

  public String getImagesUrls() {
    return imagesUrls;
  }

  public void setImagesUrls(String imagesUrls) {
    this.imagesUrls = imagesUrls;
  }

  public String getSpuSimpleDesc() {
    return spuSimpleDesc;
  }

  public void setSpuSimpleDesc(String spuSimpleDesc) {
    this.spuSimpleDesc = spuSimpleDesc;
  }

  public Long getOriginalPriceMax() {
    return originalPriceMax;
  }

  public void setOriginalPriceMax(Long originalPriceMax) {
    this.originalPriceMax = originalPriceMax;
  }

  public Long getOriginalPriceMin() {
    return originalPriceMin;
  }

  public void setOriginalPriceMin(Long originalPriceMin) {
    this.originalPriceMin = originalPriceMin;
  }
}
