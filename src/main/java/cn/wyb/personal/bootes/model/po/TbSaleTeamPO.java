package cn.wyb.personal.bootes.model.po;

import java.util.Date;

/**
 *  TABLE null
 */
public class TbSaleTeamPO {
    /**
     * user_uuid
     *
     * @mbg.generated
     */
    private String userUuid;

    /**
     * 父节点
     *
     * @mbg.generated
     */
    private String userPuuid;

    /**
     * 用户层级id
     *
     * @mbg.generated
     */
    private Integer userLevelId;

    /**
     * 用户层级名称
     *
     * @mbg.generated
     */
    private String userLevelName;

    /**
     * 用户渠道
     *
     * @mbg.generated
     */
    private String userChannel;

    /**
     * 用户微信id
     *
     * @mbg.generated
     */
    private String userUnionId;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 用户父节点
     *
     * @mbg.generated
     */
    private Integer userPid;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updatedTime;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     * 更新人
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     * 乐观锁
     *
     * @mbg.generated
     */
    private Integer revision;

    /**
     * user_uuid
     * @return user_uuid user_uuid
     *
     * @mbg.generated
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * user_uuid
     * @param userUuid user_uuid
     *
     * @mbg.generated
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    /**
     * 父节点
     * @return user_puuid 父节点
     *
     * @mbg.generated
     */
    public String getUserPuuid() {
        return userPuuid;
    }

    /**
     * 父节点
     * @param userPuuid 父节点
     *
     * @mbg.generated
     */
    public void setUserPuuid(String userPuuid) {
        this.userPuuid = userPuuid == null ? null : userPuuid.trim();
    }

    /**
     * 用户层级id
     * @return user_level_id 用户层级id
     *
     * @mbg.generated
     */
    public Integer getUserLevelId() {
        return userLevelId;
    }

    /**
     * 用户层级id
     * @param userLevelId 用户层级id
     *
     * @mbg.generated
     */
    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    /**
     * 用户层级名称
     * @return user_level_name 用户层级名称
     *
     * @mbg.generated
     */
    public String getUserLevelName() {
        return userLevelName;
    }

    /**
     * 用户层级名称
     * @param userLevelName 用户层级名称
     *
     * @mbg.generated
     */
    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName == null ? null : userLevelName.trim();
    }

    /**
     * 用户渠道
     * @return user_channel 用户渠道
     *
     * @mbg.generated
     */
    public String getUserChannel() {
        return userChannel;
    }

    /**
     * 用户渠道
     * @param userChannel 用户渠道
     *
     * @mbg.generated
     */
    public void setUserChannel(String userChannel) {
        this.userChannel = userChannel == null ? null : userChannel.trim();
    }

    /**
     * 用户微信id
     * @return user_union_id 用户微信id
     *
     * @mbg.generated
     */
    public String getUserUnionId() {
        return userUnionId;
    }

    /**
     * 用户微信id
     * @param userUnionId 用户微信id
     *
     * @mbg.generated
     */
    public void setUserUnionId(String userUnionId) {
        this.userUnionId = userUnionId == null ? null : userUnionId.trim();
    }

    /**
     * 用户id
     * @return user_id 用户id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户父节点
     * @return user_pid 用户父节点
     *
     * @mbg.generated
     */
    public Integer getUserPid() {
        return userPid;
    }

    /**
     * 用户父节点
     * @param userPid 用户父节点
     *
     * @mbg.generated
     */
    public void setUserPid(Integer userPid) {
        this.userPid = userPid;
    }

    /**
     * 更新时间
     * @return UPDATED_TIME 更新时间
     *
     * @mbg.generated
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     * @param updatedTime 更新时间
     *
     * @mbg.generated
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 创建时间
     * @return CREATED_TIME 创建时间
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     * @param createdTime 创建时间
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 创建人
     * @return CREATED_BY 创建人
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     * @param createdBy 创建人
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 更新人
     * @return UPDATED_BY 更新人
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 更新人
     * @param updatedBy 更新人
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 乐观锁
     * @return REVISION 乐观锁
     *
     * @mbg.generated
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * 乐观锁
     * @param revision 乐观锁
     *
     * @mbg.generated
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
    }
}