package uz.sadirbaev.managementsystem.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "process_chain_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProcessChainProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ref_product")
    private Integer refProduct;

    @Column(name = "ref_process_chain_id")
    private Integer processChainId;

    @Size(max = 10)
    private String name;
}
