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
public class LegalEnterprise extends Enterprise {
    
    public LegalEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Legal);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}