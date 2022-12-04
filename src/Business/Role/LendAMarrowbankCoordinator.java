/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BoneMarrowBankOrganization;
import Business.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author shubhamsable
 */
public class LendAMarrowBankCoordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new BoneMarrowBankCoordinatorWorkAreaJPanel(account, (BoneMarrowBankOrganization)organization, enterprise, business, network);
    }
    
}
