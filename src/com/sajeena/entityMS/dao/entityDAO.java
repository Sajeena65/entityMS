/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.entityMS.dao;

import com.sajeena.entityMS.entity.entity;

/**
 *
 * @author Admin
 */
public interface entityDAO {
     boolean insert(entity en);
    boolean delete(int id);
    entity getbyId(int id);
    entity[] getAll();
    
}
