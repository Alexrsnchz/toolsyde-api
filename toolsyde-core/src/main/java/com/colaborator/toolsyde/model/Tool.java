package com.colaborator.toolsyde.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tools")
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String slug;
    private String description;
    private int uses;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
