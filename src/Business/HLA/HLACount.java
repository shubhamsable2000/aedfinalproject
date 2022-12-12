/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HLA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author shubhamsable
 */
public class HLACount {
    
    HashMap<String, Integer> Counts;
    
    public HLACount() {
        Counts = new HashMap<>();
    }
    
    public void HLACountAdd(PersonHLA hla) {
        ArrayList<String> countAdd = hla.getHlaValuesList();
        Collections.sort(countAdd);
        String hlaCombo = String.join(", ", countAdd);
        this.Counts.putIfAbsent(hlaCombo, 0);
        this.Counts.put(hlaCombo, this.Counts.get(hlaCombo) + 1);
    }
    
    public void HLACountAdd(PersonHLA hla, Integer i) {
        ArrayList<String> hlaValues = hla.getHlaValuesList();
        Collections.sort(hlaValues);
        String hlaCombo = String.join(", ", hlaValues);
        this.Counts.putIfAbsent(hlaCombo, 0);
        this.Counts.put(hlaCombo, this.Counts.get(hlaCombo) + i);
    }
    
    public void HLACountSubstract(PersonHLA hla) {
        ArrayList<String> hlaValues = hla.getHlaValuesList();
        Collections.sort(hlaValues);
        String hlaCombo = String.join(", ", hlaValues);
//        this.HLAComboCounts.putIfAbsent(hlaCombo, 0);
        this.Counts.put(hlaCombo, this.Counts.get(hlaCombo) - 1);
    }
    
    public HashMap<String, Integer> getHlaComboCounts() {
        return Counts;
    }
    
}
