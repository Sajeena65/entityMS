/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.entityMS.dao.impl;

import com.sajeena.entityMS.dao.entityDAO;
import com.sajeena.entityMS.entity.entity;

/**
 *
 * @author Admin
 */
public class entityDAOImpl implements entityDAO {
     private int count = 0;
    private entity[] entitylist = new entity[10];

    @Override
    public boolean insert(entity en) {
 if (count == entitylist.length) {
            return false;
        }
        entitylist[count] = en;
        count++;
        return true;    }

    @Override
    public boolean delete(int id) {
for (int i = 0; i < entitylist.length; i++) {
            entity c = entitylist[i];
            if (c != null && c.getId() == id) {
                entitylist[i] = null;
                return true;
            }
        }
        return false;    }

    @Override
    public entity getbyId(int id) {
 for (int i = 0; i < entitylist.length; i++) {
            entity c = entitylist[i];
            if (c != null && c.getId() == id) {

                return c;
            }
        }
        return null;    }

    @Override
    public entity[] getAll() {
return entitylist;    }
    
}
