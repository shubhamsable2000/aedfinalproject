/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class BloodCancerCentreEnterprise extends Enterprise {
    
    public BloodCancerCentreEnterprise(String name){
        super(name,EnterpriseType.BloodCancerCentre);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

