
package Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *save answer temporary text file in local disk
 */
public class TempanswerService {
    
    private Answer [] answerBundle;
    private int index;
    
    /**
     *save all answers to temporary file 
     */
    public TempanswerService () {
        answerBundle = new Answer [10];
        index = 0;
    }
    
    /**
     *avoid override answers when save to the temporary file 
     * @param ans
     */
    public void maintainAnswer (Answer ans) {
        answerBundle[index] = ans;
        index = index + 1;
    }
    /***
     * question answer save to local disk to temporary
     * @param quesNo
     * @param ans 
     */
    public void saveProAnswer (int quesNo, Answer ans) {
        try {
            FileOutputStream fileOut = null;
            fileOut = new FileOutputStream(new File("D:\\mathsmasterTemp\\ans"+quesNo+".iq"));
            ObjectOutputStream outputStm = new ObjectOutputStream(fileOut);
            outputStm.writeObject(ans);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TempanswerService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TempanswerService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
