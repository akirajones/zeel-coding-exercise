package api;

import org.junit.Assert;
import org.junit.Test;
import patientdata.PatientId;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;


public class ApiTest  {

    @Test
    public void getPatientData() {
        given().queryParam("api_key","01081709141341820990101").
                when().
                get("https://iezapt5vu6.execute-api.us-east-1.amazonaws.com/test/patient").
                then().log().body();
    }

    @Test
    public void getPatientDataAppointmentJune2022() {
        given().queryParam("api_key","01081709141341820990101").
                when().
                get("https://iezapt5vu6.execute-api.us-east-1.amazonaws.com/test/patient").
                then().
                assertThat().body("appointment_date", hasItem("2022-06-20")).
                log().body();
    }

    @Test
    public void getPatientDataSteveRogers() {
        given().queryParam("api_key","01081709141341820990101").
                when().
                get("https://iezapt5vu6.execute-api.us-east-1.amazonaws.com/test/patient").
                then().
                assertThat().body("id", hasItem("SR19760827202206208364")).

                log().body();
    }

    @Test
    public void verifyPatientIdFormat() {

        PatientId id =
                given().queryParam("api_key","01081709141341820990101").
                        when().
                        get("https://iezapt5vu6.execute-api.us-east-1.amazonaws.com/test/patient").
                        as(PatientId.class);

        Assert.assertEquals(id,id.getFirstName()+id.getLastName()+id.getBirthdate());

    }





    }
