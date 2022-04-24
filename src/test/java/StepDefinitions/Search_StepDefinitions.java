package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Search_StepDefinitions {
    String thirdTitle1, thirdTitle2, tenthTitle;

    @Given("^navigate to (.*)$")
    public void navigate(String url) {
        Hooks.driver.navigate().to("https://www.youtube.com/");

    }

    @When("^search by (.*) Keyword$")
    public void search_by_Keyword(String keyword) {
        Hooks.homePage.Send_Search_Data(keyword);

    }

    @And("click on filters button")
    public void click_on_filters_button() throws InterruptedException {
        Hooks.homePage.Click_Filter_Button();
        Thread.sleep(2000);

    }

    @Then("click on Video under the Type tab")
    public void click_on_Video_under_the_Type_tab() throws InterruptedException {

        Hooks.homePage.play_video(0);
        Thread.sleep(2000);
    }

    @And("get the title of the third video in results")
    public void get_the_title_of_the_third_video_in_results() {
        thirdTitle1 = Hooks.homePage.Get_Third_video_title();
        System.out.println(thirdTitle1);
    }

    @And("click the third video")
    public void click_the_third_video() {
        Hooks.driver.navigate().back();
        Hooks.homePage.play_video(2);

    }

    @And("assert that the video title in step 5 is the same title in step 6")
    public void assert_that_the_video_title_in_step_5_is_the_same_title_in_step_6() {
        thirdTitle2 = Hooks.homePage.Get_video_Title(2);
        Assert.assertTrue(thirdTitle1.contains(thirdTitle2));
    }
    @And("^get the title of the (.*) th video in results$")
    public void get_the_title_of_the_10th_video_in_results(int index) throws InterruptedException {
        tenthTitle= Hooks.homePage.Get_video_Title(index-1);
        System.out.println(tenthTitle);
    }
    @And("assert that the video title in step 5 is the same title in step 6 Scenario3")
    public void assert_that_the_video_title_in_step_5_is_the_same_title_in_step_6_Scenario3(){
        System.out.println(thirdTitle1);
        System.out.println(thirdTitle2);
        Assert.assertTrue(tenthTitle.contains(thirdTitle1));
    }
}
