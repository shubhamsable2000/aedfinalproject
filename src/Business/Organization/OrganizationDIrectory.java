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
public class OrganizationDIrectory {
    
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type, String realName){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())){
            organization = new SystemCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MedicalTechnician.getValue())){
            organization = new MedicalTechnicianOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createLegalOrganization(Organization.LegalType legalType, String realName){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.LegalType.LegalOfficer.getValue())){
            organization = new LegalOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createBoneMarrowOrganization(Organization.BoneMarrowBankType bmBankType, String realName){
        Organization organization = null;
        if (bmBankType.getValue().equals(Organization.BoneMarrowBankType.BoneMarrowBank.getValue())){
            organization = new BoneMarrowBankOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createCancerCentreOrganization(Organization.BloodCancerCentreType cancerType, String realName){
        Organization organization = null;
        if (cancerType.getValue().equals(Organization.BloodCancerCentreType.BloodCancerCentre.getValue())){
            organization = new BloodCancerCentreOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createGovernmentOrganization(Organization.GovernmentType govtType, String realName){
        Organization organization = null;
        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
            organization = new GovernmentOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
}
