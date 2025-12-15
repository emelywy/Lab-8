package org.example.colproj.labs.lab8.daointerf;

import org.example.colproj.labs.lab8.entity.Apartment;

public interface ApartmentDao extends GeneralDao <Apartment> { // успадковує всі методи GeneralDao, де T замінено на Apartment
}
