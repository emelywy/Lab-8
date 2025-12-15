package org.example.colproj.labs.lab8.daointerf;

import org.example.colproj.labs.lab8.entity.Bill;

public interface BillDao extends GeneralDao <Bill> { // успадковує всі методи GeneralDao, де T замінено на Bill
}
