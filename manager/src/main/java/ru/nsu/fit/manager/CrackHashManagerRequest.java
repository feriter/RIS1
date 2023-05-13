package ru.nsu.fit.manager;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "partNumber",
    "partCount",
    "hash",
    "maxLength",
    "alphabet"
})
@XmlRootElement(name = "CrackHashManagerRequest")
public class CrackHashManagerRequest {

    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "PartNumber")
    protected int partNumber;
    @XmlElement(name = "PartCount")
    protected int partCount;
    @XmlElement(name = "Hash", required = true)
    protected String hash;
    @XmlElement(name = "MaxLength")
    protected int maxLength;
    @XmlElement(name = "Alphabet", required = true)
    protected CrackHashManagerRequest.Alphabet alphabet;

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
     * Gets the value of the partCount property.
     * 
     */
    public int getPartCount() {
        return partCount;
    }

    /**
     * Sets the value of the partCount property.
     * 
     */
    public void setPartCount(int value) {
        this.partCount = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     */
    public void setMaxLength(int value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the alphabet property.
     * 
     * @return
     *     possible object is
     *     {@link Alphabet }
     *     
     */
    public Alphabet getAlphabet() {
        return alphabet;
    }

    /**
     * Sets the value of the alphabet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alphabet }
     *     
     */
    public void setAlphabet(Alphabet value) {
        this.alphabet = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "symbols"
    })
    public static class Alphabet {

        protected List<String> symbols;

        public List<String> getSymbols() {
            if (symbols == null) {
                symbols = new ArrayList<String>();
            }
            return this.symbols;
        }

    }

}
