package com.dist.training.bdf.dto;

public class AppPrelandValueDTO {
  private int id;
  private String key;
  private int fkPrelanduseId;
  private int fkProjectId;
  private String type;
  private String useplanfarmaera;
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

}
