package com.dist.training.bdf.entity.instance;


import com.dist.bdf.base.data.DataBase;

import javax.persistence.*;

@Entity
@Table(name = "APP_PRELANDKEYVALUE")
@DataBase(DataBase.Instance)
public class AppPrelandValueEntity {
  @Id
  @Column(name = "ID", unique = true, nullable = false)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
  @SequenceGenerator(name = "generator", sequenceName = "", initialValue = 1, allocationSize = 1)
  private int id;

  @Column(name = "KEY")
  private String key;

  @Column(name = "FK_PRELANDUSE_ID")
  private int fkPrelanduseId;

  @Column(name = "FK_PROJECT_ID")
  private int fkProjectId;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "USEPLANFARMAERA")
  private String useplanfarmaera;

  @Column(name = "VALUE")
  private double value;

  public int getId() {
    return id;
  }

  public String getKey() {
    return key;
  }

  public int getFkPrelanduseId() {
    return fkPrelanduseId;
  }

  public int getFkProjectId() {
    return fkProjectId;
  }

  public double getValue() {
    return value;
  }

  public String getType() {
    return type;
  }

  public String getUseplanfarmaera() {
    return useplanfarmaera;
  }

  public void setFkPrelanduseId(int fkPrelanduseId) {
    this.fkPrelanduseId = fkPrelanduseId;
  }

  public void setFkProjectId(int fkProjectId) {
    this.fkProjectId = fkProjectId;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setUseplanfarmaera(String useplanfarmaera) {
    this.useplanfarmaera = useplanfarmaera;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public void setSth(String k, Object o) {
    if (k.equals("id"))
      setId((Integer) o);
    else if (k.equals("key"))
      setKey((String) o);
    else if (k.equals("fkPrelanduseId"))
      setFkPrelanduseId((Integer) o);
//    else if (k.equals(""))
  }
}
