package com.jk.model;

import java.util.List;

/**
 * <pre>项目名称：
 * 类名称：userController
 * 类描述：
 * 创建人：zhang hao hao
 *
 * 励志语录: 业精于勤荒于嬉 行成于思毁于随
 *
 * 创建时间：2019/11/12
 * 修改人：zhang hao hao  2086715372@qq.com
 * 修改时间：2019/11/12
 * 修改备注：
 * @version </pre>
 */
public class TreeBean {

    private Integer  id;

    private String   text;

    private String   path;

    private Integer  pid;

    private Boolean  selectable;

    private List<TreeBean> nodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "TreeBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", path='" + path + '\'' +
                ", pid=" + pid +
                ", selectable=" + selectable +
                ", nodes=" + nodes +
                '}';
    }
}
