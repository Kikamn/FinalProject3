Feature: Testing API DUMMYAPI IO

  @api
  Scenario: User can get in API
    Given Prepare URL valid for "GET_USER"
    And Hit API get list data
    Then Validation status code is equals 200
    Then Validation response body get list user
    Then Validation response json whit JSONSchema "get_list_user.json"
    
  @api
  Scenario: User can post / crate in API
    Given Prepare URL valid for "POST_USER"
    And Hit API Post user
    Then Validation status code is equals 200
    Then Validation response body post new user
    Then Validation response json whit JSONSchema "post_new_user.json"

  @api
    Scenario: User can put / update with user id in api
    Given Prepare URL valid for "VALID_USER"
    And Hit API update data user
    Then Validation status code is equals 200
    Then Validation response body update user new

  @api
  Scenario: User can delete in API
    Given Prepare URL valid for "POST_USER"
    And Hit API Post user
    Then Validation status code is equals 200
    Then Validation response body post new user
    And Hit API delete user
    Then Validation status code is equals 404
