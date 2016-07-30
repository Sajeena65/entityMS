/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.enquiryMS.dao;

import com.sajeena.enquiryMS.entity.enquiry;

/**
 *
 * @author Admin
 */
public interface enquiryDAO {
     boolean insert(enquiry en);
    boolean delete(int id);
    enquiry getbyId(int id);
    enquiry[] getAll();
    
}
