package org.example.colproj.labs.lab8.daointerf;

import org.example.colproj.labs.lab8.entity.Application;

public interface ApplicationDao extends GeneralDao <Application>{ // успадковує всі методи GeneralDao, де T замінено на Application
}
