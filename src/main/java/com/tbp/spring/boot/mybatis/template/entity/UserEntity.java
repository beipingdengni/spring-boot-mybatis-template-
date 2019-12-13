package com.tbp.spring.boot.mybatis.template.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "t_user")
public class UserEntity implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "ref_shop_id")
    private Integer refShopId;

    @Column(name = "sex")
    private Byte sex;

    private static final long serialVersionUID = 1L;
}