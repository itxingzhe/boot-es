package cn.wyb.personal.bootes.model.po;

import java.util.Date;

/**
 * TABLE null
 */
public class TbSpuManagePO {

  /**
   * 主键
   */
  private Integer spuId;

  /**
   * spucode编码 (唯一)
   */
  private String spucode;

  /**
   * 商品名称
   */
  private String spuname;

  /**
   * map<属性名,属性值> 的json串
   */
  private String propertys;

  /**
   * 产品标题(适用于全局搜索)
   */
  private String spuTitle;

  /**
   * 视频地址
   */
  private String spuVideo;

  /**
   * 5张商品图
   */
  private String imagesUrls;

  /**
   * 产品简介/亮点
   */
  private String spuSimpleDesc;

  /**
   * 产品描述(详情)
   */
  private String spuDesc;

  /**
   * 品牌id(用于商品绑定)
   */
  private Integer brandId;

  /**
   * 头部描述
   */
  private String upDesc;

  /**
   * 所属类目id
   */
  private Integer categoryId;

  /**
   * 尾部描述
   */
  private String downDesc;

  /**
   * 热门标签-未使用
   */
  private Integer tagId;

  /**
   * 上架时间
   */
  private Date listStartTime;

  /**
   * 下架时间
   */
  private Date listStopTime;

  /**
   * 原产地
   */
  private String countryName;

  /**
   * 最小价格
   */
  private Long minPrice;

  /**
   * 最大价格
   */
  private Long maxPrice;

  /**
   * 最低活动价
   */
  private Long minPriceActivity;

  /**
   * 最高活动价
   */
  private Long maxPriceActivity;

  /**
   * 是否是赠品 0-不是 1-是
   */
  private Byte isGift;

  /**
   * 创建时间
   */
  private Date gmtCreate;

  /**
   * 修改时间
   */
  private Date gmtModified;

  /**
   * 渠道: 'ALL','WEB','APP'
   */
  private String salesChannel;

  /**
   * 权重
   */
  private Integer spuWeight;

  /**
   * 状态:0-未发布,1-已发布,2-废除
   */
  private Byte spuStatus;

  /**
   *
   */
  private Byte isSearch;

  /**
   * 最大原价
   */
  private Long originalPriceMax;

  /**
   * 原价
   */
  private Long originalPriceMin;

  /**
   * 仓库编码
   */
  private String warehouseCode;

  /**
   * 是否需要缴税 0-无,1-包税,2-保税
   */
  private Byte ferme;

  /**
   * 税率
   */
  private String rate;

  /**
   * 总销售量 默认0
   */
  private Integer allSoldNum;

  /**
   * spu可销售库存总量  默认0
   */
  private Integer allStockNumber;

  /**
   * 总活动可销售库存 默认0
   */
  private Integer allStockNumberActivity;

  /**
   * 结尾是BAG的说明是券包
   */
  private String memberRole;

  /**
   * 热搜,逗号分隔
   */
  private String hotSearch;

  /**
   * 是否全部下架
   */
  private Integer isAllSkuNoRelease;

  /**
   * 主键
   *
   * @return spu_id 主键
   */
  public Integer getSpuId() {
    return spuId;
  }

  /**
   * 主键
   *
   * @param spuId 主键
   */
  public void setSpuId(Integer spuId) {
    this.spuId = spuId;
  }

  /**
   * spucode编码 (唯一)
   *
   * @return spucode spucode编码 (唯一)
   */
  public String getSpucode() {
    return spucode;
  }

  /**
   * spucode编码 (唯一)
   *
   * @param spucode spucode编码 (唯一)
   */
  public void setSpucode(String spucode) {
    this.spucode = spucode == null ? null : spucode.trim();
  }

  /**
   * 商品名称
   *
   * @return spuname 商品名称
   */
  public String getSpuname() {
    return spuname;
  }

  /**
   * 商品名称
   *
   * @param spuname 商品名称
   */
  public void setSpuname(String spuname) {
    this.spuname = spuname == null ? null : spuname.trim();
  }

  /**
   * map<属性名,属性值> 的json串
   *
   * @return propertys map<属性名,属性值> 的json串
   */
  public String getPropertys() {
    return propertys;
  }

  /**
   * map<属性名,属性值> 的json串
   *
   * @param propertys map<属性名,属性值> 的json串
   */
  public void setPropertys(String propertys) {
    this.propertys = propertys == null ? null : propertys.trim();
  }

