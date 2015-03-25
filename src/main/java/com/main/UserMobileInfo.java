package com.main;

import javax.persistence.*;

/**
 * Created by zilongye on 15-3-24.
 */
@Table(name = "user_mobile_info")
@Entity
public class UserMobileInfo extends AbstractEntity {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "sso_id")
    private Integer ssoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSsoId() {
        return ssoId;
    }

    public void setSsoId(Integer ssoId) {
        this.ssoId = ssoId;
    }
}
