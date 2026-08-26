import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public Boolean addBranch(String branch){
        if(findBranch(branch) == null){
            branches.add(new Branch(branch));
        }
        return false;
    }

    public Branch findBranch(String branch){
        if(branches.size() < 0){
            return null;
        }
        for(Branch b: branches){
            if(b.getName().equalsIgnoreCase(branch)){
                return b;
            }
        }
        return null;
    }
}