  /**
   * 产品标题(适用于全局搜索)
   *
   * @return spu_title 产品标题(适用于全局搜索)
   */
  public String getSpuTitle() {
    return spuTitle;
  }

  /**
   * 产品标题(适用于全局搜索)
   *
   * @param spuTitle 产品标题(适用于全局搜索)
   */
  public void setSpuTitle(String spuTitle) {
    this.spuTitle = spuTitle == null ? null : spuTitle.trim();
  }

  /**
   * 视频地址
   *
   * @return spu_video 视频地址
   */
  public String getSpuVideo() {
    return spuVideo;
  }

  /**
   * 视频地址
   *
   * @param spuVideo 视频地址
   */
  public void setSpuVideo(String spuVideo) {
    this.spuVideo = spuVideo == null ? null : spuVideo.trim();
  }

  /**
   * 5张商品图
   *
   * @return images_urls 5张商品图
   */
  public String getImagesUrls() {
    return imagesUrls;
  }

  /**
   * 5张商品图
   *
   * @param imagesUrls 5张商品图
   */
  public void setImagesUrls(String imagesUrls) {
    this.imagesUrls = imagesUrls == null ? null : imagesUrls.trim();
  }

  /**
   * 产品简介/亮点
   *
   * @return spu_simple_desc 产品简介/亮点
   */
  public String getSpuSimpleDesc() {
    return spuSimpleDesc;
  }

  /**
   * 产品简介/亮点
   *
   * @param spuSimpleDesc 产品简介/亮点
   */
  public void setSpuSimpleDesc(String spuSimpleDesc) {
    this.spuSimpleDesc = spuSimpleDesc == null ? null : spuSimpleDesc.trim();
  }

  /**
   * 产品描述(详情)
   *
   * @return spu_desc 产品描述(详情)
   */
  public String getSpuDesc() {
    return spuDesc;
  }

  /**
   * 产品描述(详情)
   *
   * @param spuDesc 产品描述(详情)
   */
  public void setSpuDesc(String spuDesc) {
    this.spuDesc = spuDesc == null ? null : spuDesc.trim();
  }

  /**
   * 品牌id(用于商品绑定)
   *
   * @return brand_id 品牌id(用于商品绑定)
   */
  public Integer getBrandId() {
    return brandId;
  }

  /**
   * 品牌id(用于商品绑定)
   *
   * @param brandId 品牌id(用于商品绑定)
   */
  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  /**
   * 头部描述
   *
   * @return up_desc 头部描述
   */
  public String getUpDesc() {
    return upDesc;
  }

  /**
   * 头部描述
   *
   * @param upDesc 头部描述
   */
  public void setUpDesc(String upDesc) {
    this.upDesc = upDesc == null ? null : upDesc.trim();
  }

  /**
   * 所属类目id
   *
   * @return category_id 所属类目id
   */
  public Integer getCategoryId() {
    return categoryId;
  }

  /**
   * 所属类目id
   *
   * @param categoryId 所属类目id
   */
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * 尾部描述
   *
   * @return down_desc 尾部描述
   */
  public String getDownDesc() {
    return downDesc;
  }

  /**
   * 尾部描述
   *
   * @param downDesc 尾部描述
   */
  public void setDownDesc(String downDesc) {
    this.downDesc = downDesc == null ? null : downDesc.trim();
  }

  /**
   * 热门标签-未使用
   *
   * @return tag_id 热门标签-未使用
   */
  public Integer getTagId() {
    return tagId;
  }

  /**
   * 热门标签-未使用
   *
   * @param tagId 热门标签-未使用
   */
  public void setTagId(Integer tagId) {
    this.tagId = tagId;
  }

  /**
   * 上架时间
   *
   * @return list_start_time 上架时间
   */
  public Date getListStartTime() {
    return listStartTime;
  }

  /**
   * 上架时间
   *
   * @param listStartTime 上架时间
   */
  public void setListStartTime(Date listStartTime) {
    this.listStartTime = listStartTime;
  }

  /**
   * 下架时间
   *
   * @return list_stop_time 下架时间
   */
  public Date getListStopTime() {
    return listStopTime;
  }

