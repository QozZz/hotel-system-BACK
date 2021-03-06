package com.qozz.worldwidehotelsystem.data.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class HotelDto {

    private long id;
    private String name;
    private int stars;
    private String description;
    private boolean hasPool;
    private boolean hasRestaurant;
    private AddressDto addressDto;

}
