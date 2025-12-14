package seleniumGridStandAloneHubAndNodes;

public class SeleniumGridIntroductionClass {
/*Selenium GRID DOCKER ::
 * ============================================================================================
 * Run automation test cases in parallel mode across multiple machines ,browsers, and operating sysytem 
 * browser supported ::==>
 * ==> chrome , firefox ,edge 
 * ===? safari is only supported in macos 
 * visit offcial website for selenium grid Documen tation
 * https:://www.selenium.dev/
 * ========================================SELENIUM GRID : UPGRADED TO SUPPORT 4 DIFFERENT MODES==============================
 * 1) STAND ALONE MODE :: IF YOU ARE RUNNING TEST LOCALLY(IN ONLY ONE COMPUTER)
 * =======================================================****************************=============================
 * [[
 * Dwnload selenium server jar from seelenium offcial website 
 * 
 * run the command in the cmd 
 * and check in the browser -selenium grid ui -https://localhost:4444/
 * 
 * APPROACH=1 IP IS DISPLAYED in command prompt result java-jar selenium-server-4.34.0.jar standalone
 * ---> it will start the selenium grid ad display the ip address::4444 port 
 * 
 * approach 2 ==> HIDING THE IP ADDRESS AND DISPLAY LOCALHOST IN PLACE OF IP 
 * COMMAND==> java-jar selenium-server-4.34.0.jar standalone --host localhost
 * --> slenium grid is started in the localhost (which is same as Ip address mode,but ip address value is masked for the privacy reason)
 * 
 * important note** depending on my cpu power that many host or processor will open up 
 * currently my system support 8 processor THANT MEANS I CAN RUN 8 INSTANCES OR MACHINES VIRTUALLY INDIVIDUALLY FOR CHROME,FIRFOX,EDGE
 * AND FOR INTENTER EXPLORER ILL BE ALLOCATED ONLY ONE INSTANCE 	
 * if i want my selenium to take care about selenium manager like system properties we need to enable true 
 * if in my system chrome browser,firfox browser or edge browser is ther it will automatically add
 * ===============================================================================================================
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
 * 
 * 
 * 
 * ]]
 * 
 * 2) HUB -NODE MODE :: IF YOU ARE RUNNING TEST ON MULTIPLE MACHINES 
 * 
 * 3) FULLY DISRIBUTED MODE ( EACH COMPONENET RUNS INDEPENDENTLY ,IMPROVING RELIABILTY :: AND MICROSERVICES BASED EXECUTION TO RUN TEST
 * IN LARGE SCALE ENVO
 * 
 * 4) DOCKER MODE(CONTAINERIZED GRID) :: IF WE WANT CONTANERIZED EXECUTION FOR CID/CD PIPELINES ,CLOUD ENVO OR KUBERNETES
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Introduction to selenium grid::
 * ANS:: Selenium grid is component of selenium which helps us to run  multiple test cases on a remote
 * machine ,lets using webdriver reference we are writing test cases in our local machine 
 * with selenium grid we can run on multiple browser simultanesly on different remotre machine
 * =============================================================================================
 * ------------------------------------------------------
 * lets say  there are 100 test case we want to execute and while executing in our local machine
 * it will take almost 3 hrs but running this test case in remote machine parrelly will reduce the 
 * time clutter ,so basically while using remote server ill dstribute 10 test cases per machine
 * and lets say in remotely we use 100 machine so techinally 10 test case will be covered in so less time 
 * -------------------------------------------------
 * so we can run in multiple browser ,multiple operating system
 * ----------------------------------------------------------------
 * 
 * So how it works ?
 * so will have hub machine and all the other remote machine will be connected so we can call them as node
 * and we can also configure our remote machine in our own way by using different os different browser 
 * -----------------------------------------------------------------------------
 * Docker :: it is an open source platform by which we can develop the script and deploy our application 
 * as container,using docker we can create any application and we can deploy that to container 
 * ------------------------------------------------------------------------------------------
 * WHY WE NEED DOCKER TO DEPLOY THE TEST CASE 
 * so when devloper finish developing some new features of an application in their own dev 
 * environment ..and push it to qa environment for testing purpose ,sometimes it creates anamoly 
 * because of different enviroment,so thats reaseon using docker container we remove all the obstacles 
 * developer can the provide the supporting library ,suppoting confguration all is provided in the docker
 * containier and than the docker conatiner is provided to testing team wehere tester will conduct the 
 * testing in docker container this remove so much anamoly 
 * container wont be having os it will be shared from the hub machine
 * and also the container are so much lightweight
 * --------------------------------------------------------------------------------------------
 *  so rather having multiple virtual machine we can have docker container 
 *  were the main container will be used as selenium hub and the rest container will be added as node
 *  we can create multiple container with docker 
 *  1-we can docker container as selenium hub (port 4445) and connect to multiple docker container 2,3,4 
 *  so we need port number and VNC NMBER  will be available for the linkage by linking all the docker container 
 *  we have to maintain that all the containers are using the same network 
 * ------------------------+++++++++++++++++++++++++++----------------------------------
 * 
 * SETUP SELENIUM GRID WITH DOCKER PRACTICALLY 
 * ==============================================================
 * 1-) PULL IMAGES 
 *   - Pull Selenium Hub Image --->docker pull selenium/hub
 *   - Pull node-chrome-debug Image ---> docker pull selenium/node-chrome-debug 
 *   -Pull selenium/node-firefox-debug --->docker pull selenium/node-chrome-debug 
 *   
 *   {{{ we will import evrything from docker marketplace and will use vnc number 
 * {{ so basically we will use docker image and we will use the selenium hub as host 
 * ---> so docker pull command is [[ docker pull selenium/hub]]  <--- imp point every image will have tag associated
 * 
 * 	
 * 2- START NETWORK 
 *  -docker  network create gridNetwork
 *  
 *  3- CREATE AND RUN THE CONTAINERS AND LINK THEM ... if we dont want directly pull image we can also use below cmnd
 *     -HUB--> docker run -d -p 4445:4444 --net gridNetwork --name seleniumHub  selenium/hub
 *   
 *   now ill use node container port and connect via vnc to see what my nodes are doing 
 *    --> docker run -d -p 4446:5990 --net gridNetwork -e HUB_HOST=seleniumHub --name chromeNode selenium/node-chrome-debug 
 *    ==========================================================================================================================
 *  ============================================================================================================================  
 *  
 */

}
