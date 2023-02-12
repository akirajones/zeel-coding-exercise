package patientdata;

import com.fasterxml.jackson.annotation.*;

@JsonPropertyOrder({"firstName", "lastName", "birthdate"})
public class PatientId {

    private String firstName;
    private String lastName;
    private String birthdate;
    private String patientId;

    @JsonProperty("firstName")
    public String getFirstName(){
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName(){
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @JsonProperty("birthdate")
    public String getBirthdate(){
        return birthdate;
    }

    @JsonProperty("birthdate")
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

    @JsonProperty("id")
    public String getPatientId(){
        return patientId;
    }

    @JsonProperty("id")
    public void setPatientId(String patientId){
        this.patientId = patientId;
    }



}