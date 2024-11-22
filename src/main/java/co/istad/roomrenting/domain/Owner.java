package co.istad.roomrenting.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @OneToOne(mappedBy = "owner", cascade = CascadeType.ALL)
    private OwnerProfile ownerProfile;

    @OneToMany(mappedBy = "owner")
    private List<Room> rooms;
}
