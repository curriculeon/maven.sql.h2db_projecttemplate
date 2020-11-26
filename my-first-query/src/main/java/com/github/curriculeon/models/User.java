package com.github.curriculeon.models;


import com.github.curriculeon.utils.Jsonifier;
import com.github.curriculeon.utils.services.EntityInterface;

import javax.persistence.*;

@Entity
public class User implements EntityInterface<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private UserProfile profile;

    @OneToOne
    private UserWallet wallet;

    @Override
    public String toString() {
        return Jsonifier.jsonify(this);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}