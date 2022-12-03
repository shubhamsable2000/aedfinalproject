/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class MedicalTechnicianOrganization extends Organization{

    public MedicalTechnicianOrganization() {
        super(Organization.Type.MedicalTechnician.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalTechnicianRole());
        return roles;
    }
     
}
