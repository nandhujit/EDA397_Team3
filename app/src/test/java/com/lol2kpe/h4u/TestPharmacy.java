package com.lol2kpe.h4u;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidfogelberg on 2017-04-03.
 */

public class TestPharmacy {

    @Test
    public void testGetName() throws Exception {
        Pharmacy pharmacy = new Pharmacy("Apoteket", 5, "medicin", "2342534", "394565804", 10, "8:00-16:00","Nordstan 3323", "073545463" );
        assertEquals(pharmacy.getName(), "Apoteket");
    }
    @Test
    public void testSetName() throws Exception {
        Pharmacy pharmacy = new Pharmacy("Apoteket", 5, "medicin", "2342534", "394565804", 10, "8:00-16:00","Nordstan 3323", "073545463" );
        pharmacy.setName("Hjärtat");
        assertEquals(pharmacy.getName(), "Hjärtat");


    }
}
