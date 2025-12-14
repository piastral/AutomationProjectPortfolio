package pack1.CucumberFramework;

public class Bdd {
	
/*Q-1) WHAT IS CUCUMBER WHAT ARE THE ADVANTAGES OF CUCUMBER?/
 * ANS: cucumber is test approach which supports behavior driven development it offerrs away tp write
 * test case that anyone can understand 
 * 
 * ADVANTAGE OF CUCUMBER FRAMEWORK;;;;>>
 * 1- HELPFUL to involve business stakeholders who cant easily read and understand the code
 * 2- cucmber testting focuses on end user experience 
 * 3- we can write specificiation in more than 40 languages 
 * 4-style of writing test allow for eaier reuse of code in the test 
 * 5- we can use tags to organize and group the scenarios 
 * 6-quick and easy set up execution 
 * 7-efficient tool for testing
 * 
 * --------------------------------------------------------------------------
 * Q->>WHY WE NEED CUCUMBER??
 * ANS most software projects involve people from tec background and non tech background 
 * specially the stakeholders so high quality communicaton is required between then but when are using 
 * different testing approach like daata driven testing with test ng in that case non tech person 
 * cannot understand ,so we approach it by cuucmber 
 * cuucmber  usses gherkin language similar to english language every test scenario is written in 
 * gherkin  language ,so everyone can easily undertand that what is happening under particular test 
 * scenario
 * ----------------------------------------------------------------------------------
 * Q-->>what should you know before to write test cases with cucumber 
 * ans:: 1- Bdd; 2- gherkin 3-different keyword we use in gherkin
 * 4- main components of cucmber 
 * 5-options avaialble in cucumber 
 * 6-feature file 7-scenario and scenaio outline 8-cucumber works 
 * ----------------------------------------------------------------------------------------------
 * Q--> WHEN CUCUMBER USED IN REAL TIME?
 * AMS: cucumber is used to write user acceptance test of any applictaion it is basically used by non
 * tech person such as BA ,
 * 
 * Q-> name tow build tools can be integrated with cucumber?
 * ans::MAVEN,GRADLE
 * Q-->NAME TWO TESTING FRAMEWORK CAN BE IINTEGRATE WITH CUCMBER 
 * ANS: HYBRID,
 * 
 * Q->ARE THERE ANY READYMADE SELENIUM CUCUMBER FRAMEWORK AVAILABLE 
 * ANS: YES, EasyB is bdd framework written in GROOVY
 * 
 * Q-
 * 
 * 
-----------------------------------------------------------------------------------------------------------
 * important point to remmember ..
 * when we initilize the priority on testcase ,that test will be exectured
 *  first
 * else depending upon the alphabetical order it will execute lets "a" is first will execute first 
 * -----------------------------------------------------------------
 * 2-when we are grouping some methods in one different class using the resuable method for regression 
 * or smoke we can do grouping by explicitylt mention this test case belong to certain suite lets say
 * regression or smoke or both 
 * so in eclipse while on run configuratuion we can browse for groups and whatever we want to select 
 * lets say regression that perticular test case will execute which belongs to this group.
 * we can only run with that particular test case in run as ...run configuration
 * 
----------------------------------------------------------------------------------------------------------

  cucumber is tool through which we can achieve BDD 
 * MAIN COMPONENET OF CUCMBER ::-->>>>
 * do you work in cucmber ,can you tell me what all files required in cucumber 
 * ans::in cucumber we have feature file,STEP-DEFINATION -FILE ::TEST RUNNER FILE
 *----------------------------------------------------------------------------------------
 *1-In FEATURE-FILE:: 
 *
 *we used to write scenario in gherkin language which is most like in plain english
 *here we use some keyword like feature,scenario,outline,given,when,then andexample background keywords 
 *for writing tes scenario steps
 *
 *GIVEN >> - precondition (for example facebook .com login functionalty )
 *so we will create one feature folder under the project and can store multiple files in this folder
 *(.feature is extension of feature file)
 *and than you create two package one is stepdefination and one is runner and you create clas for that 
 *and whatever you will print for login.feature in console you will get methods just implement those method
 *in stepDefination class by copying those methods and use ctrl+shift+o will remove all the errors
 *----------------------------------------------------------------------------------------------------------------
 *2-IN STEP-DEFINATION-FILE ::we write mapping code for all scenarios of feature file 
 *
 *3:-IN TEST-RUNNER-FIlE ::we provide the address of the feautre file,step defination file,and all 
 *important tags ,plugins,listeners in that all using annotation @Runwith @cucumber Options
 *-------------------------------------------------------------------------------------------------
 *WHAT IS THE DIFFERENCE BETWEEN SCENARIO AND SCEARIO OUTLINE?
 *----------------------------------------------------
 *when we have single scenario and we need to run in one time at that place we use scenario 
 *if we want some parmetirizatiin or data driven testing at the time we can use scenario outline where 
 *we have to use example keyword like if we are running this scenario for 3 different data set like 
 *username &pass ,it will run 3 times
 *--------------------------------------------------------------------------------------------------------------
 *
 *
 *
 *WHAT IS DRY RUN  IN TEST RUNNER?
 *-----------------------------------------
 *dry run is not running our whole applilcation,it will check wheather all features are mapped with step
 *defination
 *------------------------------------------------------------------------------------------------------
 *WHAT IS CUCUMBER TAGS??
 *------------------------------------
 *ans :: tags in cucmber are keyword that is given to features files to cover all the different functionality 
 *lets say we got many different feature files that cover all different functionality of the application
 *now there can be certain situation in the project where we like to execute just smoke test regression test
 *
 *so in that case we use tags 
 *basically we can take two approach 
 *1- we start creating new feature file with the name of the type like smoketest.feature or 
 *regressiontest.feature
 *
 *2-we can define each sceario with usefule tag later in runner file we can decide which specific tag we 
 *want cucumber to execute 
 *syntax:cucumber options ={"@smokeTests or @RegressionTests"}
 *-----------------------------------------------------------------------------------------------------------
 *
 *WHAT IS BACKGROUND KEYWORD??
 *-----------------------------------------
 *ANS:: background keyword is used to define steps that are common to all the test in the feature,suppose
 *we have pre condtion that we have to check this before each scenario .so in order to avoid rewriting same
 *step we can write in background
 *it is used to avoid repetitve scenarios for better readibilty 
 *
 * file.for example to purchase a product ,we eed to do some steps 
 * 1-navigate to home page 
 * 2-click on the login link
 * 3-enter username and password
 * 4-click on submit button 
 * 
 * these test common for all test so instead of eriting them agai and again for all test we can move it under 
 * the background keyword .
 * syntAX::
 * feature :Add to cart 
 * this feature will test functionality of adding different products to the user basket from different flow
 * 
 * BACKGROUND: USER IS LOGGIED in
 * SCENARIO:search product and add the firt result to the user basket
 * GIVEN: USER SEARCH FOR LENOVO
 * WHEN : ADD THE FIRST LAPTOO THAT APPEARS IN THE SEARCH result to the basket
 * Than ::user basket should display with 1 item 
 *
 *---------------------------------------------------------------------------------------------------------
 *
 * WHAT ARE THE HOOKS>
 * ----------------------------------------------------------------
 * In cucumber we use hooks for common funcionalities ,hooks are like we want to run before and after 
 * each of the scenario .In hooks we have two different  annotations @before,@after which run before 
 * and after of each sceanrio .Also @beforestep ,@Afterstep which run before and after each step
 * 
 * cucumber hooks allows us to better manage the code workflow and helps us to reduce the code redundancy
 * we can say that it is an unseen step which allows us to perform our scenario or test 
 * 
 * Hooks are block of code that runs before OR after each scenario 
 * hooks in cuucmber are like listeners in testNg 
 * Listeners(In testNG there are listeneres where we can have set-up and tear-down that runs before and after
 * each test or class similarly we have hooks in cuucmber )
 * so we call them 
 * ::scenario hooks -which runs beofre and after each scenario
 * Step hooks :: runs befor and after each step 
 * Conditional hooks - this hooks associated with tags for conditional execution 
 * 
 * WHY TO USE HOOKS 
 * -------------------------------
 * TO manage the setup and teardown 
 * to avoid rewriting the coomn setup or teardown actions 
 * Allow better managementof code workflow 
 * 
 * WHEN TO USE :??
 * Whenever we have some common setup and teardown actions to be execturd before eqch scenario 
 * 
 * 
 * 
 * 
 * 
 *
 *
 * 
 * 
 * 
 * 	
 */

}
