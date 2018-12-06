package helpers;

import org.apache.commons.lang3.RandomStringUtils;


public class DataGenerator {

    private int computerNameLength;
    private String computerNameValue = "  ";

    public void setRandomGeneratedString(int length)
    {
        computerNameLength = length;
        if (computerNameLength > 0)
        {
            this.computerNameValue = "SJTest" + RandomStringUtils.randomAlphanumeric(length);
            this.computerNameLength = length + computerNameValue.length();
        }

        //CreateComputerPage.computerName.sendKeys(computerNameValue);
    }

    public String getRandomGeneratedString(){
        return this.computerNameValue;
    }

    public int getRandomGeneratedStringLength(){
        return this.computerNameLength;
    }

}
