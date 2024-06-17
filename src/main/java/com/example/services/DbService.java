package com.example.services;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbc.DbConection;

@Service
public class DbService {

    @Autowired
    Connection conn = DbConection.getConnection();

    public boolean statusConnection() {

        if (conn == null) {
            System.out.println("Nao Conectado!");
            return false;
        } else {
            System.out.println("Conectado!");
            return true;
        }
    }
}
