package seleniumGridWithDockerMode;

public class SeleniumGridDockerIntroduction {
/*============================SELENIUM GRID 4 --DOCKER MODE 
 * IN DOCKER MODE ALSO WE CAN USE 4 GRID EXECUTION MODES 
 * 1)Standalone mode 
 * 2)Hub And Node Mode 
 * 3)Fully Distributed Mode 
 * 
 * Traditional virtual machines need physical hardware which is iften costly and not 
 * feasible when larger automation test suite execution need to execute 
 * regularly(1000s of test )
 * 
 * Docker Mode helps us to use the Docker containers to execute on smae machine which are 
 * light weight and do not involve Additional Hardware .
 * ===========================================================================
 * 
 * DOCKER FUNDAMENTALS FOR SELENIUM JAVA AUTOMATION (SELENIUM GRID )
 * 
 * 1) WHAT IS DOCKER ??
 * ANSWER==>> Docker is a containerization platform(Widely used in devops) Docker helps us to package the applicartion
 * with everything i need (code,libraries,tools,setting,) into single container that can run anywehere 
 * 
 * ---Imagineit like sealed lunchbox 
 * -no mater where youu take it(your laptop ,server ,cloud machinde )
 * -the food(app) iside stays the same and works the same 
 * ---------------------------------------------------------------
 * WHY DOCKER IS USED IN SOFTWARE PROJECTS??
 * ANSWER==> orks everywhere : No it works on my machine issue"
 * --> docker ensures that application run the same way across diffeent environment(dev,test,staging,prod)
 * reducing the" it works on my machine" problem 
 * 
 * Faster setup :: one cmoannd and ready to go 
 * 
 * Easy testing : spin up the continers to test in clean envo
 * 
 * lightweight : uses fewer resource than traditional virual machines ,if docker is installed in computer for memory like ram it uses 
 * computer memory,but in case of tradional we need to deploy the hardware why can be very expensive and may not be scalable 
 * 
 * Scalabilty :: easily scalable 
 * 
 * 
 * 
 * 
 * 
 * ==============================================================================================================================
 * 2) DOCKER SOFTWARE INSTALLATION 
 * Docker Desktop Installation 
 * 
 * 
 * 3)DOCKER IMAGE 
 * =->> A docker image is lughtweight ,standalone andxecutable software package that includes everything needed
 * to run an application
 * 1) The Application Code 
 * 2) Runtime(like java ,python ,node.js)
 * 3) libraries and dependecies 
 * 4)Configuration files 
 * 5) Environment Variables
 * 6) Shell script if any 
 * 
 * Think of a docker image as snapshot or blueprint of your app environment 
 * Once the Docker image is created ,we can use it to un the containers 
 * 
 * 
 * 
 * 4)DOCKER CONTAINER  (The image of all depdecies will be packaged and will be executed inside Container)
 * 
 * ==>> A docker  container is a lightweight  ,standalone and executable unit of software that packages up code 
 * and all the dependencies so the application runs quickly and reliable across different computing environment 
 * 
 * KEY POINTS :
 * 
 * 1) COntainers run the same way everywhere: wheater it the my laptop ,a test server or cloud server -containers
 * elimante the "" it works only on my machine problem""
 * 
 * 2)Lightweight : unlike vm conatiners dont need full OS each instance ,they share host system OS WHICH MAKES
 * them fast and efficent 
 * 
 * 3)Isloated: each container is isolated from the rese so we can run mutliple apps on the same machiner 
 * without any conflict
 * =========================================================================
 * Example For automation tester 
 * we caan run pur selenium grid - Browser and test scripts in different containers .
 * This makes our test environment portable and easy to replicate acroos teams or machines 
 * 
 * Image is like image (software package) and containers is actuall instance which runs the image 
 * 
 * 
 * 
 * 5)DOCKER HUB
 * docker hub is like playstore or appstore but for Docker containers we can host docker containers in docker hub
 * USING DOCKER HUB WE CAN DO THE FOLLOWING 
 * 1)SEARCH FOR CONTAIINER IMAGES (LIEK SELENIUM/STANDALONE -CHROME)
 * 2) Create an account 
 * 3) Mnage my public/private reposiories 
 * 4)push/pull docker images 
 * 
 * 
 * 
 * 
 * 6)DOCKER COMMANDS - BASICS SYNTAX docker <command> like docker run
 * =====================================
 *  run -->        Create and run a new container from an image
  exec    -->    Execute a command in a running container
  ps          List containers
  build       Build an image from a Dockerfile
  bake        Build from a file
  pull        Download an image from a registry
  push        Upload an image to a registry
  images      List images
  login       Authenticate to a registry
  logout      Log out from a registry
  search      Search Docker Hub for images
  version     Show the Docker version information
  info        Display system-wide information
 * 
 *============================================================================
 *Execution time can be expressed as a simple formula:

Number of Tests  * Average Test Time / Number of Nodes = Total Execution Time
 *
 *
 *
 * 15      *       45s        /        1        =      11m 15s   // Without Grid
   15      *       45s        /        5        =      2m 15s    // Grid with 5 Nodes
   15      *       45s        /        15       =      45s       // Grid with 15 Nodes
  100      *       120s       /        15       =      13m 20s   // Would take over 3 hours without Grid 
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
