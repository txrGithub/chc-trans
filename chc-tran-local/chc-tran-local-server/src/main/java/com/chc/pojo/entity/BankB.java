package com.chc.pojo.entity;

import javax.persistence.*;

/**
 * Description:
 *
 * @author cuihaochong
 * @date 2019/12/13
 */
@Table(name = "bank_b")
public class BankB implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 741571546258891949L;

    /**
     * id
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * userName
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * money
     */
    @Column(name = "money")
    private Long money;

    /**
     * status
     */
    @Column(name = "status")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BankB(Integer id, String userName, Long money, String status) {
        this.id = id;
        this.userName = userName;
        this.money = money;
        this.status = status;
    }

    public static BankB initial(long money) {
        return new BankB(null, "BankB", money, null);
    }
}
