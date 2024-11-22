package co.istad.roomrenting.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String type;
    private Double price;
    private String address;
    private String description;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "university_id", referencedColumnName = "id")
    private University university;

    @OneToMany(mappedBy = "room")
    private List<RentalTransaction> rentalTransactions;

    @OneToMany(mappedBy = "room")
    private List<RoomImage> images;

    @OneToMany(mappedBy = "room")
    private List<Review> reviews;
}
