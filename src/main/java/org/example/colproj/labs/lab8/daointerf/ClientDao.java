package org.example.colproj.labs.lab8.daointerf;

import org.example.colproj.labs.lab8.entity.Client;

public interface ClientDao extends GeneralDao<Client> { // сспадковує всі методи GeneralDao, де T замінено на Client.
}
