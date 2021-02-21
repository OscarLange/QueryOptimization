package datastructure;

import java.util.*;

public class Bitvector {
    List<Integer> bits;

    public Bitvector(int size){
        this.bits = new ArrayList<>();
        for(int i = 0; i < size - 1; i++){
            this.bits.add(0);
        } 
        this.bits.add(1);
    }

    public void add(){
        for(int i = bits.size() - 1; i >= 0; i--){
            if(bits.get(i) == 1){
                bits.set(i, 0);
            } else {
                bits.set(i, 1);
                break;
            }
        }
    }

    public boolean halftime(){
        for(int i = 1; i < bits.size(); i++){
            if(bits.get(i) == 1){
                return false;
            }
        }
        return bits.get(0) == 1;
    }

    public boolean fulltime(){
        for(int i = 0; i < bits.size(); i++){
            if(bits.get(i) != 1){
                return false;
            }
        }
        return true;
    }

    public void reset(){
        for(int i = 0; i < bits.size() - 1; i++){
            this.bits.add(0);
        } 
        this.bits.add(1);
    }

    public List<String> returnSet(List<String> orderedRelations){
        List<String> keys = new ArrayList<>();
        String left = "";
        String right = "";
        for(int i = 0; i < bits.size(); i++){
            if(bits.get(i) == 0){
                left = left + orderedRelations.get(i) + ",";
            } else {
                right = right + orderedRelations.get(i) + ",";
            }
        } 
        left = left.substring(0, left.length()-1);
        right = right.substring(0, right.length()-1);
        keys.add(left);
        keys.add(right);
        return keys;
    }
}
