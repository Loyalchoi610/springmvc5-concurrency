package com.forestvue.domain;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoDTO {
    int id;
    List<UserActionVO> logs;
}
