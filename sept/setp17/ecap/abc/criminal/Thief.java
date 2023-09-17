package sept.setp17.ecap.abc.criminal;

import sept.setp17.ecap.abc.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
//        int g = cop.gun;
        int bullet = cop.getGuns();
        System.out.println(bullet);
       // cop.canIShoot();


    }
}
