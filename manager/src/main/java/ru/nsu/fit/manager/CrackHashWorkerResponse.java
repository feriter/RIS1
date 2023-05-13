package ru.nsu.fit.manager;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "partNumber",
    "answers"
})
@XmlRootElement(name = "CrackHashWorkerResponse")
public class CrackHashWorkerResponse {

    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "PartNumber")
    protected int partNumber;
    @XmlElement(name = "Answers", required = true)
    protected CrackHashWorkerResponse.Answers answers;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     */
    public void setPartNumber(int value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link Answers }
     *     
     */
    public Answers getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Answers }
     *     
     */
    public void setAnswers(Answers value) {
        this.answers = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "words"
    })
    public static class Answers {

        protected List<String> words;

        public List<String> getWords() {
            if (words == null) {
                words = new ArrayList<String>();
            }
            return this.words;
        }

    }

}
