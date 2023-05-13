package ru.nsu.fit.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CrackRequest {
    private String hash;
    private Integer maxLength;
}
