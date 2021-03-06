package com.CarAnnounceRestApi.RestApiCarMobileAppSpringBoot.Domain;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.text.DateFormat;

@Getter
@Setter
@AllArgsConstructor
public  class CarAnnouncement implements Serializable {
    private  int id;
    private  int walk;
    private  int price;
    private  boolean credit;
    private  boolean barter;
    private  String description;
    private  String transmission;
    private  String gearBox;
    private Date carYear;
    private  int engineCapacity ;
    private  int enginePower;

    private  int modelId;
    private  int fuelId;
    private  int colorId;
    private  int detailId;
    private  int banId;
    private  int userId;
    private  int exchangeId;
    private  Date createdAnnouncement;
    private  Date updatedAnnouncement;
}
