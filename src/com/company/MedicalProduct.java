package com.company;

import java.util.Vector;

/**
 * Created by Darthpwner on 11/9/15.
 */
public class MedicalProduct {
    MedicalProduct() {
        m_medicalProduct.add(bandages);
        m_medicalProduct.add(cough);
        m_medicalProduct.add(pills);
        m_medicalProduct.add(sneeze);
        m_medicalProduct.add(syrup);
    }

    String getMedicalProduct(int i) {
        return m_medicalProduct.get(i);
    }

    int getMedicalProductVectorSize() {
        return m_medicalProduct.size();
    }

    final String bandages = "bandages";
    final String cough = "cough";
    final String pills = "pills";
    final String sneeze = "sneeze";
    final String syrup = "syrup";

    private Vector<String> m_medicalProduct = new Vector<String>();
}
