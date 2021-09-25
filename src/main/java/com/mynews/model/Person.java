package com.mynews.model;

import lombok.*;

import java.util.Objects;
/*@Getter
@Setter
@EqualsAndHashCode
@ToString*/

@Data
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private String lastName;
    private String middleName;
}
