package com.example.aws.lambda;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    public String  firstName;
    public String  lastName;
    public String  age;

}
