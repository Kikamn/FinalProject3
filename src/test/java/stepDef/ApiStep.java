package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;
    public ApiStep(){
        this.apiPage = new ApiPage();
    }

    @Given("Prepare URL valid for {string}")
    public void prepareURLValidFor(String url) { apiPage.prepareURLValidFor(url);
    }

    @And("Hit API get list data")
    public void hitAPIGetListData() { apiPage.hitAPIGetListData();
    }

    @Then("Validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int statusCode) { apiPage.validationStatusCodeIsEquals(statusCode);
    }

    @Then("Validation response body get list user")
    public void validationResponseBodyGetListUser() { apiPage.validationResponseBodyGetListUser();
    }

    @Then("Validation response json whit JSONSchema {string}")
    public void validationResponseJsonWhitJSONSchema(String fileJSON) { apiPage.validationResponseJsonWhitJSONSchema(fileJSON);
    }
}
