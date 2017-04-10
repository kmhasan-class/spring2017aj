/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.contactapp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author kmhasan
 */
@FacesValidator("validator.phoneValidator")
public class PhoneValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String input = (String) o;
        String patternString = "(\\+88)?01[1[5-9]]\\d{8}";
        
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.matches()) {
            System.out.println("We found a match! " + matcher.group());
            System.out.println("Starts at " + matcher.start());
            System.out.println("End at " + matcher.end());
        } else {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Phone number is not valid");
            throw new ValidatorException(fm);
        }        
    }
    
}
