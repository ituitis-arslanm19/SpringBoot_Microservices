package com.account.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="Users")
@Getter
@Setter
@Entity
public class Account {
    @Id
    String id = UUID.randomUUID().toString();

    String name;

    String surname;

    String email;


}
