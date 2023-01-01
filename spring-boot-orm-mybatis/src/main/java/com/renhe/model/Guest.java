package com.renhe.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Guest implements Serializable {
    private Long id;
    private String name;
    private String position;
}
