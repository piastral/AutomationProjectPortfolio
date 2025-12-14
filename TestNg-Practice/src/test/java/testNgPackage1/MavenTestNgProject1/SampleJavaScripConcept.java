package testNgPackage1.MavenTestNgProject1;
// this is the hiearcchy of webdriver 
 interface Web {
	
	
}
   interface JavaScripty{
	   
   }
   
	class Remote  implements Web , JavaScripty {
	                         
		public void display() {
			System.out.println("i am B");
		}
	}
		class Chroma extends Remote{
			
			}
		
	
	
public 	class SampleJavaScripConcept{
	public static void main(String[] args) {
	 Web obj = new Chroma();
	 JavaScripty js =(JavaScripty) obj;
		
		
		
	   }
	}
	
	
