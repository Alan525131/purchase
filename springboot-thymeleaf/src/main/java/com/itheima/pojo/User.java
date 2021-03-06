package com.itheima.pojo;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/30 09:59
 * @description 标题
 * @package com.itheima.pojo
 */
public class User {
    private Integer id;
    private String name;
    private String address;

    public User() {
    }

    public User(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
