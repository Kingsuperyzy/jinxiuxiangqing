package com.jk.model;

public class AttentionBean {
    private Integer id;
    private Integer attentionUserId;
    private Integer beAttentionId;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(Integer attentionUserId) {
        this.attentionUserId = attentionUserId;
    }

    public Integer getBeAttentionId() {
        return beAttentionId;
    }

    public void setBeAttentionId(Integer beAttentionId) {
        this.beAttentionId = beAttentionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
