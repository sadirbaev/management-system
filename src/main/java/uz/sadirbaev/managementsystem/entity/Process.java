package uz.sadirbaev.managementsystem.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "process")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer seq;

    @Size(max = 500)
    private String name;

    @Size(max = 500)
    private String type;

    @Size(max = 1)
    @Column(columnDefinition = "varchar(1) default '1'")
    private String status = "1";

    @Size(max = 500)
    private String remark;

    @Size(max = 500)
    @Column(name = "rep_variable_name")
    private String repVariableName;

    @Size(max = 500)
    @Column(name = "desp_picture")
    private String despPicture;

    @Column(name = "ref_product_id")
    private Integer refProductId;

    @Size(max = 255)
    private String acronym;
}
