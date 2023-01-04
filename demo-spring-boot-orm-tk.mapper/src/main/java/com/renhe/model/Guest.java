package com.renhe.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Guest {
    private Long id;
    private String name;
    private String position;
}
