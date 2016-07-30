/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.enquiryMS.dao.impl;

import com.sajeena.enquiryMS.dao.enquiryDAO;
import com.sajeena.enquiryMS.entity.enquiry;

/**
 *
 * @author Admin
 */
public class enquiryDAOImpl implements enquiryDAO {
     private int count = 0;
    private enquiry[] enquirylist = new enquiry[10];

    @Override
    public boolean insert(enquiry en) {
 if (count == enquirylist.length) {
            return false;
        }
        enquirylist[count] = en;
        count++;
        return true;    }

    @Override
    public boolean delete(int id) {
for (int i = 0; i < enquirylist.length; i++) {
            enquiry c = enquirylist[i];
            if (c != null && c.getId() == id) {
                enquirylist[i] = null;
                return true;
            }
        }
        return false;    }

    @Override
    public enquiry getbyId(int id) {
 for (int i = 0; i < enquirylist.length; i++) {
            enquiry c = enquirylist[i];
            if (c != null && c.getId() == id) {

                return c;
            }
        }
        return null;    }

    @Override
    public enquiry[] getAll() {
return enquirylist;    }
    
}
