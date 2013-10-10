package edu.sjsu.cmpe.unilinks;

import static spark.Spark.get;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.Request;
import spark.Response;
import spark.Route;
import edu.sjsu.cmpe.unilinks.resources.UniversityObject;
import freemarker.template.Configuration;
import freemarker.template.Template;


public class UniversityService
{
	public static void main(String[] args) 
	    {
		try{
			
			get(new Route("/unilinks") {
				Configuration cfg = new Configuration();
		          @Override
		          public Object handle(Request request, Response response){
		        	  
		        	  StringWriter file = null;
		        	  String queryParam = request.queryString();
		        	  String uname;
		        	  try{
		        		  file = new StringWriter();
		            	  cfg.setDirectoryForTemplateLoading(new File("templates"));
		                  // load template
		                  Template template = cfg.getTemplate("tables.ftl");   
		                  	                  
		                  // data-model
		                  Map<String, Object> input = new HashMap<String, Object>(); 		
		                  // create list
		                  List<UniversityObject> universityObject = new ArrayList<UniversityObject>();
		                  input.put("Hello","Welcome to Unilinks");
		                  template.process(input,file);
		                  if(queryParam == null)
		            	  {        	  
		            	 }
		            	 else
		            	 {
		            		 uname = queryParam.substring((queryParam.indexOf("=")+1),queryParam.indexOf("&"));
		            		 String name = uname;
		            		 if(queryParam.contains("submit"))
		            		 {
		            			 if(name.toUpperCase().equals("SJSU"))
		            			 {
		            				 UniversityObject uo = new UniversityObject();
		            				 uo.setSchoolName("San Jose State University");
		            				 uo.setDepartment("Computer Science");
		            				 uo.setLocation("San Jose");
		            				 uo.setContact("One Washington Square,San Jose, CA 95192 408-924-1000");
		            				 uo.setGreScore(94);
		            				 uo.setIeltsScore(6.5);
		            				 uo.setToeflScore(110);	
		            				 uo.setTuitionFees("$7500");
		            				 uo.setFallApplnDate("12August2013");
		            				 uo.setSpringApplnDate("12Jan2013");		            				 		            				 
		            				 universityObject.add(uo);
		            				 
		            			 }
		            			 if(name.toUpperCase().equals("HARVARD"))
		            			 {
		            				 UniversityObject uoone = new UniversityObject();
		            				 uoone.setSchoolName("Harvard University");
		            				 uoone.setDepartment("Computer Science");
		            				 uoone.setLocation("Cambridge, MA");
		            				 uoone.setContact("Massachusetts Ave, Cambridge, MA 02138");
		            				 uoone.setGreScore(321);
		            				 uoone.setIeltsScore(7.8);
		            				 uoone.setToeflScore(80);	
		            				 uoone.setTuitionFees("$42292");
		            				 uoone.setFallApplnDate("15December2013");
		            				 uoone.setSpringApplnDate("NA");
		            				 
		            				 universityObject.add(uoone);
		            				 
		            			 }
		            			 if(name.toUpperCase().equals("PRINCETON"))
		            			 {
		            				 UniversityObject uoone = new UniversityObject();
		            				 uoone.setSchoolName("Princeton University");
		            				 uoone.setDepartment("Computer Science");
		            				 uoone.setLocation("Princeton, NJ");
		            				 uoone.setContact("Princeton University, Princeton, NJ- 08540");
		            				 uoone.setGreScore(324);
		            				 uoone.setIeltsScore(6.5);
		            				 uoone.setToeflScore(100);	
		            				 uoone.setTuitionFees("$40170");
		            				 uoone.setFallApplnDate("15December2014");
		            				 uoone.setSpringApplnDate("NA");
		            				 
		            				 universityObject.add(uoone);
		            				 
		            			 }
		            			 if(name.toUpperCase().equals("COLUMBIA"))
		            			 {
		            				 UniversityObject uoone = new UniversityObject();
		            				 uoone.setSchoolName("Columbia University");
		            				 uoone.setDepartment("Computer Science");
		            				 uoone.setLocation("New York, NY");
		            				 uoone.setContact("535 W 116th St, New York, NY 10027");
		            				 uoone.setGreScore(317);
		            				 uoone.setIeltsScore(7.8);
		            				 uoone.setToeflScore(96);	
		            				 uoone.setTuitionFees("$49138");
		            				 uoone.setFallApplnDate("15December2013");
		            				 uoone.setSpringApplnDate("NA");
		            				 
		            				 universityObject.add(uoone);
		            				 
		            			 }
		            			 if(name.toUpperCase().equals("YALE"))
		            			 {
		            				 UniversityObject uoone = new UniversityObject();
		            				 uoone.setSchoolName("Yale University");
		            				 uoone.setDepartment("Computer Science");
		            				 uoone.setLocation("New Haven, CT");
		            				 uoone.setContact("New Haven, CT 06520");
		            				 uoone.setGreScore(327);
		            				 uoone.setIeltsScore(7.8);
		            				 uoone.setToeflScore(100);	
		            				 uoone.setTuitionFees("$44000");
		            				 uoone.setFallApplnDate("02January2014");
		            				 uoone.setSpringApplnDate("NA");
		            				 
		            				 universityObject.add(uoone);
		            				 
		            			 }
						 if(name.toUpperCase().equals("UCBerkeley"))
						     {
                                                         UniversityObject uoone = new UniversityObject();
                                                         uoone.setSchoolName("University of California at Berkeley");
                                                         uoone.setDepartment("Computer Science");
                                                         uoone.setLocation("Berkeley, CA");
                                                         uoone.setContact("101 Sproul Hall, Berkeley, CA 94704 ");
                                                         uoone.setGreScore(320);
                                                         uoone.setIeltsScore(8.5);
                                                         uoone.setToeflScore(100);
                                                         uoone.setTuitionFees("$39845");
                                                         uoone.setFallApplnDate("15December2013");
                                                         uoone.setSpringApplnDate("NA");

                                                         universityObject.add(uoone);

						     }
		            			 if(name.toUpperCase().equals("STANFORD"))
		            			 {
		            				 UniversityObject uoone = new UniversityObject();
		            				 uoone.setSchoolName("Stanford University");
		            				 uoone.setDepartment("Computer Science");
		            				 uoone.setLocation("Stanford, CA");
		            				 uoone.setContact("450 Serra Mall, Stanford, CA 94305 ");
		            				 uoone.setGreScore(324);
		            				 uoone.setIeltsScore(8.5);
		            				 uoone.setToeflScore(100);	
		            				 uoone.setTuitionFees("$43245");
		            				 uoone.setFallApplnDate("15December2013");
		            				 uoone.setSpringApplnDate("NA");
		            				 
		            				 universityObject.add(uoone);
		            				 
		            			 }
		            			 
		            			 input.put("universityObject",universityObject );
		                         template.process(input, file);
		                         
		                         
		            		 }
		            	 }
		                  
		                  
		        	  }catch(Exception e){System.out.print(e.getMessage());}
		        	  
		        	  return file;
		          }
				
			});
			
		}catch(Exception e){System.out.println(e.getMessage());}
           
	    }
	
}


