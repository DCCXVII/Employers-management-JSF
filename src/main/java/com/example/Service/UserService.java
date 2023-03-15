package com.example.Service;

import com.example.Controllers.Employer;
import com.example.Messages.Errors;
import com.example.Messages.Messages;
import com.example.dal.UserDao;

import jakarta.enterprise.inject.Model;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;

@Model
public class UserService {
    @Inject
    FacesContext facesContext;

    @Inject
    Errors errors;
    Messages messages;

    @Inject
    @ManagedProperty(value="#{employer}")

   
    
    private Employer employer; 
    @Inject
    private UserDao userDAO;

    public String check(){
        if(userDAO.authenticate(employer.getEmail(),employer.getPassword())){
               return "app";
        }else{
            FacesMessage ErrorCredentials = new FacesMessage(errors.getWrongCredentials());
            facesContext.addMessage("form_employer:employer", ErrorCredentials);
            return "login";
        }
        
    }

    

    public String insertEmployer() {
        if (userDAO.addEmployer(employer.getId(), employer.getName(), employer.getEmail(), employer.getPassword())) {
            FacesMessage employerAddedSuccessfully = new FacesMessage(messages.getEmployer_Added_successfully());
            facesContext.addMessage("form_add_employer:addEmployer", employerAddedSuccessfully);
            System.out.println("Inserted");
        } else {
            FacesMessage errorAddEmployer = new FacesMessage(errors.getWrongCredentials());
            facesContext.addMessage("form_add_employer:addEmployer", errorAddEmployer);
            System.out.println("Failed to Insert");
        }
        return "add_employer.xhtml?faces-redirect=true";
    }
    
}