  /**
   * 下架时间
   *
   * @param listStopTime 下架时间
   */
  public void setListStopTime(Date listStopTime) {
    this.listStopTime = listStopTime;
  }

  /**
   * 原产地
   *
   * @return country_name 原产地
   */
  public String getCountryName() {
    return countryName;
  }

  /**
   * 原产地
   *
   * @param countryName 原产地
   */
  public void setCountryName(String countryName) {
    this.countryName = countryName == null ? null : countryName.trim();
  }

  /**
   * 最小价格
   *
   * @return min_price 最小价格
   */
  public Long getMinPrice() {
    return minPrice;
  }

  /**
   * 最小价格
   *
   * @param minPrice 最小价格
   */
  public void setMinPrice(Long minPrice) {
    this.minPrice = minPrice;
  }

  /**
   * 最大价格
   *
   * @return max_price 最大价格
   */
  public Long getMaxPrice() {
    return maxPrice;
  }

  /**
   * 最大价格
   *
   * @param maxPrice 最大价格
   */
  public void setMaxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   * 最低活动价
   *
   * @return min_price_activity 最低活动价
   */
  public Long getMinPriceActivity() {
    return minPriceActivity;
  }

  /**
   * 最低活动价
   *
   * @param minPriceActivity 最低活动价
   */
  public void setMinPriceActivity(Long minPriceActivity) {
    this.minPriceActivity = minPriceActivity;
  }

  /**
   * 最高活动价
   *
   * @return max_price_activity 最高活动价
   */
  public Long getMaxPriceActivity() {
    return maxPriceActivity;
  }

  /**
   * 最高活动价
   *
   * @param maxPriceActivity 最高活动价
   */
  public void setMaxPriceActivity(Long maxPriceActivity) {
    this.maxPriceActivity = maxPriceActivity;
  }

  /**
   * 是否是赠品 0-不是 1-是
   *
   * @return is_gift 是否是赠品 0-不是 1-是
   */
  public Byte getIsGift() {
    return isGift;
  }

  /**
   * 是否是赠品 0-不是 1-是
   *
   * @param isGift 是否是赠品 0-不是 1-是
   */
  public void setIsGift(Byte isGift) {
    this.isGift = isGift;
  }

  /**
   * 创建时间
   *
   * @return gmt_create 创建时间
   */
  public Date getGmtCreate() {
    return gmtCreate;
  }

  /**
   * 创建时间
   *
   * @param gmtCreate 创建时间
   */
  public void setGmtCreate(Date gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  /**
   * 修改时间
   *
   * @return gmt_modified 修改时间
   */
  public Date getGmtModified() {
    return gmtModified;
  }

  /**
   * 修改时间
   *
   * @param gmtModified 修改时间
   */
  public void setGmtModified(Date gmtModified) {
    this.gmtModified = gmtModified;
  }

  /**
   * 渠道: 'ALL','WEB','APP'
   *
   * @return sales_channel 渠道: 'ALL','WEB','APP'
   */
  public String getSalesChannel() {
    return salesChannel;
  }

  /**
   * 渠道: 'ALL','WEB','APP'
   *
   * @param salesChannel 渠道: 'ALL','WEB','APP'
   */
  public void setSalesChannel(String salesChannel) {
    this.salesChannel = salesChannel == null ? null : salesChannel.trim();
  }

  /**
   * 权重
   *
   * @return spu_weight 权重
   */
  public Integer getSpuWeight() {
    return spuWeight;
  }

  /**
   * 权重
   *
   * @param spuWeight 权重
   */
  public void setSpuWeight(Integer spuWeight) {
    this.spuWeight = spuWeight;
  }

  /**
   * 状态:0-未发布,1-已发布,2-废除
   *
   * @return spu_status 状态:0-未发布,1-已发布,2-废除
   */
  public Byte getSpuStatus() {
    return spuStatus;
  }

  /**
   * 状态:0-未发布,1-已发布,2-废除
   *
   * @param spuStatus 状态:0-未发布,1-已发布,2-废除
   */
  public void setSpuStatus(Byte spuStatus) {
    this.spuStatus = spuStatus;
  }

  /**
   * @return is_search
   */
  public Byte getIsSearch() {
    return isSearch;
  }

  /**
   *
   */
  public void setIsSearch(Byte isSearch) {
    this.isSearch = isSearch;
  }

  /**
   * 最大原价
   *
   * @return original_price_max 最大原价
   */
  public Long getOriginalPriceMax() {
    return originalPriceMax;
  }

  /**
   * 最大原价
   *
   * @param originalPriceMax 最大原价
   */
  public void setOriginalPriceMax(Long originalPriceMax) {
    this.originalPriceMax = originalPriceMax;
  }

  /**
   * 原价
   *
   * @return original_price_min 原价
   */
  public Long getOriginalPriceMin() {
    return originalPriceMin;
  }

  /**
   * 原价
   *
   * @param originalPriceMin 原价
   */
  public void setOriginalPriceMin(Long originalPriceMin) {
    this.originalPriceMin = originalPriceMin;
  }

  /**
   * 仓库编码
   *
   * @return warehouse_code 仓库编码
   */
  public String getWarehouseCode() {
    return warehouseCode;
  }

  /**
   * 仓库编码
   *
   * @param warehouseCode 仓库编码
   */
  public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
  }

