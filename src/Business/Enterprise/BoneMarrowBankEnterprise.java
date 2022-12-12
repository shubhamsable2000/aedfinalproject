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
public class BoneMarrowBankEnterprise extends Enterprise {
    
    public BoneMarrowBankEnterprise(String boneName){
        super(boneName,EnterpriseType.BoneMarrowBank);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}