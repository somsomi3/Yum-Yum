package com.reservation.entity.reservation;

import com.reservation.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String POST_SJ;
    private String ADDRESS;
    private String NEW_ADDRESS;
    private String CMMN_TELNO;
    private String CMMN_USE_TIME;

    public void RestaurantList(Long id, String POST_SJ, String ADDRESS,
        String NEW_ADDRESS, String CMMN_TELNO, String CMMN_USE_TIME) {
        this.id = id;
        this.POST_SJ = POST_SJ;
        this.ADDRESS = ADDRESS;
        this.NEW_ADDRESS = NEW_ADDRESS;
        this.CMMN_TELNO = CMMN_TELNO;
        this.CMMN_USE_TIME = CMMN_USE_TIME;
    }
}