  /**
   * 是否需要缴税 0-无,1-包税,2-保税
   *
   * @return ferme 是否需要缴税 0-无,1-包税,2-保税
   */
  public Byte getFerme() {
    return ferme;
  }

  /**
   * 是否需要缴税 0-无,1-包税,2-保税
   *
   * @param ferme 是否需要缴税 0-无,1-包税,2-保税
   */
  public void setFerme(Byte ferme) {
    this.ferme = ferme;
  }

  /**
   * 税率
   *
   * @return rate 税率
   */
  public String getRate() {
    return rate;
  }

  /**
   * 税率
   *
   * @param rate 税率
   */
  public void setRate(String rate) {
    this.rate = rate == null ? null : rate.trim();
  }

  /**
   * 总销售量 默认0
   *
   * @return all_sold_num 总销售量 默认0
   */
  public Integer getAllSoldNum() {
    return allSoldNum;
  }

  /**
   * 总销售量 默认0
   *
   * @param allSoldNum 总销售量 默认0
   */
  public void setAllSoldNum(Integer allSoldNum) {
    this.allSoldNum = allSoldNum;
  }

  /**
   * spu可销售库存总量  默认0
   *
   * @return all_stock_number spu可销售库存总量  默认0
   */
  public Integer getAllStockNumber() {
    return allStockNumber;
  }

  /**
   * spu可销售库存总量  默认0
   *
   * @param allStockNumber spu可销售库存总量  默认0
   */
  public void setAllStockNumber(Integer allStockNumber) {
    this.allStockNumber = allStockNumber;
  }

  /**
   * 总活动可销售库存 默认0
   *
   * @return all_stock_number_activity 总活动可销售库存 默认0
   */
  public Integer getAllStockNumberActivity() {
    return allStockNumberActivity;
  }

  /**
   * 总活动可销售库存 默认0
   *
   * @param allStockNumberActivity 总活动可销售库存 默认0
   */
  public void setAllStockNumberActivity(Integer allStockNumberActivity) {
    this.allStockNumberActivity = allStockNumberActivity;
  }

  /**
   * 结尾是BAG的说明是券包
   *
   * @return member_role 结尾是BAG的说明是券包
   */
  public String getMemberRole() {
    return memberRole;
  }

  /**
   * 结尾是BAG的说明是券包
   *
   * @param memberRole 结尾是BAG的说明是券包
   */
  public void setMemberRole(String memberRole) {
    this.memberRole = memberRole == null ? null : memberRole.trim();
  }

  /**
   * 热搜,逗号分隔
   *
   * @return hot_search 热搜,逗号分隔
   */
  public String getHotSearch() {
    return hotSearch;
  }

  /**
   * 热搜,逗号分隔
   *
   * @param hotSearch 热搜,逗号分隔
   */
  public void setHotSearch(String hotSearch) {
    this.hotSearch = hotSearch == null ? null : hotSearch.trim();
  }

  /**
   * 是否全部下架
   *
   * @return is_all_sku_no_release 是否全部下架
   */
  public Integer getIsAllSkuNoRelease() {
    return isAllSkuNoRelease;
  }

  /**
   * 是否全部下架
   *
   * @param isAllSkuNoRelease 是否全部下架
   */
  public void setIsAllSkuNoRelease(Integer isAllSkuNoRelease) {
    this.isAllSkuNoRelease = isAllSkuNoRelease;
  }
}