package com.dist.training.bdf.entity.instance;

import com.dist.bdf.base.data.DataBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYS_USER")
@DataBase(DataBase.Instance)
public class UserEntity {
  @Id
  @Column(name = "USER_ID", unique = true, nullable = false)
  private String uid;

  @Column(name = "PASSWORD")
  private String pwd;

  public String getUid() {
    return uid;
  }

  public String getPwd() {
    return pwd;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
}
