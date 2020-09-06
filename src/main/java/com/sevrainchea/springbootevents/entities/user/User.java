package com.sevrainchea.springbootevents.entities.user;

import com.sevrainchea.springbootevents.entities.Minifiable;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class User implements Minifiable {

    @Id
    private String id;

    private String userName;
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String phoneNumber;

    public Minifiable minify() {
        return User.builder().id(this.id).userName(this.userName)
                .firstName(this.firstName).lastName(this.lastName).build();
    }

}
