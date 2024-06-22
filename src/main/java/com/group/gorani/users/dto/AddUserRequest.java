package com.group.gorani.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddUserRequest {
    private String id;
    private String username;
    private String summary;
    private Long point;
    private int numOfHostTicket;
}
