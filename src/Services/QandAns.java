/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import java.io.Serializable;

/**
 *
 * @author budar
 */
public class QandAns implements Serializable {
    private String qno;
    private String question;
    private String answer;

    /**
     * This class use for question and answers for databse 
     * @param qno
     * @param question
     * @param answer
     */
    public QandAns(String qno, String question, String answer) {
        this.qno = qno;
        this.question = question;
        this.answer = answer;
    }

    /**
     *get question number 
     * @return question number 
     */
    public String getQno() {
        return qno;
    }

    /**
     *get question 
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     *get true value of answer from database 
     * @return answer 
     */
    public String getAnswer() {
        return answer;
    }
}
