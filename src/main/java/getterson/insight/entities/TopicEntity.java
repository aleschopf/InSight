package getterson.insight.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "topics")
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SummaryDataEntity> summaries;

    @ManyToOne
    private UserEntity user;

    public TopicEntity(String title, UserEntity userEntity){
        this.title = title;
        this.user = userEntity;
    }
}
