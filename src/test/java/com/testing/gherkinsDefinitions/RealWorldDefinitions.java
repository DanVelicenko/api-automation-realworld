package com.testing.gherkinsDefinitions;

import com.testing.serenitySteps.RealworldSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

import java.io.IOException;

public class RealWorldDefinitions {

  @When("^the user creates an account with following data:$")
  public void theUserCreatesAnAccountWithFollowingData(DataTable dataTable) throws IOException {
    RealworldSteps.createAnAccount(dataTable);
  }

  @When("^the user logs into account with following data:$")
  public void theUserLogsIntoAccountWithFollowingData(DataTable dataTable) throws IOException {
    RealworldSteps.logIntoAccount(dataTable);
  }

  @When("^the user updates the settings using the following data:$")
  public void theUserUpdatesTheSettingUsingTheFollowingData(DataTable dataTable) throws IOException {
    RealworldSteps.updateSettings(dataTable);
  }

  @When("^the user creates a post using the following data:$")
  public void theUserCreatesAPostUsingTheFollowingData(DataTable dataTable) throws IOException{
    RealworldSteps.createPost(dataTable);
  }

  @When("^the user modifies the post using the following data:$")
  public void theUserModifiesThePostUsingTheFollowingData(DataTable dataTable) throws IOException {
    RealworldSteps.modifyPost(dataTable);
  }

  @When("^the user adds a comment to the post with the following data:$")
  public void theUserAddsACommentToThePostWithTheFollowingData(DataTable dataTable) throws IOException{
    RealworldSteps.postComment(dataTable);
  }

  @When("^the user deletes the comment$")
  public void theUserDeletesTheComment() throws IOException { RealworldSteps.deleteComment();
  }
}
