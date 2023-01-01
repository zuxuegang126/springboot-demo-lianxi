package com.renhe.modl;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Guest implements Serializable {
    @Column
    private String name;
    @Column
    private String position;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
