package com.english.easyenglish.pojo;

import java.io.Serializable;

/**
 * 用户表
 * @TableName users
 */
public class Users implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private Long userid;

    /**
     * 名字
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private String name;

    /**
     * 账号
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private String account;

    /**
     * 密码
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private String password;

    /**
     * 头像
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private String pic;

    /**
     * 默认分类
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private Long categoryidfk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * id
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 名字
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public String getName() {
        return name;
    }

    /**
     * 名字
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 账号
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public String getAccount() {
        return account;
    }

    /**
     * 账号
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 密码
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 头像
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public String getPic() {
        return pic;
    }

    /**
     * 头像
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 默认分类
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public Long getCategoryidfk() {
        return categoryidfk;
    }

    /**
     * 默认分类
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    public void setCategoryidfk(Long categoryidfk) {
        this.categoryidfk = categoryidfk;
    }

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Users other = (Users) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getCategoryidfk() == null ? other.getCategoryidfk() == null : this.getCategoryidfk().equals(other.getCategoryidfk()));
    }

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getCategoryidfk() == null) ? 0 : getCategoryidfk().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", name=").append(name);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", pic=").append(pic);
        sb.append(", categoryidfk=").append(categoryidfk);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}