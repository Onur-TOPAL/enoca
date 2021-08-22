package com.enoca.entitiy;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
   @Entity
   @Table(name = "company_name")
   @AllArgsConstructor
   @NoArgsConstructor
   @Getter
   @Setter
   @EqualsAndHashCode(of ={"id"} )
   @ToString

    public class Company implements Serializable {
    @Id
    @SequenceGenerator(name ="seq_company_name",allocationSize = 1)
    @GeneratedValue(generator = "seq_company_name",strategy = GenerationType.SEQUENCE)

    private Long id;
    @Column(length = 500,name = "company")
    private String company;

    @ManyToOne
    @JoinColumn(name = "person_company_id")
    private Person person;

}