package com.greenjourneys.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idChat;
    private String etat;
    private String privateMessage;
    private Date dateMessage;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(
            name = "group_id"
    )
    private Group group;
    @JsonIgnore
    @OneToOne
    private User user;

}
