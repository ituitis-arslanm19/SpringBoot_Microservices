package com.account.api.DTO;

import lombok.*;

import java.util.UUID;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of= {"id"})
@Getter
@Setter
public class AccountDto {


        String id = UUID.randomUUID().toString();

        String name;

        String surname;

        String email;



}
