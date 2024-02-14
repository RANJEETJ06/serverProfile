package com.profile.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "messages")
@NoArgsConstructor
@AllArgsConstructor
public class message {
    private ObjectId id;
    private String email;
    private String Message;
    public message(String email,String Message){
        this.email=email;
        this.Message=Message;
    }
}
