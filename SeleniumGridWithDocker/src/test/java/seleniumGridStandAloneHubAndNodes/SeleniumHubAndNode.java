package seleniumGridStandAloneHubAndNodes;

public class SeleniumHubAndNode {
/* hub and node mode -run test on grid
 * 1) hub and node in same machines with different set of port number 
 * hub is the place where test execution gets managed 
 * and the actual test run on the node
 * 2)hub and nodes on different machine real time process can be done same say first one 
 * 
 * 	Distributed mode -different machines to configure each of them 
 * --> event bus, new session queue,session map,distributor ,router ,node(s)
 * ====================================================********************================
 * hub should start first 
 * HUB NODE- DOCUMENTATION
 * STARTING HUB 
 * APPROACH -1 ==> hUB IS STARTED -DISPLAYS IP ADD
 *    command ==========>> java -jar selenium-server-4.34.0.jar hub
 *    
 *    Approach 2 hide the ip and show the ip in tcp info message
 *    commmand =========> java -jar selenium-server-4.34.0.jar hub --host localhost 
 *    
 *    Approach 3-- hub is started and the results are stored in log file  will not show in command prompt will saved in where my server is
 *    command ====> java -jar selenium-server-4.34.0.jar hub --host localhost > selenium-hub.log
 *    
 *   -------------------------------------------------------------------------------------------------
 *   example log messages in the selenium-hub.log file-<ip address> removed intenionally 
 *   =======================================================================================STARTING NODE NOW
 *   OPEN THE COMMAN PROMPT AND HUB COMMAND PROMPT SHOULD BE ACTIVE 
 *   
 *   APPROACH -1 ==> NODE IS STARTED -DISPLAYS IP ADD
 *    command ==========>> java -jar selenium-server-4.34.0.jar node
 *    
 *     Approach 2 hide the ip and show the ip in tcp info message
 *    commmand =========> java -jar selenium-server-4.34.0.jar node --host localhost 
 *    
 *    
 * Approach 3-- node is started -hide the ip address and enables selenium manager for grid 
 *    command ====> java -jar selenium-server-4.34.0.jar node --host localhost --selenium-manager true'
 *    === the hub will have node 
 *    
 *    =================================================================
 *    i need to add the second node 
 *    adding the second node in port6666 ,open another command prompt 
 *    java -jar selenium-server-4.34.0.jar node --port 6666 --host localhost --selenium-manager true
 *    // IF THERE IS 3 NODE AND CAPACITY OF THE COMPUTER IS 8 PROCESSOR 
 *    THAT MEAN EACH NODE WILL HAVE 8 SESSION CAN BE OPEN THAT MEANS 3 NODE * 24 SESSION CAN BE OPEN AT A TIME OR RUN PARALLEY  	
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
 * 
 * 
 * 	
 */

}
