package com.dist.training.bdf.entity.instance;

import com.dist.bdf.base.data.DataBase;

import javax.persistence.*;

/**
 * @author lijy
 */
@Entity
@Table(name = "T_PROJECTBASE")
@DataBase(DataBase.Instance)
public class ProjectBaseEntity {
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
    @SequenceGenerator(name = "generator",sequenceName = "S_T_PROJECTBASE",initialValue = 1,allocationSize = 1)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PROJECTNO")
    private String projectNo;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "CONSTRUCTIONUNIT")
    private String constructionUnit;

    @Column(name = "BUILDADDRESS")
    private String buildAddress;

    @Column(name = "REGISTERTIME")
    private String registerTime;

    @Column(name = "LIFESTATE")
    private String lifeState;

    @Column(name = "ISDELETE")
    private boolean isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConstructionUnit() {
        return constructionUnit;
    }

    public void setConstructionUnit(String constructionUnit) {
        this.constructionUnit = constructionUnit;
    }

    public String getBuildAddress() {
        return buildAddress;
    }

    public void setBuildAddress(String buildAddress) {
        this.buildAddress = buildAddress;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getLifeState() {
        return lifeState;
    }

    public void setLifeState(String lifeState) {
        this.lifeState = lifeState;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
