public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100? tonerLevel: 0;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public int addToner(int tonerAmount){
        int checkLvl = tonerAmount + tonerLevel;
        //System.out.println(checkLvl);
        return checkLvl <= 100 && checkLvl >= 0? tonerLevel = checkLvl: -1;
    }

    public int printPages(int pages){
        if(duplex && pages%2 == 0){
            pagesPrinted = pages/2;
        }else if(duplex && pages%2 != 0){
            pagesPrinted = pages/2 + 1;
        }else{
            pagesPrinted = pages;
        }

        return pagesPrinted;
    }
}
