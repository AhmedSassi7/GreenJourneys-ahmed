package com.greenjourneys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Interest {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idInterest;
    private String place;
    private Date date;
    private String activityName;
    private int age;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "interest_user",
            joinColumns = {@JoinColumn(
                    name = "interest_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "user_id"
            )}
    )
    private List<User> users = new ArrayList();
}
