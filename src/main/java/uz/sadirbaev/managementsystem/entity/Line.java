package uz.sadirbaev.managementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "line")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Line implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer seq;

    @Size(max = 500)
    @NaturalId
    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "ref_factory_id")
    private Factory factory;

    @Column(name = "ref_product_id")
    private Integer refProductId;

    @Size(max = 500)
    @Column(name = "layout_name")
    private String layoutName;

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

    @OneToOne(mappedBy = "line")
    private ProcessChain processChain;

}
