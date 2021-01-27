package uz.sadirbaev.managementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "factory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer seq;

    @Size(max = 500)
    private String name;

    @Size(max = 500)
    private String address;

    @Size(max = 255)
    @Column(name = "start_date", columnDefinition = "varchar(255) default ''")
    private String startDate = "";

    @Size(max = 255)
    @Column(name = "end_date", columnDefinition = "varchar(255) default ''")
    private String endDate = "";

    @Size(max = 500)
    private String remark;

    @Size(max = 1)
    @Column(columnDefinition = "varchar(1) default '1'")
    private String status = "1";

    @Size(max = 255)
    private String acronym;

    @OneToMany(mappedBy = "factory", fetch = FetchType.EAGER)
    private Set<Line> lines;

}
