package com.geoffrey.model.Vehicles;

import java.time.LocalDateTime;

public class Moto extends TwoWheels {

    public Moto(LocalDateTime checkin, LocalDateTime checkout, boolean payedPrice, boolean payedSecurity, float price) {
        super(checkin, checkout, payedPrice, payedSecurity, price);
    }
}

