/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class Ecosystem {
    
    
     private static EcoSystem business;
    
    /*
private UserAccountDirectory userAccountDirectory;

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    */
    private DonorDirectory donorDirectory;
    private PatientDirectory patientDirectory;
    private DonorRequestDirectory donorRequestDirectory;
    private PatientRequestDirectory patientRequestDirectory;
    private UserDirectory userAccountDirectory;

    public UserDirectory getUserAccountDirectory() {
        if(this.userAccountDirectory == null) {
            userAccountDirectory = new UserDirectory();
            Employee employee = this.getEmployeeDirectory().createEmployee("sysadmin");
            User ua = this.userAccountDirectory.createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        }
        return this.userAccountDirectory;
    }
    public void setUserAccountDirectory(UserDirectory userAccountDirectory) { this.userAccountDirectory = userAccountDirectory;  }
    public DonorRequestDirectory getDonorRequestDirectory() { 
        if(this.donorRequestDirectory == null)
            this.donorRequestDirectory = new DonorRequestDirectory();
        return donorRequestDirectory;    
    }
    public void setDonorRequestDirectory(DonorRequestDirectory donorRequestDirectory) {        
        this.donorRequestDirectory = donorRequestDirectory;    
    }
    public PatientRequestDirectory getPatientRequestDirectory() {    
        if(this.patientRequestDirectory == null)
            this.patientRequestDirectory = new PatientRequestDirectory();
        return patientRequestDirectory;    
    }
    public void setPatientRequestDirectory(PatientRequestDirectory patientRequestDirectory) {        this.patientRequestDirectory = patientRequestDirectory;    }
    public PatientDirectory getPatientDirectory() {
        if(this.patientDirectory == null)
            this.patientDirectory = new PatientDirectory();
        return patientDirectory;
    }
    public void setPatientDirectory(PatientDirectory patientDirectory) {this.patientDirectory = patientDirectory;}
    public DonorDirectory getDonorDirectory() {
        if(this.donorDirectory == null)
            this.donorDirectory = new DonorDirectory();
        return donorDirectory;
    }
    public void setDonorDirectory(DonorDirectory donorDirectory) {this.donorDirectory = donorDirectory;}
    
    
    private ArrayList<Network> networkList;
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super("New Organization");
        networkList=new ArrayList<Network>();
        this.donorDirectory = new DonorDirectory();
        this.patientDirectory = new PatientDirectory();
        this.donorRequestDirectory = new DonorRequestDirectory();
        this.patientRequestDirectory = new PatientRequestDirectory();
        this.userAccountDirectory  = new UserDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
}
