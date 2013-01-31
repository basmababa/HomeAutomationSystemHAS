package deviceOperations;


import java.awt.Frame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amu
 */
public class ClsDeviceOperations {

    public int setTvOnOff(int onOffStatus) throws Exception {
        int retStatus = 0;

        try {
            Frame frm = new Frame("Sony");
            frm.setSize(1000, 500);

            switch (onOffStatus) {
                case 1:

                    frm.setVisible(true);
                    retStatus = 1;
                    break;

                case 0:
                    frm.setVisible(false);
                    retStatus = 0;
                    break;

            }


        } catch (Exception e) {
            throw e;
        }
        return retStatus;

    }
}
